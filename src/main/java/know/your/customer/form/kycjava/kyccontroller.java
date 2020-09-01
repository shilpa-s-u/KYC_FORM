package know.your.customer.form.kycjava;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.Vector;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class kyccontroller {
	@Autowired
	kycservice camp;
	List<kyc> temp;
	HttpSession session;
	@RequestMapping("/begin")
	public ModelAndView initiate()
	{
		ModelAndView mod=new ModelAndView("one");
		mod.addObject("user", "shilpa s u");
		
		return mod;
	}
	@RequestMapping("/second")
	public ModelAndView second()
	{
		return new ModelAndView("second");
	}
	
	
	@RequestMapping("/")
	public ModelAndView login()
	{
		return new ModelAndView("index");
	}
	@RequestMapping(value="/log",method=RequestMethod.POST)
	public ModelAndView home(@RequestParam("user") String user, @RequestParam("pass") String pass, HttpServletRequest request)
	{
		if(user.equalsIgnoreCase("kyc")&&pass.equalsIgnoreCase("shimoga"))
		{
			session=request.getSession();
			session.setAttribute("user", user);
			return new ModelAndView("home");
		}
		else {return new ModelAndView("index").addObject("msg", "Invalid Credentials");}
	}
	
	
	@RequestMapping("/add")
	public ModelAndView askEnroll()
	{
		
		return new ModelAndView("enroll");
		
	}
	@RequestMapping(value="/added",method=RequestMethod.POST)
	public ModelAndView enrolled(@Validated kyc kyc,BindingResult res)
	{
		
		if(res.hasErrors()) {return new ModelAndView("enroll"); }
		camp.insert(kyc);
		return new ModelAndView("enroll").addObject("msg", "customer Enrolled");
	
	}

	@RequestMapping("/list")
	public ModelAndView display()
	{
		if(session.getAttribute("user")!=null) 
		{
	 temp=camp.showAll();
		return new ModelAndView("show").addObject("every", temp);
		}
		else {return new ModelAndView("index");}
	}
	
	@RequestMapping("/update")
	public ModelAndView info(@RequestParam("id") Long id)
	{
		if(session.getAttribute("user")!=null) {
		return new ModelAndView("letting").addObject("fetched", camp.readOne(id));}
		else {return new ModelAndView("index");}
	}
	@RequestMapping(value="/alter",method=RequestMethod.POST)
	public ModelAndView alter(kyc kyc)
	{
		if(session.getAttribute("user")!=null)
		{
		camp.change(kyc);
		return display().addObject("msg", kyc.getPlace()+" Updated SuccessFully");}
		else {return new ModelAndView("index");}
	}
	@RequestMapping("/remove")
	public ModelAndView flush(@RequestParam("id") Long id)
	{
		if(session.getAttribute("user")!=null)
		{
		kyc can=camp.readOne(id);
		String got=camp.erase(can);
		return display().addObject("msg", got+" Deleted Successfully");
		}
		else {return new ModelAndView("index");}
		}
	
	@RequestMapping("/find")
	public ModelAndView search()
	{
		if(session.getAttribute("user")!=null) {
	return new ModelAndView("search");}
		else {return new ModelAndView("index");}
		
	}
	@RequestMapping(value="/fetch",method=RequestMethod.POST)
	public ModelAndView reads(@RequestParam("customer_id") String customer_id,@RequestParam("scheme") String scheme)
	{

		if(session.getAttribute("user")!=null)
		{
		temp=new Vector<kyc>();
			if(!customer_id.equals("")&&scheme.equals("Select Any scheme"))
			{
				kyc tmp=camp.readOne(Long.parseLong(customer_id));
				temp.add(tmp);
			}
			else if(customer_id.equals("")&&!scheme.equals("Select Any scheme"))
			{
				temp=camp.fetchViascheme(scheme);
				
			}
			
			return new ModelAndView("show").addObject("every", temp);}
		else {return new ModelAndView("index");}
		}
	@RequestMapping("/report")
	public ModelAndView rep(@RequestParam("form") String form)
	{
		if(session.getAttribute("user")!=null)
		{
			ModelAndView mod=new ModelAndView("show");
			System.out.println("Before report calls"+temp);
			String get=camp.generate(temp, form);
			mod.addObject("every", temp);
			mod.addObject("msg", get);
			System.out.println("Done in report navigate back to show with "+temp);
			return mod;
		}
		else {return new ModelAndView("index");}
		
	}
	@RequestMapping("/home")
	public ModelAndView home()
	{
		
		
			return new ModelAndView("home");
		
	}
	@RequestMapping("/logout")
	public ModelAndView loggingOut()
	{
		
		return new ModelAndView("index").addObject("msg", "Loggedout successfully");
	}
}

package know.your.customer.form.kycjava;
import java.util.List;
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
		List<kyc> temp=camp.showAll();
		return new ModelAndView("show").addObject("every", temp);
	}
	
	@RequestMapping("/update")
	public ModelAndView info(@RequestParam("id") Long id)
	{
		return new ModelAndView("letting").addObject("fetched", camp.readOne(id));
	}
	@RequestMapping(value="/alter",method=RequestMethod.POST)
	public ModelAndView alter(kyc kyc)
	{
		camp.change(kyc);
		return display().addObject("msg", kyc.getPlace()+" Updated SuccessFully");
	}
	@RequestMapping("/remove")
	public ModelAndView flush(@RequestParam("id") Long id)
	{
		kyc can=camp.readOne(id);
		String got=camp.erase(can);
		return display().addObject("msg", got+" Deleted Successfully");
	}
	@RequestMapping("/find")
	public ModelAndView search()
	{
		return new ModelAndView("search");
	}
	
}

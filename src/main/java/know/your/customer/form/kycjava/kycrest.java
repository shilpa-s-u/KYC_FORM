package know.your.customer.form.kycjava;
import java.util.List;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class kycrest {
	@Autowired
	kycservice service;
	@PostMapping("/addViaBody")
	public kyc insViaBody(@RequestBody kyc kyc)
	{
		return service.insert(kyc);
	}
	@GetMapping("/display")
	public List<kyc> listing()
	{
		return service.showAll();
	}
	@GetMapping(value="/displayAsXml",produces="application/xml")
	public List<kyc> listingAsXml()
	{
		return service.showAll();
	}
	@PutMapping("/modify")
	public kyc modify(@RequestBody kyc kyc)
	{
		return service.change(kyc);
	}
	@DeleteMapping("/del")
	public String clean(@RequestBody kyc kyc)
	{
		return service.erase(kyc);
	}
	

	@GetMapping("/fetch/{constrain}/{data}")// /fetch/scheme/SB
	public List<kyc> find(@PathVariable("constrain") String constrain,@PathVariable("data") String data)
	{
		List<kyc> temp=new Vector<kyc>();
		if(constrain.equalsIgnoreCase("customer_id"))
		{
			temp.add(service.readOne(Long.parseLong(data)));
		}
		else if(constrain.equalsIgnoreCase("scheme"))
		{
			temp=service.fetchViascheme(data);
		}
	
		return temp;
	}
}

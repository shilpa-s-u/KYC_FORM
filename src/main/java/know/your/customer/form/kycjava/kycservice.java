package know.your.customer.form.kycjava;
import java.util.List;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class kycservice {
	@Autowired
	kycrepo repo;
	public kyc insert(kyc kyc)
	{
		return repo.save(kyc);
	}
	public List<kyc> showAll()
	{
		return repo.findAll();
	}
	public kyc readOne(Long customer_id)
	{
		return repo.getOne(customer_id);
	}
	public kyc change(kyc kyc)
	{
		return repo.save(kyc);
	}
	public String erase(kyc kyc)
	{
		String get=kyc.getName_of_depositor();
		repo.delete(kyc);
		return get;
	}
	public List<kyc> fetchViascheme(String sch)
	{
		return repo.getByscheme(sch);
	}
	public String generate(List<kyc> can,String format)
	{
		File fgen=null;
        String hai="";
		try
		{
			File file = ResourceUtils.getFile("classpath:post2020report.jrxml");
	        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
	        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(can);
	        Map<String, Object> parameters = new HashMap<>();
	        parameters.put("createdBy", "shilpa s u");
	        parameters.put("createdFor", "DLithe Consultancy Services");
	        System.out.println("Received @ report end before writing "+can);
	        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
	        if (format.equalsIgnoreCase("html")) {
	        	fgen=new File("kyc.html");
	            JasperExportManager.exportReportToHtmlFile(jasperPrint, fgen.getAbsolutePath());
	        }
	        if (format.equalsIgnoreCase("pdf")) {
	        	fgen=new File("kyc.pdf");
	            JasperExportManager.exportReportToPdfFile(jasperPrint, fgen.getAbsolutePath());
	        }
	        hai="Report generated @ "+fgen.getAbsolutePath();
	        System.out.println("Received @ report end after writing "+can);
		}
		catch(JRException j)
		{j.printStackTrace();} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hai;
	}
}

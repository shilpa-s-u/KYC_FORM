package know.your.customer.form.kycjava;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
}

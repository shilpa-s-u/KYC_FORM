package know.your.customer.form.kycjava;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface kycrepo extends JpaRepository<kyc, Long>{
	@Query("from kyc where scheme= :sch")
	public List<kyc> getByscheme(String sch);

}

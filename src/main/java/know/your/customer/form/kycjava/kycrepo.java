package know.your.customer.form.kycjava;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
@Repository
public interface kycrepo extends JpaRepository<kyc, Long>{
	@Query("from candidates where customer_id= :id")
	public List<kyc> getBycustomer_id(Integer id);

}

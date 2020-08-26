package know.your.customer.form.kycjava;
import java.sql.Date;
import com.sun.istack.NotNull;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class kyc implements Serializable {
	@Id
	private Long customer_id;
	@NotNull
	private String scheme;
	@NotNull
	private String name_of_depositor;
	@NotNull
	private String address;
	@NotNull
	private Date date_of_birth;
	@NotNull
	private Long pan_no;
	@NotNull
	private String proof_of_identity;
	@NotNull
	private String proof_of_address;
	@NotNull
	private String place;
	@NotNull
	private String signature_of_depositor;
	@NotNull
	private String signature_of_postmaster;
	public Long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	public String getScheme() {
		return scheme;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	public String getName_of_depositor() {
		return name_of_depositor;
	}
	public void setName_of_depositor(String name_of_depositor) {
		this.name_of_depositor = name_of_depositor;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public Long getPan_no() {
		return pan_no;
	}
	public void setPan_no(Long pan_no) {
		this.pan_no = pan_no;
	}
	public String getProof_of_identity() {
		return proof_of_identity;
	}
	public void setProof_of_identity(String proof_of_identity) {
		this.proof_of_identity = proof_of_identity;
	}
	public String getProof_of_address() {
		return proof_of_address;
	}
	public void setProof_of_address(String proof_of_address) {
		this.proof_of_address = proof_of_address;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getSignature_of_depositor() {
		return signature_of_depositor;
	}
	public void setSignature_of_depositor(String signature_of_depositor) {
		this.signature_of_depositor = signature_of_depositor;
	}
	public String getSignature_of_postmaster() {
		return signature_of_postmaster;
	}
	public void setSignature_of_postmaster(String signature_of_postmaster) {
		this.signature_of_postmaster = signature_of_postmaster;
	}
	public kyc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public kyc(Long customer_id, String scheme, String name_of_depositor, String address, Date date_of_birth,
			Long pan_no, String proof_of_identity, String proof_of_address, String place, String signature_of_depositor,
			String signature_of_postmaster) {
		super();
		this.customer_id = customer_id;
		this.scheme = scheme;
		this.name_of_depositor = name_of_depositor;
		this.address = address;
		this.date_of_birth = date_of_birth;
		this.pan_no = pan_no;
		this.proof_of_identity = proof_of_identity;
		this.proof_of_address = proof_of_address;
		this.place = place;
		this.signature_of_depositor = signature_of_depositor;
		this.signature_of_postmaster = signature_of_postmaster;
	}
	@Override
	public String toString() {
		return "kyc [customer_id=" + customer_id + ", scheme=" + scheme + ", name_of_depositor=" + name_of_depositor
				+ ", address=" + address + ", date_of_birth=" + date_of_birth + ", pan_no=" + pan_no
				+ ", proof_of_identity=" + proof_of_identity + ", proof_of_address=" + proof_of_address + ", place="
				+ place + ", signature_of_depositor=" + signature_of_depositor + ", signature_of_postmaster="
				+ signature_of_postmaster + "]";
	}
	
	
	
}

package Project.Supplementry.Userdetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Transaction")
public class Transaction {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="txn-id")
	private int txnid;
	@Column(name="date")
	private int date;
	@Column(name="txnamount")
	private int txnamount;
	@Column(name="paymentmethod")
	private String paymentmethod;
	
	@ManyToOne
    @JoinColumn(name="user_id")
    private Userdetails user;
	
	
	
	
	public Userdetails getUser() {
		return user;
	}
	public void setUser(Userdetails user) {
		this.user = user;
	}
	public int getTxnid() {
		return txnid;
	}
	public void setTxnid(int txnid) {
		this.txnid = txnid;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getTxnamount() {
		return txnamount;
	}
	public void setTxnamount(int txnamount) {
		this.txnamount = txnamount;
	}
	public String getPaymentmethod() {
		return paymentmethod;
	}
	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}
	
}

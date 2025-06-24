package Project.Supplementry.Userdetails;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Userdetails")

public class Userdetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name="user_id")
	private int id;
	@Column(name="first_name")
	private  String firstname;
	 @Column(name="last_name")
	private  String lastname;
	 @Column(name="username")
	private String username;
	 @Column(name="password")
	private String password;
	 @Column(name="phoneno")
	private  String phoneno;
	 @Column(name="email")
	private  String email;
	 
	 @OneToMany
	 @JoinColumn(name="user_id")
	 private List<BankAccount> accounts = new ArrayList<>();
	 
	 
	 
	 
	 
	 public List<BankAccount> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
		
	}

}
	
	
package Project.Supplementry.Admin;

import java.time.LocalDate;
import java.util.List;

import Project.Supplementry.Userdetails.Userdetails;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="Orders")
public class Orders {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	@Column(name="order_id")
	private int Orderid;
	@Column(name="date")
	private LocalDate date;
	@Column(name="price")
	private int price;
	
	@ManyToOne
    @JoinColumn(name="user_id")
    private Userdetails user;
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<Product> products;


    public Userdetails getUser() {
		return user;
	}
	public void setUser(Userdetails user) {
		this.user = user;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	
	public int getOrderid() {
		return Orderid;
	}
	public void setOrderid(int orderid) {
		Orderid = orderid;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

}

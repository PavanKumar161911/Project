package Project.Supplementry.Admin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 
	@Column(name="product_id")
	private int productid;
	@Column(name="product_name")
	private String productname;
	@Column(name="colour")
	private String colour;
	@Column(name="weight")
	private float weight;
	
	 @ManyToOne
	    @JoinColumn(name="order_id")
	    private Orders order;
	
	
	public Orders getOrder() {
		return order;
	}
	 public void setOrder(Orders order) {
		 this.order = order;
	 }
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	

}

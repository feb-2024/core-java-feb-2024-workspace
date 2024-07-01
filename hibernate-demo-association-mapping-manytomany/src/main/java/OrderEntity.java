import java.sql.Date;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class OrderEntity {
	@Id
	@Column(name="orderNumber")
	private int orderNumber;
	
	@Column(name="orderDate")
	private Date orderDate;
	
	@Column(name="status")
	private String orderStatus;
	
	@ManyToMany
	@JoinTable(name = "orderdetails", 
				joinColumns = {@JoinColumn(name="orderNumber")},
				inverseJoinColumns = { @JoinColumn(name="productCode") })
	private List<ProductEntity> allProducts;

	public OrderEntity() {}

	public OrderEntity(int orderNumber, Date orderDate, String orderStatus, List<ProductEntity> allProducts) {
		super();
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.allProducts = allProducts;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public List<ProductEntity> getAllProducts() {
		return allProducts;
	}

	public void setAllProducts(List<ProductEntity> allProducts) {
		this.allProducts = allProducts;
	}

	@Override
	public int hashCode() {
		return Objects.hash(allProducts, orderDate, orderNumber, orderStatus);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderEntity other = (OrderEntity) obj;
		return Objects.equals(allProducts, other.allProducts) && Objects.equals(orderDate, other.orderDate)
				&& orderNumber == other.orderNumber && Objects.equals(orderStatus, other.orderStatus);
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "OrderEntity [orderNumber=" + orderNumber + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus
				+ ", allProducts="
				+ (allProducts != null ? allProducts.subList(0, Math.min(allProducts.size(), maxLen)) : null) + "]";
	}
	
	
	
}

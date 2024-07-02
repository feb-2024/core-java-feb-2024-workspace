import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class ProductEntity {
	@Id
	@Column(name="productCode")
	private String productCode;
	
	@Column(name="productName")
	private String productName;
	
	@Column(name="productLine")
	private String productLine;

	@ManyToMany(mappedBy = "allProducts")
	private List<OrderEntity> allOrders;
	
	public ProductEntity() {}

	public ProductEntity(String productCode, String productName, String productLine, List<OrderEntity> allOrders) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productLine = productLine;
		this.allOrders = allOrders;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductLine() {
		return productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public List<OrderEntity> getAllOrders() {
		return allOrders;
	}

	public void setAllOrders(List<OrderEntity> allOrders) {
		this.allOrders = allOrders;
	}

	@Override
	public int hashCode() {
		return Objects.hash(allOrders, productCode, productLine, productName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductEntity other = (ProductEntity) obj;
		return Objects.equals(allOrders, other.allOrders) && Objects.equals(productCode, other.productCode)
				&& Objects.equals(productLine, other.productLine) && Objects.equals(productName, other.productName);
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "ProductEntity [productCode=" + productCode + ", productName=" + productName + ", productLine="
				+ productLine + ", allOrders="
				+ (allOrders != null ? allOrders.subList(0, Math.min(allOrders.size(), maxLen)) : null) + "]";
	}
}

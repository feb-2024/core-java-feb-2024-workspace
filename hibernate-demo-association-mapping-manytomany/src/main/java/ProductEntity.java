import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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

	public ProductEntity() {}

	public ProductEntity(String productCode, String productName, String productLine) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productLine = productLine;
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

	@Override
	public int hashCode() {
		return Objects.hash(productCode, productLine, productName);
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
		return Objects.equals(productCode, other.productCode) && Objects.equals(productLine, other.productLine)
				&& Objects.equals(productName, other.productName);
	}

	@Override
	public String toString() {
		return "ProductEntity [productCode=" + productCode + ", productName=" + productName + ", productLine="
				+ productLine + "]";
	}

	
}

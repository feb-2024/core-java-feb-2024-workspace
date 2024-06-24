import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeEntity {
	
	@Id
	@Column(name="emp_id")
	private int empId;
	
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="emp_contact")
	private String empContact;
	
	@Column(name="emp_dept_id")
	private int empDeptId;

	public EmployeeEntity() {}

	public EmployeeEntity(int empId, String empName, String empContact, int empDeptId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empContact = empContact;
		this.empDeptId = empDeptId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpContact() {
		return empContact;
	}

	public void setEmpContact(String empContact) {
		this.empContact = empContact;
	}

	public int getEmpDeptId() {
		return empDeptId;
	}

	public void setEmpDeptId(int empDeptId) {
		this.empDeptId = empDeptId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empContact, empDeptId, empId, empName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeEntity other = (EmployeeEntity) obj;
		return Objects.equals(empContact, other.empContact) && empDeptId == other.empDeptId && empId == other.empId
				&& Objects.equals(empName, other.empName);
	}

	@Override
	public String toString() {
		return "EmployeeEntity [empId=" + empId + ", empName=" + empName + ", empContact=" + empContact + ", empDeptId="
				+ empDeptId + "]";
	}
}

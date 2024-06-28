import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeEntity {

	@Id
	@Column(name="emp_id")
	private int employeeId;
	
	@Column(name="emp_name")
	private String employeeName;
	
	@Column(name="emp_contact")
	private String employeeContact;
	
	@ManyToOne
	@JoinColumn(name="emp_dept_id")
	private DepartmentEntity deptEntity;

	public EmployeeEntity() {}

	public EmployeeEntity(int employeeId, String employeeName, String employeeContact, DepartmentEntity deptEntity) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeContact = employeeContact;
		this.deptEntity = deptEntity;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeContact() {
		return employeeContact;
	}

	public void setEmployeeContact(String employeeContact) {
		this.employeeContact = employeeContact;
	}

	public DepartmentEntity getDeptEntity() {
		return deptEntity;
	}

	public void setDeptEntity(DepartmentEntity deptEntity) {
		this.deptEntity = deptEntity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(deptEntity, employeeContact, employeeId, employeeName);
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
		return Objects.equals(deptEntity, other.deptEntity) && Objects.equals(employeeContact, other.employeeContact)
				&& employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName);
	}

	@Override
	public String toString() {
		return "EmployeeEntity [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeContact="
				+ employeeContact + ", deptEntity=" + deptEntity + "]";
	}
}

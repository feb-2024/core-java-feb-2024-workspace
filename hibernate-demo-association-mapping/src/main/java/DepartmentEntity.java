import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="department")
public class DepartmentEntity {
	
	@Id
	@Column(name="dept_id")
	private int deptartmentId;
	
	@Column(name="dept_name")
	private String departmentName;
	
	@OneToMany(mappedBy="deptEntity")
	private List<EmployeeEntity> allEmp;

	public DepartmentEntity() {}

	public DepartmentEntity(int deptartmentId, String departmentName, List<EmployeeEntity> allEmp) {
		super();
		this.deptartmentId = deptartmentId;
		this.departmentName = departmentName;
		this.allEmp = allEmp;
	}

	public int getDeptartmentId() {
		return deptartmentId;
	}

	public void setDeptartmentId(int deptartmentId) {
		this.deptartmentId = deptartmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<EmployeeEntity> getAllEmp() {
		return allEmp;
	}

	public void setAllEmp(List<EmployeeEntity> allEmp) {
		this.allEmp = allEmp;
	}

	@Override
	public int hashCode() {
		return Objects.hash(allEmp, departmentName, deptartmentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DepartmentEntity other = (DepartmentEntity) obj;
		return Objects.equals(allEmp, other.allEmp) && Objects.equals(departmentName, other.departmentName)
				&& deptartmentId == other.deptartmentId;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "DepartmentEntity [deptartmentId=" + deptartmentId + ", departmentName=" + departmentName + ", allEmp="
				+ (allEmp != null ? allEmp.subList(0, Math.min(allEmp.size(), maxLen)) : null) + "]";
	}	
}

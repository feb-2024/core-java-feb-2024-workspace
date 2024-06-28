import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class HibernateDemo2 {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.giveSessionFactory();
		Session session = sessionFactory.openSession();
		DepartmentEntity deptEntity = session.get(DepartmentEntity.class, 503);
		System.out.println("Department ID : " + deptEntity.getDeptartmentId());
		System.out.println("Department Name : "+ deptEntity.getDepartmentName());
		System.out.println("List of employees...");
		List<EmployeeEntity> allEmps = deptEntity.getAllEmp();
		allEmps.forEach((eachEmp)-> {
			System.out.println("----------------------------------");
			System.out.println("Employee ID : " + eachEmp.getEmployeeId());
			System.out.println("Employee Name : " + eachEmp.getEmployeeName());
			System.out.println("Employee Contact : " + eachEmp.getEmployeeContact());
			System.out.println("----------------------------------");
		});
		session.close();
		sessionFactory.close();
	}

}

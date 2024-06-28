import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateDemo {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.giveSessionFactory();
		Session session = sessionFactory.openSession();
		EmployeeEntity empEntity = session.get(EmployeeEntity.class, 101);
		System.out.println("Employee Name : " + empEntity.getEmployeeName());
		System.out.println("Employee ID : " + empEntity.getEmployeeId());
		System.out.println("Employee Contact : " + empEntity.getEmployeeContact());
		System.out.println("Department ID : " + empEntity.getDeptEntity().getDeptartmentId());
		System.out.println("Department Name : " + empEntity.getDeptEntity().getDepartmentName());
		//System.out.println("Entire Employee Entity : " + empEntity);
		session.close();
		sessionFactory.close();
	}
}

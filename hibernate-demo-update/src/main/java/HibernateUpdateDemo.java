import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateUpdateDemo {

	public static void main(String[] args) {
		// 1. SessionFactory
		System.out.println("Going to obtain SessionFactory...");
		SessionFactory sessionFactory = HibernateUtil.giveSessionFactory();
		
		// 2. Session
		System.out.println("Going to open session...");
		Session session = sessionFactory.openSession();
		
		// 3. Transaction begin
		System.out.println("Going to begin transaction...");
		session.beginTransaction();
		
		// 4. perform the update operation
		// this is a 2 step process
		// first: fetch the employee to updated with id
		System.out.println("Going to fethc employee with id 106...");
		EmployeeEntity fetchedEntity = session.get(EmployeeEntity.class, 106);
		
		// second: change the value in the enityt object and update the object
		System.out.println("Going to set employee contact...");
		fetchedEntity.setEmpContact("1234522222");
		System.out.println("Going to update the entity object...");
		session.merge(fetchedEntity);
		
		// 5. Transaction commit
		System.out.println("Going to commit the transaction...");
		session.getTransaction().commit();
		
		// 6. Close the session and sesionFactory
		System.out.println("Going to close session and sessionFactory...");
		session.close();
		sessionFactory.close();
	}
}

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateDeleteDemo {

	public static void main(String[] args) {
		// 1. Get the session factory from HibernateUtil
		System.out.println("Going to obtain SessionFactory...");
		SessionFactory sessionFactory = HibernateUtil.giveSessionFactory();
		
		// 2. Open a session from the sessionFactory
		System.out.println("Going to open Session...");
		Session session = sessionFactory.openSession();
		
		// 3. Begin a transaction on the session
		System.out.println("Going to begin transaction...");
		session.beginTransaction();
		
		// 4. Do the delete operation
		// this is a 2 step process
		// first : fetch the employee with the id
		System.out.println("Going to fetch employee with ID 105...");
		EmployeeEntity fetchedEmployee = session.get(EmployeeEntity.class, 105);
		// second : remove the employee entity object
		System.out.println("Going to remove the entity object...");
		session.remove(fetchedEmployee);
		
		// 5. commit the transaction
		System.out.println("Going to commit the transaction...");
		session.getTransaction().commit();
	
		// 6. close session and sessionFactory
		System.out.println("Going to close Session and SessionFactory...");
		session.close();
		sessionFactory.close();
		
	}

}

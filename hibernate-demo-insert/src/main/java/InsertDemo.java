import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class InsertDemo {

	public static void main(String[] args) {
		// 1. obtain the session factory
		System.out.println("Going to obtain SessionFactory...");
		SessionFactory sessionFactory = HibernateUtil.giveSessionFactory();
		
		// 2. From the session factory, open a session
		System.out.println("Going to open the Session...");
		Session session = sessionFactory.openSession();
		
		try(sessionFactory;session){
			// 3. begin the transaction in that session
			System.out.println("Going to start the Transaction...");
			session.beginTransaction();
		
			// 4. perform the insert operation
			System.out.println("Going to persist Entity object...");
			EmployeeEntity empEntity = new EmployeeEntity(106, "aaa", "1234566666", 503);
			session.persist(empEntity);
			
			// 5. commit the transaction
			System.out.println("Going to commit the transaction...");
			session.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

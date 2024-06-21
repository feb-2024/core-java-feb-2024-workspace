import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
// this class is for configuring hibernate with connection url, username, password
public class HibernateUtil {
	static SessionFactory sessionFactory;
	static {
		Configuration cfg = new Configuration();
		
		Properties props = new Properties();
		props.put(Environment.URL, "jdbc:mysql://localhost:3306/demodb");
		props.put(Environment.USER, "root");
		props.put(Environment.PASS, "root");
		props.put(Environment.SHOW_SQL, true);
		props.put(Environment.FORMAT_SQL, true);
		props.put(Environment.HBM2DDL_AUTO, "validate");
		
		cfg.setProperties(props);
		cfg.addAnnotatedClass(EmployeeEntity.class);
		sessionFactory = cfg.buildSessionFactory();
	}
	
	public static SessionFactory giveSessionFactory() {
		return sessionFactory;
	}
}

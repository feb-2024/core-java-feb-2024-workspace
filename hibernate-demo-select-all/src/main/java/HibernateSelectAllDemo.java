import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;
import org.hibernate.query.criteria.JpaRoot;

import jakarta.persistence.criteria.CriteriaQuery;

public class HibernateSelectAllDemo {

	public static void main(String[] args) {
		// 1.
		SessionFactory sessionFactory = HibernateUtil.giveSessionFactory();
		
		// 2.
		Session session = sessionFactory.openSession();
		
		// 3. perform the select operation to fetch all the records
		// can be done in 3 ways
		// first way : using JPQL
		List<EmployeeEntity> allEmployees = session.createQuery("SELECT e FROM EmployeeEntity e", EmployeeEntity.class).getResultList();
		System.out.println("Fetching all employees using JPQL...");
		allEmployees.forEach((eachEmp) -> System.out.println(eachEmp));
		
		// second way : using Criteria API
		HibernateCriteriaBuilder cb = session.getCriteriaBuilder();
		JpaCriteriaQuery<EmployeeEntity> cq = cb.createQuery(EmployeeEntity.class);
		JpaRoot<EmployeeEntity> rootEntry = cq.from(EmployeeEntity.class);
		CriteriaQuery<EmployeeEntity> all = cq.select(rootEntry);
		
		List<EmployeeEntity> allEmp = session.createQuery(all).getResultList();
		
		System.out.println("Fetching all employees using Criteria API...");
		allEmp.forEach((eachEmp)->System.out.println(eachEmp));
		
		// third way : using Native SQL
		String sqlQuery = "select * from employee";
		NativeQuery<EmployeeEntity> query = session.createNativeQuery(sqlQuery, EmployeeEntity.class);
		
		List<EmployeeEntity> allEmploy = query.list();
		System.out.println("Fetching all employees using Native SQL...");
		allEmploy.forEach((eachEmp)->System.out.println(eachEmp));
		// 4. close the session and sessionFactory
		session.close();
		sessionFactory.close();

	}

}

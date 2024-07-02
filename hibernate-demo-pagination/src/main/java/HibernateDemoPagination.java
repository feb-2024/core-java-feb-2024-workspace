import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class HibernateDemoPagination {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.giveSessionFactory();
		Session session = sessionFactory.openSession();
		
		// calculate the pagination parameters
		int pageNumber = 2; // try changing this to 2 and then 3
		int pageSize = 5;
		int firstResult = (pageNumber - 1) * pageSize;
		
		// fetch products using HQL
		String hql = "FROM ProductEntity";
		Query query = session.createQuery(hql);
		
		query.setFirstResult(firstResult);
		query.setMaxResults(pageSize);
		
		List<ProductEntity> someProducts = query.list();
		someProducts.forEach((eachProd)-> {
			System.out.println("Product ID : " + eachProd.getProductCode());
			System.out.println("Product Name : " + eachProd.getProductName());
			System.out.println("---------------------------------------------");
		});
		
	}

}

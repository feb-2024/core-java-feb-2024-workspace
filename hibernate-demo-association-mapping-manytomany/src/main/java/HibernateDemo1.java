import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateDemo1 {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.giveSessionFactory();
		Session session = sessionFactory.openSession();
		OrderEntity fetchedOrder = session.get(OrderEntity.class, 10100);
		System.out.println("Display order information...");
		System.out.println("Order Number : " + fetchedOrder.getOrderNumber());
		System.out.println("Order Date : " + fetchedOrder.getOrderDate());
		System.out.println("Order Status : " + fetchedOrder.getOrderStatus());
		List<ProductEntity> orderProducts = fetchedOrder.getAllProducts();
		System.out.println("Products in the order 10100 are...");
		orderProducts.forEach((eachProd)->{
			System.out.println("Product Code : " + eachProd.getProductCode());
			System.out.println("Product Name : " + eachProd.getProductName());
			System.out.println("Product Line : " + eachProd.getProductLine());
			System.out.println("----------------------------------------------");
		});
		session.close();
		sessionFactory.close();
	}
}

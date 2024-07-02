import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateDemo2 {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.giveSessionFactory();
		Session session = sessionFactory.openSession();
		ProductEntity prodEntity = session.get(ProductEntity.class, "S10_1678");
		System.out.println("Product Code : " + prodEntity.getProductCode());
		System.out.println("Product Name : " + prodEntity.getProductName());
		System.out.println("Product Line : " + prodEntity.getProductLine());
		List<OrderEntity> allOrders =  prodEntity.getAllOrders();
		allOrders.forEach((eachOrder)->{
			System.out.println("Order Number : " + eachOrder.getOrderNumber());
			System.out.println("Order Date : " + eachOrder.getOrderDate());
			System.out.println("Order Status : " + eachOrder.getOrderStatus());
			System.out.println("----------------------------------");
		});
	}
}

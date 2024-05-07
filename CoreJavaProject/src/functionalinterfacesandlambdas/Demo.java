package functionalinterfacesandlambdas;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Demo {

	public static void main(String[] args) {
		System.out.println("1) Conventional way");
		//Addition add1 = new Addition();
		Operation add1 = new Addition();
		System.out.println("SUM : " + add1.operate(4, 5));
		
		Operation product1 = new Multiplication();
		System.out.println("PRODUCT : " + product1.operate(2, 5));
		System.out.println("-----------------------------");
		
		System.out.println("2) Anonymous classes");
		Operation add2 = new Operation() {
			@Override
			public int operate(int a, int b) {
				return (a+b);
			}
		};
		System.out.println("SUM : " + add2.operate(40, 55));
		
		Operation product2 = new Operation() {
			@Override
			public int operate(int a, int b) {
				return (a*b);
			}
		};
		System.out.println("PRODUCT : " + product2.operate(12, 5));
		System.out.println("-----------------------------");
		
		System.out.println("3) Lambda expressions");
		
		Operation add3 = (a, b) -> a + b;	
		System.out.println("SUM : " + add3.operate(10, 20));
		
		Operation product3 = (x, y) -> x * y;
		System.out.println("PRODUCT : " + product3.operate(10, 5));
		
		System.out.println("-----------------------------");
		
		System.out.println("INBUILT FUNCTIONAL INTERFACE");
		BiFunction<Integer, Integer, Integer> add4 = (m, n)-> m + n;
		System.out.println("SUM : " + add4.apply(5, 25));
		
		//2. Write a Java program to implement a lambda expression to check if a given string is empty.
		Predicate<String> check1 = (str) -> str.isEmpty() ;
		System.out.println("string is empty? " + check1.test("hello"));
		System.out.println("string is empty? " + check1.test(""));
	
	}

}
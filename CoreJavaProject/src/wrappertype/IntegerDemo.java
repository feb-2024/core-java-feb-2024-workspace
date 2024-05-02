package wrappertype;

public class IntegerDemo {

	public static void main(String[] args) {
		Integer itr1 = new Integer(40);
		Integer itr2 = new Integer("40");
		Integer itr3 = 40; // recommended
		System.out.println(itr1);
		System.out.println(itr2);
		System.out.println(itr3);
		
		double dbl = itr3.doubleValue();
		System.out.println(dbl);
		float flt = itr3.floatValue();
		System.out.println(flt);
		byte by = itr3.byteValue();
		System.out.println(by);
		int in = itr3.intValue();
		System.out.println(in);
		long lo = itr3.longValue();
		System.out.println(lo);
	
		System.out.println(Integer.BYTES); // 4
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		
		int a = 10;
		int b = 20;
		System.out.println("MIN :" + Integer.min(a, b));
		System.out.println("MAX :" + Integer.max(a, b));
		System.out.println("SUM :" + Integer.sum(a, b));
		
		String str = "80";
		int itr4 = Integer.parseInt(str);
	
	}

}

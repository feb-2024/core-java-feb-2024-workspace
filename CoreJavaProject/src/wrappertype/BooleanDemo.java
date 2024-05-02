package wrappertype;

public class BooleanDemo {

	public static void main(String[] args) {
		Boolean bool1 = new Boolean(true);
		Boolean bool2 = new Boolean("true");
		Boolean bool3 = true; //recomended

		boolean bl = bool3.booleanValue();
		System.out.println(bl);
	
		System.out.println("AND : " + Boolean.logicalAnd(true, false));
		System.out.println("OR : " + Boolean.logicalOr(true, false));
		System.out.println("XOR : " + Boolean.logicalXor(true, false));
		
		String str2 = "false";
		Boolean bool4 = Boolean.parseBoolean(str2);
		System.out.println(bool4);
		
		String str3 = Boolean.toString(bool4);
		System.out.println(str3);
		
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		System.out.println(Boolean.TYPE);
		
	}

}

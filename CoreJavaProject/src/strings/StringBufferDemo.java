package strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		String str1 = "welcome";
		
		// CRUD operations
		// C - Create, R - Read, U - Update, D - Delete
		
		// C - Create(Add, Insert...)
		StringBuffer strBuff = new StringBuffer(str1);
		
		System.out.println("Capacity : " + strBuff.capacity());
		System.out.println("Length : " + strBuff.length());
		
		strBuff.append(" to");
		
		System.out.println("Capacity : " + strBuff.capacity());
		System.out.println("Length : " + strBuff.length());
		
		strBuff.append(" JAVA!");
		
		System.out.println("Capacity : " + strBuff.capacity());
		System.out.println("Length : " + strBuff.length());
		
		// R - Read(Fetch, display, retrieve...)
		System.out.println(strBuff);
		
		// U - Update(replace, change, edit...)
		// lets change "welcome to JAVA" to "welcome to SQL" - 11, 15
		int startIndex = strBuff.indexOf("JAVA");
		strBuff.replace(startIndex, startIndex + 4, "SQL");
		System.out.println(strBuff);
		
		// D - Delete (remove..)
		startIndex = strBuff.indexOf("to");
		strBuff.delete(startIndex, startIndex+3);
		System.out.println(strBuff);
		
		// C - Create
		startIndex = strBuff.indexOf("SQL");
		strBuff.insert(startIndex-1, " to");
		System.out.println(strBuff);
		
		System.out.println("Capacity : " + strBuff.capacity());
		System.out.println("Length : " + strBuff.length());
		
		strBuff.append("123456789");
		System.out.println(strBuff);
		
		System.out.println("Capacity : " + strBuff.capacity());
		System.out.println("Length : " + strBuff.length());
		
		strBuff.reverse();
		System.out.println(strBuff);
		strBuff.reverse();
		System.out.println(strBuff);
		
		strBuff.trimToSize();
		System.out.println("Capacity : " + strBuff.capacity());
		System.out.println("Length : " + strBuff.length());
		
		startIndex = strBuff.indexOf("SQL");
		String str = strBuff.substring(startIndex);
		System.out.println(str);
	}

}

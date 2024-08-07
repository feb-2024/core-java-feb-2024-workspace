package interviewquestions;

// question
//
//In the below class, is ‘method’ overloaded or duplicated?
//public class MainClass
//{
//    void method(int ... a)
//    {
//        System.out.println(1);
//    }
// 
//    void method(int[] a)
//    {
//        System.out.println(2);
//    }
//}

public class MainClass
{
    static void method(int ... a) // variable argument
    {
        //System.out.println(1);
    	for(int eachA: a) {
    		System.out.println(eachA);
    	}    
    }
 
//    static void method(int[] a)
//    {
//        //System.out.println(2);
//    	for(int eachA: a) {
//    		System.out.println(eachA);
//    	}
//    }
    
    public static void main(String args[]) {
    	int[] marks = {30,50,10,80};
    	method(marks);
    	System.out.println("-------------------");
    	method(25,35,55,75,15);
    	
    }
}
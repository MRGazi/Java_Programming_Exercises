package control.statements;

public class Exercise3 {
	
	
	static void arrMethod1() {
		int [] x = {5, 10, 15, 20, 25};
		
		System.out.println("Element : " + x[0]);
		System.out.println("Element : " + x[1]);
		System.out.println("Element : " + x[2]);
		System.out.println("Element : " + x[3]);
		System.out.println("Element : " + x[4]);
	}
	
	static void arrMethod2() {
		int [] x = {5, 10, 15, 20, 25};
		
		System.out.println("Total Element number in the array is: " + x.length);
		
		for (int i = 0; i < x.length; i++) {
			System.out.println("The element of x is:\t" + x[i]);
		}
		
	}
	
	static void arrMethod3() {
		String [] x = {"byte", "short", "Int", "long", "float", 
				"double", "boolean", "char", "String"};
		
		System.out.println("Total Element number in the array is: " + x.length);
		
		for (int i = 0; i < x.length; i++) {
			System.out.println("The element of x is:\t" + x[i]);
		}
		
	}
	
	

}

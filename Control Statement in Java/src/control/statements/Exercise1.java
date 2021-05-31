package control.statements;

public class Exercise1 {
	/*
	  	for(initialization; condition ; increment/decrement)
		{
		   statement(s);
		}
	 */
	
	static void forMethod1() {
		System.out.println("Result of forMethod1");
		System.out.println("********************");
		
		for(int a = 0; a <= 10; a++) {
			
			System.out.print(a + " ");
		}
		
		System.out.println(" \n ");
	}
	
	static void forMethod2() {
		System.out.println("Result of forMethod2");
		System.out.println("********************");
			
			for(int a = 0; a <= 10; a++) {
							
				System.out.println("The Value of a is: " + a + " ");
			}
			System.out.println(" ");
		}
	
	static void forMethod3() {
		System.out.println("Result of forMethod3");
		System.out.println("********************");
		
		for(int a = 10; a >= 0; a--) {
						
			System.out.println("The Value of a is: " + a + " ");
		}
		System.out.println(" ");
	}

}

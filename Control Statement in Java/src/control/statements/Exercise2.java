package control.statements;

public class Exercise2 {
	
	public void forMethod1() {
		
		System.out.println("Result of forMethod1");
		System.out.println("********************");
		
		int[] a = {10, 12, 25, 5, 35 };
		
		for(int x = 0; x < a.length; x++) { // here do not use <= with Array length.
			System.out.println("The Elements of a is: " + a[x]);
		}
		
		
		System.out.println(" ");
	}
	
	public void forMethod2() {
			
			System.out.println("Result of forMethod1");
			System.out.println("********************");
			
			int[] a = {10, 12, 25, 5, 35 };
			
			for(int x = 0; x < a.length; x++) { // here do not use <= with Array length.
				System.out.println("The Elements of a is: " + a[x]);
			}
			
			
			System.out.println(" ");
		}

}

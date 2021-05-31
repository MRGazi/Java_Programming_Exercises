package conditional.ifstatement.injava;

public class IfExercise1 {
	public void isMethod1() {
		System.out.println("isMethod1 of IfExrecise1 display");
		System.out.println("*********************************");
		int x, y;
		x = 20;
		y = 30;
		if (x < y) {
			System.out.println("x is less then y");
		}
		
		x = x + 10; // x will be 30
		if (x == y) {
			System.out.println("x is now equal to y." + " So x = " + x);
		}
		
		x = x * 2; //x will be 60
		if (x > y) {
			System.out.println("The Value of x is now greater then y. " + 
					"The value of which is =" + x);
		}
		// here the following boolean condition is not true.
		if (x == y) {
			System.out.println("You wont see this on display");
		}
		
		System.out.println("****The End****");
		System.out.println(" ");
	}

}

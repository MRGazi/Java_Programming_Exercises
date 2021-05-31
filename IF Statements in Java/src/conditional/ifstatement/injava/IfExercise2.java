package conditional.ifstatement.injava;

public class IfExercise2 {
	// nested if statements
	
	public void isMethod1() {
		System.out.println("isMethod1 of IfExrecise2 display");
		System.out.println("*********************************");
		int num1 = 50;
		int num2 = 100;
		
		if (num1 < num2) {
			System.out.println("num1 is less than num2. " + "So num1 = " + num1);
			if(num2 > num1) {
				System.out.println("num2 is less than num1. " + "So num2 = " + num2);
				if (num1 > 40) {
					System.out.println("num1 is greater than 40. "+ "So num1 > " + 40);
				}
			}
		}
		System.out.println("***The End***");
		System.out.println(" ");
		
	}

}

package conditional.ifstatement.injava;

public class IfExercise4 {
	public void doMethod1() {
		System.out.println("doMethod1 of IfExrecise4 display");
		System.out.println("*********************************");
		
		int num1 = 50;
		int num2 = 100;
		int num3 = num1 + num2;
		
		if (num1 > num2) {
			System.out.println("num1 > num2");
		}
		else if (num2 > num3) {
			System.out.println("num3 > num2 " + "True " + num3);
		}
		else {
			System.out.println("The numbers are :: " + " num1 = " + num1 
					+ " num2 = " + num2 + " num3 = " + num3);
		}
		
		System.out.println("***The End***");
		System.out.println(" ");
				
	}
	
	public void doMethod2() {
		System.out.println("doMethod2 of IfExrecise4 display");
		System.out.println("*********************************");
		
		int num1 = 50;
		int num2 = 100;
		int num3 = num1 + num2;
		String total;
		
		
		if (num1 > num2) {
			total = "num1 is smaller than num2";
		}
		else if (num2 > num3) {
			total = "num2 is not greater than num3";
		}
		else {
			total = " Individually num1, num2, num3 are respectively as follows:";
		}
		
		System.out.println(total + " " + num1 +"," +  num2 + "," +  num3 +".");
		
		System.out.println("***The End doMethod2***");
		System.out.println(" ");
				
	}

}

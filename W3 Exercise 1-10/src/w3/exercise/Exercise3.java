package w3.exercise;

public class Exercise3 {
	
	public void math1() {
		System.out.println("Method number 01");
		System.out.println("****************");
		
		System.out.println("The Addition of (15 + 25 + 35) is = " + (15+25+35));
		System.out.println("");
	}
	
	public void math2() {
		System.out.println("Method number 02");
		System.out.println("****************");
		
		int a = 15;
		int b = 25;
		int c = 35;
		
		System.out.println("The Addition of (15 + 25 + 35) is = " + (a + b + c));
		System.out.println("");
	}
	
	public void math3() {
		System.out.println("Method number 03");
		System.out.println("****************");
		
		int a = (35 + 75);
		int b = (75 - 35);
		int c = (35 * 75);
		int d = (125 / 5);
		int e = (123 % 5);
				
		System.out.println("Additin \t= " + a);
		System.out.println("Subtruction \t= " + b);
		System.out.println("Multiplication \t= " + c);
		System.out.println("Division \t= " + d);
		System.out.println("Remainder \t= " + e);
		System.out.println("");
	}
	
	public void math4() {
		System.out.println("Method number 04");
		System.out.println("****************");
		
		int a = (10 + 15) * 5;
		int b = (75 + 35)-80;
		int c = (35 * 75) / 2;
		int d = (125 / 5) * 5;
		int e = (123 % 5) + 80 % 3;
				
		System.out.println("Result of a \t= " + a);
		System.out.println("Result of b \t= " + b);
		System.out.println("Result of c \t= " + c);
		System.out.println("Result of d \t= " + d);
		System.out.println("Result of e \t= " + e);
		System.out.println("");
	}
	
	public void math5() {
		System.out.println("Method number 05");
		System.out.println("****************");
		
		double a = 15;
		double b = 12;
		double c = 10;
		double d = 25;
		double e = 20;
				
		System.out.println("Result of a \t= " + (a+b+c+d+e));
		System.out.println("Result of b \t= " + (a+b)*c+(d+e));
		System.out.println("Result of c \t= " + ((a+b+c+d)/e));
		System.out.println("Result of d \t= " + ((a+b+c+d)%e));
		System.out.println("Result of e \t= " + (a+b+c)*(d+e));
		System.out.println("");
	}
	

}

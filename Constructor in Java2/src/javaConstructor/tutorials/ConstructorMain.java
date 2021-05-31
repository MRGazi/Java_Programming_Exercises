package javaConstructor.tutorials;

public class ConstructorMain {

	public static void main(String[] args) {
		
		ConstructorOne show1 = new ConstructorOne();
			show1.display1();
			
		ConstructorTwo display = new ConstructorTwo(500);
			//System.out.println(display.num1);
			display.displayConst2();
			
		ConstructorTwo display1 = new ConstructorTwo(500, 300);
		System.out.println("Value of mum1 ==>" + display1.num1);
		System.out.println("Value of mum2 ==>" + display1.num2);
		System.out.println("Value of mum3 ==>" + display1.num3);
		display1.displayConst3();
		
		ConstructorTwo display2 = new ConstructorTwo(2000, "Blue Mercury");
		System.out.println("The number of Candidats are ==>" + display2.num1);
		System.out.println("The Ful Name of the Team is " + display2.str1);
		display2.displayConst4();
		
		ConstructorTwo display3 = new ConstructorTwo(80, 60, 200);
		System.out.println("The Value of num1 ==> " + display3.num1 );
		System.out.println("The Value of num2 ==> " + display3.num2 );
		System.out.println("The Value of num3 ==> " + display3.num3 );
		System.out.println("The Value of num4 ==> " + display3.num4 );
		display3.displayConst5();
		
		ConstructorTwo display4 = new ConstructorTwo("Mohammad I Hossain", 45, 17.5);
		System.out.println("The Candidate full Name is :: " + display4.str1);
		System.out.println("The Candidate total hour worked :: " + display4.num1);
		System.out.println("The Candidate's hourly rate is = $" + display4.num2);
		System.out.println("The Candidate total payment is = $" + display4.num3);
		display4.displayConst6();
	}
	

}

package javaConstructor.tutorials;

public class ConstructorOne {
	int num1; //Class Variable;
	int num2; // Class Variable;
	
	//Constructor without argument;
	public ConstructorOne() {
		num1 = 100;
		num2 = 200;
		System.out.println("Inside the ConstructorOne");
		System.out.println("-----------------------");
	}
	
	//this is a method;
	public void display1() {
		System.out.println("The num1 ==> " + num1);
		System.out.println("The num1 ==> " + num2);
	}
	
}

package switches.cases;

import java.util.Scanner;

public class SwitchCaseExercise2 {
	
	static void doMethod1() {
		
		char operator;
		double num1, num2, result;
		String note = "The operating result of two numbers are:: ";
		Scanner type = new Scanner(System.in);
		
		System.out.print("Enter any Operator like (+, -, * or /)");
		operator = type.next().charAt(0);
		System.out.println("Enter the Number 1 and Number 2 Respectively:\n");
		num1 = type.nextDouble();
		num2 = type.nextDouble();
		
		switch (operator) {
		
		case '+':
			result = num1 + num2;
			System.out.println(note + num1 + " + " +num2 + " =" + result);
		break;
		
		case '-':
			result = num1 - num2;
			System.out.println(note + num1 + " - " +num2 + " =" + result);
		break;
		
		case '*':
			result = num1 * num2;
			System.out.println(note + num1 + " * " +num2 + " =" + result);
		break;
		
		case '/':
			result = num1 / num2;
			System.out.println(note + num1 + " / " +num2 + " =" + result);
		break;
		
		default:
			System.out.println("You did not type the proper Operator!");
		break;
		}
		
		type.close();
			
		
	}

}

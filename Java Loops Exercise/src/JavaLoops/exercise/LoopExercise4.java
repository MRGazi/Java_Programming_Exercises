package JavaLoops.exercise;

import java.util.Scanner;

public class LoopExercise4 {
	
	/*
	 * Write a program to find the factorial value of any number 
	 * entered through the keyboard.
	 */
	
	Scanner keyBoard = new Scanner(System.in);
	int num;
	int fact = 1;
	
	public void printFactorial1() {
		System.out.print("Enter any Positive Integer");
		num = keyBoard.nextInt();
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		
		System.out.println("Factorial => " + fact);
		
	}
	

}

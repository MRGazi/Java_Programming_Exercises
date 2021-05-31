package JavaLoops.exercise;

import java.util.Scanner;

public class LoopExercise3 {
	/*
	 * Write a program that prompts the user to input a positive integer. 
	 * It should then print the multiplication table of that number.
	 */
	int num;
	
	Scanner keyBoard = new Scanner(System.in);
	
	public void printTable1() {
		System.out.println("Enter Any Positive Integer");
		num = keyBoard.nextInt(); // number will be typed from the Key Board.
		System.out.println("Multiplication Table of " + num);
		
		for(int i = 1; i <=10; i++) {
			System.out.println(num + " X " + i + " ==> " + (num * i));
		}
		
	}
	

}

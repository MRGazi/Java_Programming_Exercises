package javaMethod.erercises;
	/*
	Java Method : Exercise-1 with Solution
	Write a Java method to find the smallest number among three numbers.
	
	Test Data:
	Input the first number: 25
	Input the Second number: 37
	Input the third number: 29
	
	Sample Output:
	Input the first number: 25                                                                                    
	Input the Second number: 37                                                                                   
	Input the third number: 29                                                                                    
	The smallest value is 25.0
	*/

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner keyboard1 = new Scanner(System.in);
		
		System.out.print("Please enter the first Number = ");
		double x = keyboard1.nextDouble();
		System.out.print("Pease enter the second Number = ");
		double y = keyboard1.nextDouble();
		System.out.print("Please enter the third Number = ");
		double z = keyboard1.nextDouble();
		System.out.println("The smallest value you Entered = " 
		+ showSmallest(x,y,z) + "\n");
		keyboard1.close();
		
	}
	
	Exercise1(){
		
	}
	
	public static double showSmallest(double x, double y, double z) {
		return Math.min(Math.min(x, y), z);
	}

}

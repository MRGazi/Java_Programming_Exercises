package JavaLoops.exercise;

public class LoopExercise2 {
	//a program to calculate the sum of first 20 natural numbers;
	public void printLoop1() {
		int sum = 0;
		double average;
		
		for (int i = 1; i < 20; i++) {
			sum = sum + i;
			//sum += i;
			
		}
		average = sum / 20;
		System.out.println("Sum: =>" + sum);
		System.out.println("Average: =>" + average);
	}
	
}

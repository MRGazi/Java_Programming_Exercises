package array.injava.tutorials;

public class ArrayClass4 {
	int d = 4;
	int[] digits = new int[d];
	
	public void countNum1() {
	digits[0] = 10;
	digits[1] = 20;
	digits[2] = 50;
	digits[3] = 60;
	
	System.out.println(digits[0] + digits[1] + digits[2] + digits[3]);
	}
	
	public void countNum2() {
		digits[0] = 10;
		digits[1] = 20;
		digits[2] = 50;
		digits[3] = 60;
		
		
		
		System.out.println("Total of Last 2 digits: " + (digits[2] + digits[3]));
		
	}
	
	public void countNum3() {
		digits[0] = 10;
		digits[1] = 20;
		digits[2] = 50;
		digits[3] = 60;
		int p = 0;
		int average;
		for(int i = 0; i < digits.length; i++) {
			//System.out.println(digits[i]);
			p = p+digits[i];
			
		}
		average = p / digits.length;
		
		System.out.println("Total of the Array ==> " + p);
		System.out.println("The Average of the Array is: ==> " + average);
		
	}
}

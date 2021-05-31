package array.injava.tutorials;

public class ArrayClass5 {
	double [] count1 = new double[10];
	
	public void count1() {
		count1[0] = 32.50; 
		count1[1] = 55.70;
		count1[2] = 20.75;
		count1[3] = 40.50; 
		count1[4] = 12.00;
		count1[5] = 20.75;
		count1[6] = 15.25;
		count1[7] = 33.30; 
		count1[8] = 20.75;
		count1[9] = 23.50;
		
		double sum = 0;
		double average;
		
		for(int a = 0; a < count1.length; a++) {
			System.out.println("At Index " + a + " value is = " + count1[a]);
			sum += count1[a];
		}
		
		double elements = count1.length;
		average = sum / elements;
		System.out.println("Total of Elements is = " + sum);
		System.out.println("The average of the Elements is = " + average);
	}

}

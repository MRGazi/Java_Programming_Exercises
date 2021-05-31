package array.injava.tutorials;

public class ArrayClass3 {
	int[] numList1 = new int[8];
	//numList1[0] = 10;
	
	public void listElements1() {
		numList1[0] = 10;
		numList1[1] = 15;
		numList1[2] = 35;
		numList1[3] = 5;
		numList1[4] = 55;
		numList1[5] = 35;
		numList1[6] = 85;
		numList1[7] = 70;
		
		int sum = 0;
		double average;
		/*
		for(int i = 0; i< numList1.length; i++) {
			sum = sum + numList1[i];
			System.out.println(sum);
		}
		*/
		
		for (int addition: numList1) {
			sum = sum + addition;
			average = (double)sum/ numList1.length;
			System.out.println(sum);
			System.out.println(average);
			
		}
	}
	
	public void listElements2() {
		numList1[0] = 10;
		numList1[1] = 15;
		
		
		
		for(int i = 0; i< numList1.length; i++) {
			numList1[i] = i;
			
		}
		
		int sum = 0;
		double average;
		
		for (int addition: numList1) {
			sum = sum + addition;
			average = (double)sum/ numList1.length;
			System.out.println(sum);
			//System.out.println(average);
			
		}
		
	}

}

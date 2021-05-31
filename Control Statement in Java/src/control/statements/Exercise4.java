package control.statements;

public class Exercise4 {
	
	public static void arrMath1() {
		System.out.println("\nResult from Exercise Four (4)");
		System.out.println("===============================");
		
		int [] arr1 = {75, 95, 85, 70, 80, 91 };
		int p = 0;
		int sum = 0;
		int mult = 0;
		double average;
		System.out.println("The total number of Element in the "
				+ "Array is:" + arr1.length +"\n");
		
		int x = arr1.length;
		
		for (int i = 0; i < x; i++ ) {
			System.out.println("The Element of arr1 "+ "Index:" + i+ 
					" is:\t=" + arr1[i]);
			//System.out.println("Index:" + i);
			sum += arr1[i];
			p += arr1[i] / x;
			mult += arr1[i] * x;
			
		}
		
		
		System.out.println("\nThe total of 6 Elements is:" + sum);
		System.out.println("\nThe average of 6 Elements is:" + p);
		System.out.println("\nThe multiplication of 6 Elements is:" + mult);
		
		
		
	}

}

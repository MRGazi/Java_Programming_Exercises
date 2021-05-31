package tutorial.forloop.exercise;

public class ForLoopExercise4 {
	
	public void forLoop1() {
		
		int y = 10;
		for (int x = 1; x <= 10; x++) {
			System.out.println(x);
		}
		
	}
	
	public void forLoop2() {
			
			int[] array1 = {1,2,3,4,5};
			
			for (int x = 0; x < array1.length; x++) {
				System.out.println("At Index --> " + x + " Element is ==> " + array1[x]);
			}
			
		}
	
	public void forLoop3() {
		
		int[] array1 = new int[6];
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		array1[3] = array1[2];
		array1[4] = array1[1];
		array1[5] = array1[0];
		
		for (int x = 0; x < array1.length; x++) {
			System.out.println("At Index --> " + x + " Element is ==> " + array1[x]);
		}
		
	}
	
	public void forLoop4() {
			
			int[] array1 = new int[6];
			array1[0] = 1;
			array1[1] = 2;
			array1[2] = 3;
			array1[3] = array1[2];
			array1[4] = array1[1];
			array1[5] = array1[0];
			
			int sum = 0;
			double average = 0;
			for (int array: array1) {
				System.out.println(" Element is ==> " + array);
				
				sum = sum + array;
				average = sum / array1.length;
				
			}
			System.out.println("Sum of the Element is: " + sum);
			System.out.println("Average of the Element is: " + average);
		}
}

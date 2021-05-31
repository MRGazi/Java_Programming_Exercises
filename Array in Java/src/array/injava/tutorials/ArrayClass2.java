package array.injava.tutorials;

public class ArrayClass2 {

	int[] numList1 = {15, 20, 35, 75, 8, 2};
	
	public void numList1() {
		System.out.println("Programm Execution of numList1 Method");
		System.out.println("--------------------------------------");
		
		System.out.println("Elements of the numList1 are: ");
		System.out.println(numList1[0]);
		System.out.println(numList1[1]);
		System.out.println(numList1[2]);
		System.out.println(numList1[3]);
		System.out.println(numList1[4]);
		System.out.println(numList1[5]);
		
		System.out.println("----End of Subroutin Execution---------\n");
	}
	
	public void numList2() {
		System.out.println("Programm Execution of numList2 Method");
		System.out.println("--------------------------------------");
		System.out.println("Elements of the numList1 are: ");
		
		for(int i = 0; i<numList1.length; i++) {
			System.out.println("At index => " + i+"-->> "+numList1[i]);
		}
		
		System.out.println("----End of Subroutin Execution---------\n");
	}
	
	public void numList3() {
		System.out.println("Programm Execution of numList3 Method");
		System.out.println("--------------------------------------");
		//System.out.println("Elements of the numList1 are: ");
		
		/*
		for(int i = 0; i<numList1.length; i++) {
			System.out.println("At index => " + i+"-->> "+numList1[i]);
		}
		*/
		System.out.print("Total of the Elements in numList1 is: ");
		System.out.println(numList1[0]+numList1[1]+numList1[2]+numList1[3]+numList1[4]+numList1[5]);
		
		System.out.println("----End of Subroutin Execution---------\n");
	}
	
	public void numList4() {
		System.out.println("Programm Execution of numList3 Method");
		System.out.println("--------------------------------------");
		//System.out.println("Elements of the numList1 are: ");
		
		
		for(int i = 0; i<numList1.length; i++) {
			System.out.println("Total of the Elements in numList1 is=> "+(numList1[0]
					+numList1[1]+numList1[2]+numList1[3]+numList1[4]+numList1[5]));
		}
		
		/*
		System.out.print("Total of the Elements in numList1 is: ");
		System.out.println(numList1[0]+numList1[1]+numList1[2]+numList1[3]+numList1[4]+numList1[5]);
		*/
		System.out.println("----End of Subroutin Execution---------\n");
	}
}

package array.inJava;

public class ArrayClass1 {
	int[] countNumbers = {4, 5, 3, 8, 2, 7};
	
	int p = countNumbers.length;
	
	int a = countNumbers[0];
	int b = countNumbers[1];
	int c = countNumbers[2];
	
	public void countNumber() {
	int d = (a+b+c) / c;
		System.out.println(p);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	
	}
	
	public void countIndex() {
			for(int i = 0; i < countNumbers.length; i++) {
				System.out.println("Index ==> " + i + ":");
			}
		}
}

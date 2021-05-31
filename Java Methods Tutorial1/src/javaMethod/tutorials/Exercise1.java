package javaMethod.tutorials;

public class Exercise1 {
	static int doMethod1(int x, int y, int z) {
		int m;
		return m = x * y * z;
	}
	
	static int doMethod2(int x, int y, int z) {
		int m;
		return m = x + y + z;
	}
	
	static void doMethod3() {
		int x = doMethod1(10, 20, 30);
		int y = doMethod2(40, 50, 60);
		System.out.println("Result Y " + y + " \nResult X " + x);
	}

}

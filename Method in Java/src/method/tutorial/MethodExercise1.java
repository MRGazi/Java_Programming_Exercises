package method.tutorial;

public class MethodExercise1 {
	
	
	public static double doTest1() {
		double x = 10;
		double y = 20;
		double z;
		
		return z = x + y;
	}
	
	public static int doTest2() {
		int x = 10;
		int y = 20;
		int z;
		
		return z = x + y;
	}
	
	public static void doTest3() {
		double x = MethodExercise1.doTest1();
		int y = MethodExercise1.doTest2();
		double z = x + y;
		System.out.println(z);
	}

}

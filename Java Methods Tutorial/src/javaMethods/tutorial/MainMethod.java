package javaMethods.tutorial;

public class MainMethod {

	public static void main(String[] args) {
		// Creating new object "test1" from TestClass;
		TestClass test1 = new TestClass();
		
		//Executing the methods in the Main Method;
		test1.testMethod();
		test1.testMethod1();
		test1.testMethod5();
		test1.testMethod6();
		//test1.testMethod7(testMethod5(), testMethod6());
	}
	
	
}

class TestClass{
	public void testMethod() {
		int num1 = 95;
				
		if (num1 >= 90) {
			System.out.println("GPA (90 - 100) is: => " + "A+");
		}
		else if (num1 >= 80) {
			System.out.println(" GPA (80-90) is: => " + "A");
		}
		else if (num1 >= 70) {
			System.out.println("The result in GPA is \"Pass\"");
		}
		else {
			System.out.println("Result is \"Fail\" ");
		}
				
	}
	
	public void testMethod1() {
		//Calling another method from a method inside the same Class;
		testMethod();
		
		System.out.println(testMethod2(testMethod3(10,20), testMethod4 (20,30)));
	}
	
	public int testMethod2(int x, int y) {
		int z;
		return z = x * y;
	}
	
	public int testMethod3(int x, int y) {
		int z;
		return z = x * y;
		
	}
	public int testMethod4(int x, int y) {
		int z;
		return z = x * y;
		
	}
	
	public void testMethod5 () {
		System.out.println("The Result = " + testMethod2(testMethod3(10,20), testMethod4 (20,30)));
		
	}
	
	public void testMethod6() {
		System.out.println("Total Result of testMethod6 is: " + (testMethod3(20,30) + testMethod4(25,30)));
	}
	
	public double testMethod7(double x, double y) {
		double z;
		return z = x + y;
	}
}
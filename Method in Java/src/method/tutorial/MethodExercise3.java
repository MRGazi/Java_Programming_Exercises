package method.tutorial;

import java.lang.Math;

public class MethodExercise3 {
	MethodExercise1 x = new MethodExercise1();
	MethodExercise2 y = new MethodExercise2();
	
	public void doTest1() {
		double a = x.doTest1();
		double b = y.doTest1();
		double c = a * b;
		System.out.println(c);
		
	}
	
	public void doMath1() {
		double a = 75;
		double b = 10;
		// calculate 10 percent of 75;
		double percentage = (a * b)/100;
		System.out.println("Therefore percentage result is:"+ percentage);
	}
	
	public double doMath2(double a, double b) {
		double percentage = (a * b)/100;
		return percentage ;
		//System.out.println("Therefore percentage result is:"+ percentage);
		
	}
	
	public void doMath3() {
		int a = 20;
		int b = 30;
		System.out.println("The Minumum number is: " + Math.min(a, b));
		System.out.println("The Maximum number is: " + Math.max(a, b));
		System.out.println("The multiplication number is: " + Math.multiplyExact(a, b));
		System.out.println("The adition number is: " + Math.addExact(a, b));
		
	}
	
	public void doMath4() {
		float x = 5.5f;
		float y =64f;
		double a = 36;
		double b = 4;
		System.out.println(Math.pow(a, b));
		System.out.println(Math.sqrt(a));
		System.out.println(Math.getExponent(b));
	}


}

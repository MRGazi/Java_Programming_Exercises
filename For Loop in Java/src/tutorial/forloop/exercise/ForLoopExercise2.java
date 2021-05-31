package tutorial.forloop.exercise; // Package Statement


public class ForLoopExercise2 {
	
	static void learnForLoop1() {
		for (int x = 1; x <= 10; x++) {
			System.out.println("The value of x ==> " + x + ".");
		}
		
	}
	
	static void learnForLoop2() {
		int [] element = {25, 10, 20, 100, 50, 80, 65, 70, 90, 30};
		
		for (int x = 0; x < element.length; x++) {
			System.out.println("The index of x denotes element ==> " + x +": "+ element[x]);
		}
		
	}
	
	static void learnForLoop3() {
		int [] element = {25, 10, 20, 100, 50, 80, 65, 70, 90, 30};
		
		for (int x = 0; x < element.length; x++) {
			System.out.println("The index of x denotes element ==> " + x +": "+ element[x]);
		}
		
	}
	
	static void learnForLoop4() {
		//int [] element = {25, 10, 20, 100, 50, 80, 65, 70, 90, 30};
		
		for (int x = 10; x >= 0; x--) {
			//System.out.println("The index of x denotes element ==> " + x + "<-->" + element[x]);
			System.out.println("The index of x denotes element ==> " + x);
		}
		
	}

}

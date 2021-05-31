package tutorial.forloop.exercise;

public class ForLoopExercise1 {
// the following method is an infinite for loop;
	public void learnForLoop1() {
		for (; ;) {
			System.out.println("Thist is a test for forLoop Method");
		}
	}
	
	public void learnForLoop2() {
		int x = 0;
		for (x = 0; x <= 10; x++) {
			
			System.out.println(x + " ");
		}
			
		}
		
	// the following method is with multiple variable for 'for Loop';
	public void learnForLoop4() {
		int x = 4;
		for (double y = 6, z = 8; x < 10 && y <= 10 ; x++, y++) {
			System.out.println(y + " ");
			System.out.println(x + " ");
			
		}
		
		//System.out.println(x + " ");
	}
}

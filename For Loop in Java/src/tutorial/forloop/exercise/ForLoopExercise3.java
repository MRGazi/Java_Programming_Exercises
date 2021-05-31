package tutorial.forloop.exercise;

public class ForLoopExercise3 {
	
	public void learnForLoop1() {
		String[] name = {"Dhaka", "Comilla", "Chittagong", "Khulna", 
				"Barishal", "Mymensing", "Rajshahi"};
		for (int x = 0; x < name.length; x++) {
			System.out.println(" Index " + x + " ==> " + name[x]);
		}
	}
	
	public void learnForLoop2() {
		String[] name = {"Dhaka", "Comilla", "Chittagong", "Khulna", 
				"Barishal", "Mymensing", "Rajshahi"};
		for (String x : name) {
			System.out.println(" Index " + " ==> " + x);
		}
	}
	
	public String learnForLoop3(String x) {
		return x;
			
		}
	

}

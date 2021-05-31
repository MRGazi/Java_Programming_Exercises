package array.injava.tutorials;

public class ArrayClass1 {
	
	String[] daysInWeek = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
	
	public void daysInWeek1() {
		System.out.println("Result of daysInWeek1 Method");
		System.out.println("----------------------------");
		System.out.println("1st Day in a week is = " + daysInWeek[1]);
		
		System.out.println("---------The End of Subroutin Execution---------\n");
	}
	
	public void daysInWeek2() {
		System.out.println("Result of daysInWeek2 Method");
		System.out.println("----------------------------");
		System.out.println("Weekdays in a week are:\n" + daysInWeek[2] + "\n" + daysInWeek[3] + "\n"
				+ daysInWeek[4] + "\n" + daysInWeek[5] + "\n" + daysInWeek[6]);
		
		System.out.println("---------The End of Subroutin Execution---------\n");
	}
	
	public void daysInWeek3() {
		System.out.println("Result of daysInWeek3 Method");
		System.out.println("----------------------------");
		System.out.println("Name of the Weekdays are as followes:");
		
		for(int i = 0; i< daysInWeek.length; i++) {
			System.out.println("Day=>" + i +" " + daysInWeek[i]);
		}
		
		System.out.println("---------The End of Subroutin Execution---------\n");
	}
}

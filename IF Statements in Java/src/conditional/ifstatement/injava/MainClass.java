package conditional.ifstatement.injava;

public class MainClass {

	public static void main(String[] args) {
		//Create object for class IfExercise1.
		IfExercise1 exercise1 = new IfExercise1();
		IfExercise2 nested1 = new IfExercise2();
		IfExercise3 else1 = new IfExercise3();
		IfExercise4 elseIf1 = new IfExercise4();
		
		exercise1.isMethod1();
		nested1.isMethod1();
		else1.isMethod1();
		elseIf1.doMethod1();
		elseIf1.doMethod2();

	}

}

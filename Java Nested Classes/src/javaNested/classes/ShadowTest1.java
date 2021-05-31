package javaNested.classes;

public class ShadowTest1 {
	public int x = 0;
	
	class FirstLevel{
		public int x = 1;
		
		void methodFirstLevel(int x) {
			System.out.println("x = " + x);
			System.out.println("this.x = " + this.x);
			System.out.println("ShadowTest1.this.x = " + ShadowTest1.this.x);
		}
	}

}

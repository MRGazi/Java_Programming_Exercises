package javaConstructor.tutorials;


public class ConstructorTwo {
	//Class variable;
	double num1, num2, num3, num4;
	String str1, str2, str3;
	/*
		// here are the examples of constructor overloading;
		public ConstructorTwo() { //this is an empty constructor;
			num1 = 100;
		}
		*/
		public ConstructorTwo(double x) {
			System.out.println("\nInside the ConstructorTwo with One parameter");
			System.out.println("------------------------------------------");
			this.num1 = x;
		}
			//This is a method;
			public void displayConst2() {
				System.out.println("The value of num1 is => "+num1);
			}
		
		public ConstructorTwo(double x, double y) {
			System.out.println("\nInside the ConstructorTwo with Two parameter");
			System.out.println("------------------------------------------");
			this.num1 = x;
			this.num2 = y;
			this.num3 = x * y;
		}
		
			//This is a method;
			public void displayConst3() {
				System.out.println("\nMethod Display");
				System.out.println("The value of num1 is => " + num1);
				System.out.println("The value of num2 is => " + num2);
				System.out.println("The value of num3 is => " + num3);
				System.out.println("The Addition of num1, num2 & num3 is => " 
						+ (num1 + num2 + num3));
			}
		
		public ConstructorTwo(double x, String strx) {
			System.out.println("\nInside the ConstructorTwo with Two different parameter");
			System.out.println("-------------------------------------------------------");
			this.num1 = x;
			this.str1 = strx;			
		}
			public void displayConst4() {
				System.out.println("\nMethod Display");
				System.out.println("The total number of the candidates is =>" + num1);
				System.out.println("The name of the candidates' Team is =>" + str1);				
			}
		
		public ConstructorTwo(double x, double y, double z) {
			System.out.println("\nInside the ConstructorTwo with Three similar type parameters");
			System.out.println("--------------------------------------------------------------");
			this.num1 = x;
			this.num2 = y;
			this.num3 = z + (x * y);
			this.num4 = (x + y + z);
		}
			public void displayConst5 () {
				System.out.println("\nMethod Display 5:");
				System.out.println("The value of num1 is ==>> " + num1);
				System.out.println("The value of num1 is ==>> " + num2);
				System.out.println("The value of num1 is ==>> " + num3);
				System.out.println("The value of num1 is ==>> " + num4);
			}
		
		public ConstructorTwo(String str1, double y, double z) {
			System.out.println("\nInside the ConstructorTwo with one different of three type parameters");
			System.out.println("-----------------------------------------------------------------------");
			this.str1 = str1;
			this.num1 = y;
			this.num2 = z;
			this.num3 = (y * z);
			
		}
			public void displayConst6() {
				System.out.println("\nMethod Display 6:");
				System.out.println("The candidate Name is :: " + str1);
				System.out.println("Total hour worked = " + num1);
				System.out.println("Hourly Rate is : $" + num2);
				System.out.println("Total Payment is ==> $" + num3);
				
			}

}

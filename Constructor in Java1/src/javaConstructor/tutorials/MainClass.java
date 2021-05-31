package javaConstructor.tutorials;

public class MainClass {

	public static void main(String[] args) {
		
		Member1 mOne = new Member1();
		System.out.println(mOne.fullName +"\n" + mOne.fName +"\n"  + mOne.mName +"\n" 
		+ mOne.lName +"\n" + mOne.address +"\n" + mOne.apt +"\n" + 
		mOne.city +"\n" + mOne.state +"\n" + mOne.country +"\n" + mOne.ph);
		
		Member1 mTwo = new Member1(38, 20, 18.5, 25, 20);
		System.out.println("\nMember Earning Details");
		System.out.println("----------------------");
		System.out.println("Member total hour is: " + mTwo.totalhr);
		System.out.println("Member total overtime is: " + mTwo.overtime);
		System.out.println("Member total Eranings from regular hours is: $" + mTwo.x);
		System.out.println("Member total Earnings form overtime is: $" + mTwo.y);
		System.out.println("Member total Netpay is: $" + mTwo.netPay);
		System.out.println("Member total Bonus is: $" + mTwo.bonus);
		System.out.println("Member total Payment is: $" + mTwo.totalPay);
		
		Member1 mThree = new Member1(1500, 35);
		System.out.println("\nPercentage calculation");
		System.out.println("----------------------");
		System.out.println("The 35 percent of 1500 will be = "+ mThree.r);
	}
	
	
	

}

package javaConstructor.tutorials;

public class Member1 {
	String fullName, fName, mName, lName, address, 
			apt, city, state, zipCode, country, ph; 
	double totalPay, netPay, totalhr, hour, overtime, hrRate, overRate, bonusRate, bonus;
	double x, y; // Earnings from overtime and regular hour
	float p, q, r;
	
	public Member1() {
		fullName = "Full Name\t:Mohammed Ismail Hossain";
		fName = "First Name \t:" + "Mohammed";
		mName = "Middle Name \t:" + "Ismail";
		lName = "Last Name \t:" + "Hossain";
		address = "Address \t:" + "33-09 31st Avenue";
		apt = "Apt. # \t\t:" + "2D";
		city = "City \t\t:" + "Astoria";
		state = "State \t\t:" + " New York";
		zipCode = "Zip Code \t:" + "11106";
		country = "Country \t:" + "USA";
		ph = "Cell \t\t:" + "(716) 222-7150";
	}
	
	public Member1 (float p, float q) {
			r = (p * q) / 100;
		}

	public Member1(double b, double c, double d, double e, double f) {
		this.hour = b;
		this.overtime = c;
		this.hrRate = d;
		this.overRate = e;
		this.x = b * d; //earnings from regular hour;
		this.y = c * e; // earnings from overtime;
		this.bonusRate = f;
		this.netPay = ((b * d) + (c * e));
		this.bonus = (netPay * f)/100;
		this.totalhr = (b + c);
		this.totalPay = (netPay + bonus);
		
	}
	
	

}

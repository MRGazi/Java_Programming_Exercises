package javaConstructors.tutorials1;

public class MainConstructor {
	double rate, time, overtime, totalpay, totalhrs;
	
	String first;
	String middle;
	String last;
	int age;
	String address, apt, city, zip, state, country, ph;
	
	
	public static void main(String[] args) {
	
		MainConstructor member1 = new MainConstructor();
			System.out.println("Member Details");
			System.out.println("**************\n");
			//System.out.println("Candidate Age is: " + member1.age);
		
		MainConstructor member2 = new MainConstructor();
			System.out.println(member2.first+"\n" + member2.last+"\n" + 
					member2.middle+"\n" +"Address: " + member2.address+"\n" + member2.apt+"\n"+ 
					member2.city+"\n" + member2.zip+"\n" + member2.state+"\n" + 
					member2.country+"\n"+member2.ph+"\n");
		
		MainConstructor member3 = new MainConstructor(14.79,35,8.5);
			System.out.println("Member Earning Details:");
			System.out.println("-----------------------");
			System.out.println("Member actual time = " + member3.time + " hrs.");
			System.out.println("Member over tiem = " + member3.overtime + " hrs.");
			System.out.println("Member total Hour = " + member3.totalhrs + " hrs.");
			System.out.println("Member hourly rate = " + "$"+ member3.rate );
			System.out.println("Member total payment is = $" + member3.totalpay);
			
	}
	
		public MainConstructor (){
			first = "First Name:\tIsmail";
			last = "Last Name: \tHossain";
			middle = "Middle Name: \tN/A";
			address = "\t33-09 31st Avenue";
			apt = "\t\tApt # 2D";
			city = "City: \t\tAstoria";
			zip = "Zip Code:"+"\t11106";
			state = "State: \t\tNew York";
			country = "Country: \tUnited States of America";
			ph = "Phone Number: \t(716)-222-7150";
						 
		}
		
		public MainConstructor (double rate, double time, double overtime) {
			this.rate = rate;
			this.time = time;
			this.overtime = overtime;
			this.totalhrs = (time + overtime);
			this.totalpay = (rate * time) + (rate * overtime);
		}
}

package formatter.inJava;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.LocalDate;
import java.time.Month;


public class MainFormatter {
	
	static String heading1 = "Md Abu Musa";
	static String heading2 = "Exam Result";
	static String heading3 = "Exam Grade";
	public static String name = "MD ABU MUSA";
	

	public static void main(String[] args) {
		
		LocalDate dob = LocalDate.of(1980, Month.JUNE, 01);
		System.out.printf("%1$tB %1$td, %1$tY is %2$s.%n", dob, "my Birht day");
		
		System.out.printf("%nThe Rate is 10%%.%nSugar%nWheat%n");
		
		
		

	}

}

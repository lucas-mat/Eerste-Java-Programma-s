
import java.util.Scanner; 

public class SalaryCalcu {
	public static void main(String[] args) {
		
		double taxatie = 1;
		
		System.out.println("Geef uw bruto jaarloon in.");
		Scanner salaryIn = new Scanner (System.in);
		double salary =  salaryIn.nextDouble(); 
		
		
		//Scanner moet nummers opvangen geen string.
		
		System.out.println("Geef uw gewerkte uren in.");
		Scanner workedHours = new Scanner (System.in); 
		Double work =  workedHours.nextDouble();
		
		if (salary >= 1300) {
			taxatie = salary/100*13.07;
		}
		
		//salary zet ik hier om de tax van het bruto salaris te halen.
		salary = salary - (salary / 100 * 13.07);
		
		int werknemer = 3;
		
		String werknemerString;
		switch (werknemer) {
		case 1: werknemerString = "Ryan" ;
		case 2: werknemerString = "Bob" ;
		case 3: werknemerString = "Mark" ;
		}
		
		System.out.println("Beste, " + werknemer + " ,uw tax bedraagt " + taxatie + " (-13,07 % )" );
		System.out.println("Beste, " + werknemer + " ,uw netto salaris van dit jaar bedraagt " + salary + ".");
				
		//Voor 3 personen moet je met een switch/break werken
		
		
	}
}

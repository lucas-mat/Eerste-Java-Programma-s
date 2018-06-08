package be.lucas;

import java.util.Scanner;
public class BlackBelt2013 {

	public static void main (String[] args) {
		
		System.out.println("Geef een random getal van in.");
		
		Scanner nummerIn = new Scanner (System.in);
		double nummer = nummerIn.nextDouble();
		
		if(nummer >= 50 ) {
			
			System.out.println("PASS");
			
		}else {
			System.out.println("FAIL");
		}
		
		
	}
	
}

package be.lucas;

import java.util.Scanner;

public class HelloWorld {

	
	public static void main(String[] args) {
		
		
		
		System.out.println("Wat is je volledige naam?");
        Scanner userinput = new Scanner(System.in);
               
        String username = userinput.nextLine();
        
        String volledigeNaam = username; 
        String[] spatie = volledigeNaam.split(" ", 2);
        
        String voornaam = spatie[0];
        String achternaam = spatie[1];
            
        
        System.out.println("Hallo " + voornaam + " "+ achternaam.toUpperCase() +"!!!");
		
		
	}
	
}

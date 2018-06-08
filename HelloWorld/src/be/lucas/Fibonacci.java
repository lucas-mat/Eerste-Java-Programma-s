package be.lucas;

public class Fibonacci {
	public static void main(String[] args) {
		
		int aantalFibonacci = 20;
		int a = 0;
		int b = 1;
		int i = 1; 
		
		System.out.println("0");
		System.out.println("1");
		
		while (i <= 20){
			
			int som = a + b; 
					
			System.out.println(som);
			i++;
			
			a = b;
		    b = som;


		}

	}

}

package be.lucas;

import java.util.*;

public class NumberPyramid {
	
	public static void main(String[] args) {
	
	int b = 0;
	int c = 2; 
	int hoeveelheid = 1;
		

	
		
	
		while (hoeveelheid < 9){
		
			int a = (int)Math.pow(c, b);
		
			System.out.println(a);
			hoeveelheid++;
			b++;
		}
	}
}

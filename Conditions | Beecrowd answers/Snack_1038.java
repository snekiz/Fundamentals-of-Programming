package LabActivities;

import java.util.Scanner;

public class Snack_1038 {

	public static void main(String[] args) {
		int X, Y;
		float price = 0;
		
	Scanner sc = new Scanner(System.in); 	
	
	     X = sc.nextInt();
	     Y = sc.nextInt();
	if (X == 1) {     
		  price = (float) (4.00 * Y);
	}else if (X == 2) {
		price = (float) (4.50 * Y);
	}else if (X == 3) {
		price = (float) (5.00 * Y); 
	}else if (X == 4) {
		price = (float) (2.00 * Y);
	}else if (X == 5) {
		price = (float) (1.50 * Y);
	}
	     
      System.out.printf("Total : R$ " + String.format("%.2f\n",price));	
	     
	     
	      
	      
	   
		

	}

}

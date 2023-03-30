package javaFundamentals;

import java.util.Scanner;

public class InputAndArithmeticOperators {

	public static void main(String[] args) {

	    float numOne;
	    float numTwo;
		
		Scanner input = new Scanner(System.in);
		
	    System.out.print("First Number:");
		numOne = input.nextFloat();
	    System.out.print("Second Number:");
		numTwo = input.nextFloat();
        
		float result = numOne/numTwo;
		
		
	System.out.println("Answer: " + numOne + " / " + numTwo + " = " + result);
	
   
	}

}

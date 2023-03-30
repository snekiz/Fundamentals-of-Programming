package LabActivities;

import java.util.Scanner;

public class Average1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double A = input.nextDouble();
		double B = input.nextDouble();	
		double ave;
		ave = ((A * 3.5) +  (B * 7.5)) /11;
		 
	System.out.printf("MEDIA = " + "%.5f\n", ave);
	

	}

}

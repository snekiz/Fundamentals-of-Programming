package LabActivitySeclectionInJAVA;

import java.util.Scanner;

public class GameTime1046 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);	
	    
        int timeOne = sc.nextInt(); 
        int timeTwo = sc.nextInt();
        
        if (timeOne > timeTwo) {
            System.out.println("O JOGO DUROU " + (24 - timeOne + timeTwo) + " HORA(S)");
        } else if (timeOne < timeTwo) {
            System.out.println("O JOGO DUROU " + (timeTwo - timeOne) + " HORA(S)");
        } else if (timeOne == timeTwo) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
		
	}

}

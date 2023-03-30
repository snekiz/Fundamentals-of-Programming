package LabActivitySeclectionInJAVA;

import java.util.Scanner;

public class CoordinatesOfaPoint1041 {

	public static void main(String[] args) {
            float x;
            float y;
        Scanner sc = new Scanner(System.in);    
        
        x = sc.nextFloat();
        y = sc.nextFloat();
        
              if (x == 0.0 && x == 0.0) {
        	   System.out.println("Origem");
        	  }else if (x == 0.0 && y != 0.0) {
        	   System.out.println("Eixo Y");
        	  }else if (y == 0.0 && x != 0.0) {
        	   System.out.println("Eixo X");
        	  }else if (x > 0.0 && y > 0.0) {
        	   System.out.println("Q1");
        	  }else if (x < 0.0 && y < 0.0) {
        	   System.out.println("Q3");
        	  }else if (x < 0.0 && y > 0.0) {
        	   System.out.println("Q2");
        	  }else  {
        	   System.out.println("Q4");
        	  }
        
	}

}

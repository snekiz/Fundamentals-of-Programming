package LabActivities;

import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		String A1, A2, A3;
   	 
  	  Scanner input =new Scanner(System.in);
  	  A1 = input.next();
  	  A2 = input.next();
  	  A3 = input.next();

  	  if (A1.equals("vertebrado")  && A2.equals("ave") && A3.equals("carnivoro")) {
  	   System.out.print("aguia\n");
  	  }
  	  if (A1.equals("vertebrado") && A2.equals("ave") && A3.equals("onivoro")) {
  	   System.out.print("pomba\n");
  	  }
  	  if (A1.equals("vertebrado") && A2.equals("mamifero") && A3.equals("onivoro")) {
  	   System.out.print("homem\n");
  	  }
  	  if (A1.equals("vertebrado") && A2.equals("mamifero") && A3.equals("herbivoro")) {
  	   System.out.print("vaca\n");
  	  }
  	  
  	  if (A1.equals("invertebrado") && A2.equals("inseto") && A3.equals("hematofago")) {
  	   System.out.print("pulga\n");
  	  }
  	  if (A1.equals("invertebrado") && A2.equals("inseto") && A3.equals("herbivoro")) {
  	   System.out.print("lagarta\n");
  	  }
  	  if (A1.equals("invertebrado") && A2.equals("anelideo") && A3.equals("hematofago")) {
  	   System.out.print("sanguessuga\n");
  	  }
  	  if (A1.equals("invertebrado") && A2.equals("anelideo") && A3.equals("onivoro")) {
  	   System.out.print("minhoca\n");
  	  }

  	    }

  	}

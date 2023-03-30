import java.util.Scanner;
public class StringWithAsteris {

	public static void main(String[] args) {
//      Write a program that will read a string and print the string with * after each character
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a string: ");
     String s = sc.nextLine();
   
     
     for(int i = 0; i<s.length(); i++) {
    	  char a = s.charAt(i);   	  
    	   System.out.print(a + " *");
     }

	}

}

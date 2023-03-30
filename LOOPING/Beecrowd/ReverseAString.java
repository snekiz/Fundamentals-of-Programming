import java.util.Scanner;
public class ReverseAString {

	public static void main(String[] args) {
		 // Write a program that will print the reverse of the string
		Scanner sc = new Scanner(System.in);
		
        String s = sc.nextLine();
        for(int i = s.length()-1; i >= 0; --i){ 
            System.out.print(s.charAt(i));
        }
        System.out.println("");
	}

}

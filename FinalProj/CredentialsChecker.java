package FinalsProject;
import java.util.Scanner;
public class CredentialsChecker {
	 public static String username() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Username: ");
	        String inputUsername = sc.next();

	        for (int i = 0; i < AccountCreationAndLogin.Usernames.size(); i++){
	            String tempPassword = AccountCreationAndLogin.Usernames.get(i);

	            if (tempPassword.equals(inputUsername)) {
	                System.out.println("Account declined");
	                System.out.println("Reason: Username already used");
	                FOPmain.Start();
	            }
	        }
	        return inputUsername;
	    }
	 public static String password() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter your password: ");
	        String inputPassword = sc.next();

	        if (inputPassword.length() < 5) {
	            System.out.println("Account declined");
	            System.out.println("Reason: Password is too short");
	            FOPmain.Start();
	        }
	        return inputPassword;

	}
	 public static String type() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Type: ");
	        String inputType = sc.next().toLowerCase();

	        if (inputType.equals("admin") || inputType.equals("consumer")) {
	            return inputType;
	        }
	        System.out.println("Account declined");
	        System.out.println("Reason: Input Error (Type): [admin / consumer] only");
	        FOPmain.Start();
	        return inputType;
	    }

}

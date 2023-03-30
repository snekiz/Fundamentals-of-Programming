package FinalsProject;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class AccountCreationAndLogin {

	static ArrayList<String> Usernames = new ArrayList<>(); 
    static ArrayList<String> Passwords = new ArrayList<>();
    static ArrayList<String> Types = new ArrayList<>(); 

    public static void createAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Creating an account.... ");

        String inputUsername = CredentialsChecker.username();

        String inputPassword = CredentialsChecker.password();

        String inputType = CredentialsChecker.type();

        Usernames.add(inputUsername);
        Passwords.add(inputPassword);
        Types.add(inputType.toLowerCase());
        System.out.println("Account successfully created!");
        
       main.Start();
    }

    public static void Login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Account LOG-IN");

        System.out.print("Username: ");
        String inputUsername = sc.next();

        System.out.print("Password: ");
        String inputPassword = sc.next();

        int Count = 0;
        int index = 0;
        for (int i = 0; i < Usernames.size(); i++) {
            String usernameHolder = Usernames.get(i);

            if (usernameHolder.equals(inputUsername)) {
                Count++;
                index = i;
                break;
            }
        }
        if (Count != 1) {
            System.out.println("Account doesn't exist");
            Login();
        }
        String Username = Usernames.get(index);
        String Password = Passwords.get(index);
        String Type = Types.get(index);

        if (!Objects.equals(inputPassword, Password)) {
            System.out.println("Wrong password.");
            Login();
        }

        if (Type.equals("admin")) {
            System.out.println(""+"Welcome admin "+Username+"!");
           main.adminInterface();
        }
        else if (Type.equals("consumer")) {
            System.out.println(""+"Welcome "+Username+"!");
            main.consumerInterface();
        }

    }
}

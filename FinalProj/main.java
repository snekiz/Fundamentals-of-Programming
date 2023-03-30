package FinalsProject;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
              Start();
	}
	public static void Start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Running system...");
		System.out.println("[1] Create an Account");
		System.out.println("[2] Log-in");
		int selection = sc.nextInt();
		
		if(selection == 1) {
			AccountCreationAndLogin.createAccount();
		}else if(selection == 2) {
			AccountCreationAndLogin.Login();
		}else
			System.out.println("Input Error");
		   Start();
	}
	public static void consumerInterface() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Available products are the following...");
        GroceryList.DisplayItems();

        String endExitIdx = String.valueOf(GroceryList.Name.size()+1);
        System.out.println("["+(endExitIdx)+"]"+" to exit...");

        System.out.print("Do you want to purchase something?"+"\n If yes input the product number: ");
        String userInput = sc.next();
        
        
        if (userInput.equals(endExitIdx)) {
            main.Start();
        }

        else if (Integer.parseInt(userInput) > Integer.parseInt(endExitIdx) || Integer.parseInt(userInput) <= 0) {
            System.out.println("INPUT ERROR: Product index doesn't exist.");
            consumerInterface();
        }

        else if (Integer.parseInt(userInput) < Integer.parseInt(endExitIdx) && Integer.parseInt(userInput) > 0) {
            BuyInterface.Buy(userInput);
        }

        else {
            System.out.println("INPUT ERROR: Inappropriate input.");
            consumerInterface();
        }


    }

    public static void adminInterface() {
        Scanner sc = new Scanner(System.in);

        System.out.println("[1] Maintenance");
        System.out.println("[2] Display transactions");
        System.out.println("[3] to exit...");

        String aInterface = sc.next();

        if (aInterface.equals("1")) {
            adminMaintenance();
        }

        else if (aInterface.equals("2")) {
            TransactionHistory.displayTransactionHistory();
        }

        else if (aInterface.equals("3")) {
            main.Start();
        }

        else {
            System.out.println("Input Error.");
            adminInterface();
        }
    }
    
    public static void adminMaintenance() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Maintenance on going...");
        System.out.println("[1] Display");
        System.out.println("[2] Add");
        System.out.println("[3] Edit");
        System.out.println("[4] Delete");
        System.out.println("[5] to exit...");

        String userInput = sc.next();

        if (userInput.equals("1")) {
            GroceryList.DisplayItems();
            adminMaintenance();
        }

        else if (userInput.equals("2")) {
            GroceryList.Additem();
            adminMaintenance();
        }

        else if (userInput.equals("3")) {
            GroceryList.EditItem();
        }

        else if (userInput.equals("4")) {
            GroceryList.DeleteItem();
        }

        else if (userInput.equals("5")) {
            adminInterface();
        }

        else {
            System.out.println("Input Error.");
            adminMaintenance();
        }
    }
}  

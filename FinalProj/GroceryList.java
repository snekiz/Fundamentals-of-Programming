package FinalsProject;

import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class GroceryList {
	static ArrayList <String> Name = new ArrayList<>();
	static ArrayList <String> Description = new ArrayList<>();
	static ArrayList <Double> Price = new ArrayList<>();
	static ArrayList <Integer> Quantity = new ArrayList<>();
	
	
	public static void Additem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Adding products...");
		
		System.out.print("Product name: ");
		String newName = sc.nextLine();
		Name.add(newName);
		
		System.out.print("Description: ");
		String newDescription = sc.nextLine();
		Description.add(newDescription);
		
		System.out.print("Price: ");
		Double newPrice = sc.nextDouble();
		Price.add(newPrice);
		
		System.out.print("Quantity: ");
		int newQuantity = sc.nextInt();
		Quantity.add(newQuantity);
	}
	
	public static void DisplayItems() {
		DecimalFormat df = new DecimalFormat("#.##");
		for (int i = 1; i <= Name.size(); i++) {
			String pName = Name.get(i - 1);
			String pDescription = Description.get(i - 1);
			Double pPrice = Price.get(i - 1);
			int pQuantity = Quantity.get(i - 1);
			
			System.out.println(""+"["+i+"] "+pName+" - "+pDescription+" - "+"P"+df.format(pPrice)+" - "+pQuantity+" items");

		}
	}
	
	public static void EditItem() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Editing Products...");
		System.out.println("[1] product name");
		System.out.println("[2] description");
		System.out.println("[3] price");
		System.out.println("[4] quantity");
		System.out.println("[5] to exit...");
		
		int select = sc.nextInt();
		
		
		if (select == 1) {
			DisplayItems();
			System.out.println("Enter the product number: ");
			int productUpdate = sc.nextInt() - 1;
			if(productUpdate > Name.size() || productUpdate < 0) {
				System.out.println("Product Index Error");
				EditItem();
			}
			String oldInfo = Name.get(productUpdate);
			System.out.println(""+"old Name: " + oldInfo);
			System.out.print("Input new name: ");
			String newInfo = sc.next();
			
			Name.set(productUpdate, newInfo);
			FOPmain.adminMaintenance();
		}
		
		else if (select == 2) {
			DisplayItems();
			System.out.print("Enter the product number: ");
		 int productUpdate = sc.nextInt() - 1;
		 if(productUpdate > Description.size() || productUpdate < 0) {
				System.out.println("Product Index Error");
				EditItem();
		 }
		 String oldInfo = Description.get(productUpdate);
			System.out.println(""+"old Description: " + oldInfo);
			System.out.print("Input new Description: ");
			String newInfo = sc.next();
			
			Description.set(productUpdate, newInfo);
			FOPmain.adminMaintenance();
		}
		else if(select == 3) {
			DisplayItems();
			System.out.print("Enter the product number: ");
            int idxProduct = sc.nextInt() - 1;
            if (idxProduct > Price.size() || idxProduct < 0) {
                System.out.println("Index Product Error.");
                EditItem();
			
		}
            double oldInfo = Price.get(idxProduct);
            System.out.println(""+"old price(P): "+oldInfo);
            System.out.print("input new price(P): ");
            double newInfo = sc.nextDouble();

            Price.set(idxProduct, newInfo);
            FOPmain.adminMaintenance();	
	}
		else if (select == 4) {
			DisplayItems();
			System.out.print("Enter the product number: ");
			 int idxProduct = sc.nextInt() - 1;
	         if (idxProduct > Price.size() || idxProduct < 0) {
	                System.out.println("Index Product Error.");
	                EditItem();
		}
	         int oldInfo = Quantity.get(idxProduct);
	         System.out.println(""+"Old Quantity: "+oldInfo);
	         System.out.print("Input new Quantity: ");
	         int newInfo = sc.nextInt();

	         Quantity.set(idxProduct, newInfo);
	         FOPmain.adminMaintenance();
		}
		else if (select == 5) {
			FOPmain.adminInterface();
		}
		else {
			System.out.println("Input Error. ");
			FOPmain.adminMaintenance();
		}
	}
	public static void DeleteItem() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Deleting products...");
        DisplayItems();

        System.out.print("What to delete? \n Enter the product number: ");
        int deleteUserInput = sc.nextInt()-1;

        if (deleteUserInput > Name.size()) {
            System.out.println("Index Error: Can't find the product number");
            DeleteItem();
        }

        Name.remove(deleteUserInput);
        Description.remove(deleteUserInput);
        Price.remove(deleteUserInput);
        Quantity.remove(deleteUserInput);

        FOPmain.adminMaintenance();
    }

}

package FinalsProject;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BuyInterface {

	public static void Buy(String productIDX) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);

        int productIDXint = Integer.parseInt(productIDX);

    double change = TransactionHistory.userChangeRecord(productIDXint);

        System.out.println("Successful, your change is P"+df.format(change));
        main.consumerInterface();

    }

}

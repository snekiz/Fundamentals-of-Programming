import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		// do-while prints at least once even if the condition is false
		Scanner sc = new Scanner(System.in);
		System.out.println("What word do you want to loop?");
		 String s = sc.nextLine();
		 System.out.println("How many times do you want to loop this word?");
		 int n = sc.nextInt();
         int ctr = 0;
        do{
            System.out.println(s);
           ctr++;
          }while(ctr < n);
	}

}

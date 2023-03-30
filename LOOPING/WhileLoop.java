import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
           //print 5 Hello
		 int n = 1; // 1-5 = 5 iterations
           while (n <= 5){
           System.out.println("Hello!"); //5
           n++;// 5 (update/change)
       }
           //print a string n times
           String s = sc.nextLine();
           int i = sc.nextInt();
           int ctr = 0;
        
        while(ctr < i){
            System.out.println(s);
            ctr++;       
             }
        }
}

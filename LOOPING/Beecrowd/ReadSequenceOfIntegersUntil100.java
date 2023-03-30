import java.util.Scanner;

public class ReadSequenceOfIntegersUntil100 {

	public static void main(String[] args) {
		//Read sequence of integers and print done when sum is greater than or equal to 100
		Scanner in = new Scanner(System.in);
		
      int num = in.nextInt();
      int sum = num;
      while(sum < 100){
         num = in.nextInt();
         sum += num;
      }
     System.out.println("Done!");
	}

}

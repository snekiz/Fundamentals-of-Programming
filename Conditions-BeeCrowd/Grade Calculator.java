import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
     System.out.println("Enter Grade in English: ");
     double English = sc.nextDouble();
     System.out.println("Enter Grade in Math: ");
     double Math = sc.nextDouble();
     System.out.println("Enter Grade in Science: ");
     double Science = sc.nextDouble();
     System.out.println("Enter Grade in Computer: ");
     double Computer = sc.nextDouble();
     double ave = (English+Math+Science+Computer)/4; 
     System.out.println("");
     System.out.println("Average: " + ave);
     
   if(ave >= 100) {    
	   System.out.println("INVALID GRADE");
   }
   else if (ave >= 98) {  
	   System.out.println("With Highest Honors");
   }
   else if (ave >= 95) {
	   System.out.println("With High Honors");
   }
   else if(ave >= 90) {
	   System.out.println("With Honors");
   }
   else if(ave >= 75) { 
	   System.out.println("PASSED");
   }
   else {
	   System.out.println("FAILED");
   }
   
	}   

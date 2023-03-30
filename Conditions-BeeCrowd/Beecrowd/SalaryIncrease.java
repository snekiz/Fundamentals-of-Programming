package LabActivitySeclectionInJAVA;
import java.util.Scanner;
public class SalaryIncrease {

	public static void main(String[] args) {
		
		  float N, new_salary = 0, earned_money = 0;
	      int percentage = 0;
	    Scanner sc = new Scanner(System.in);
	        N = sc.nextFloat();
	        
	        if(N >= 0 && N<=400.00) {
	            percentage = 15;
	            new_salary = (float)(N+(N*(percentage/100.00)));
	            earned_money = (float)(N*(percentage/100.00));
	        }
	        else if(N >= 400.01 && N <=800.00) {
	            percentage = 12;
	            new_salary = (float)(N+(N*(percentage/100.00)));
	            earned_money = (float)(N*(percentage/100.00));
	        }
	        else if(N >= 800.01 && N <=1200.00) {
	            percentage = 10;
	            new_salary = (float)(N+(N*(percentage/100.00)));
	            earned_money = (float)(N*(percentage/100.00));     
	        }
	        else if (N >= 1200.01 && N<= 2000.00) {
	            percentage = 7;
	            new_salary = (float)(N+(N*(percentage/100.00)));
	            earned_money = (float)(N*(percentage/100.00));                        
	        }
	        else if (N >= 2000.01) {
	            percentage = 4;
	            new_salary = (float)(N+(N*(percentage/100.00)));
	            earned_money = (float)(N*(percentage/100.00));            
	        }
	        System.out.printf("Novo salario: %.2f\n", new_salary);
	        System.out.printf("Reajuste ganho: %.2f\n", earned_money);
	        System.out.println("Em percentual: "+percentage+" %");

	}

}

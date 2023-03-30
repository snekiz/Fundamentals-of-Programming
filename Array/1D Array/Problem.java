public class ArrayProb {
	public static void Prob1() {
/*Write a Java program that initializes an array of integers with some values and
then finds the sum of all the values in the array*/
	int[] num1 ={12,23,24,13,40};
    int sum = 0;
   for(int i = 0; i<num1.length; i++ ){        
      sum = sum + num1[i];
   }
     System.out.println("Sum of the arrays: "+ sum);
 
  }
	public static void Prob2() {
/*Write a Java program that initializes an array of strings with some values and then
finds the length of the longest string in the array.*/
	String[] num2 = {"Kurt", "Checker", "Armida", "KrazynesOverload"};	
	int len = 0;
	int compare = num2[0].length();
	String longest = "";
	   for(int i = 0; i<num2.length; i++) {
		   len=num2[i].length();
		   if(len>compare) {
			   compare=len;
			   longest = num2[i];
		   }
		   
	   }
	   System.out.println(longest);
		
	}
	
	public static void main(String[] args) {
	     Prob1();
	     Prob2();

	}

}

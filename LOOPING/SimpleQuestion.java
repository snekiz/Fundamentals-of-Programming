public class Simplequestion {

	public static void main(String[] args) {
		// Problem: Create a program that will ask the user a question
		// make the user answer that question, check if its correct 
		//if not deduct a life to the user and ask the question again
		// until their lives runs our or they answer correctly 
      Scanner sc = new Scanner(System.in);
     
      int lives = 3;
      int answer;
      
      while(lives > 0) {
    	  System.out.println("1+1 = ?");
    	  System.out.println("Answer : ");
    	  answer = sc.nextInt();
    	  
    	  if(answer == 2) { 
    		  break;
    		  
    	  }else lives --;
    	  System.out.println();
      }
      if(lives > 0) {
    	  System.out.println("YOU WON!");
      }else
    	  System.out.println("YOU LOST");
      
		
	}

}

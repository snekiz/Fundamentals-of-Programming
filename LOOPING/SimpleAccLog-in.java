import java.util.Scanner;

public class forLOOP {
      
	public static void main(String[] args) {
              Login();
	}
	
	public static void Login() {
		Scanner sc = new Scanner(System.in);	
		String[] usernames = {"Kurt", "Carl", "Roger"};
		String[] passwords = {"kurt123", "carl123", "roger123"};
	    
		int isExist = 0;
		   System.out.print("Enter Username: ");
		   String name = sc.nextLine();
		   System.out.print("Enter Password: ");
	       String pass = sc.nextLine();  
	       
	     for(int i = 0; i<usernames.length; i++) {  	 
	        if(name.equals(usernames[i]) && (pass.equals(passwords[i]))) {
	    		   isExist++;
	    		   break;
	    	 }
	      }
	     
	         if(isExist != 1) {
	        	 System.out.println("Account not found");
	        	 Login();
	}else
		System.out.println("Welcome " +name+ "!");
	
  }
}

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
		String email[] = {"ace@gmail.com", "bogar@gmail.com","shesh@gmail.com"};
		String username[] = {"ace","bogart","shesh"};
		String password[] = {"ace123", "bogart123", "shesh123"};
		int index = sc.nextInt();
		
		if(index == 0) {
			System.out.println("Index: " + index);
			System.out.println("Email: " + email[0]);
			System.out.println("Username: " + username[0]);
			System.out.println("Password: " + password[0]);
		}else if(index == 1) {
			System.out.println("Index: " + index);
			System.out.println("Email: " + email[1]);
			System.out.println("Username: " + username[1]);
			System.out.println("Password: " + password[1]);
		}else if(index == 2) {
			System.out.println("Index: " + index);
			System.out.println("Email: " + email[2]);
			System.out.println("Username: " + username[2]);
			System.out.println("Password: " + password[2]);
		}else {
			System.out.println("Index not found");
		}
		
	}

}

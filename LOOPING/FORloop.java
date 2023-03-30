public class ForLOOP {

	public static void main(String[] args) {
		// Print even numbers from 1 to n
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
    for(int i=1; i<=n; i++){           
      if(i % 2 == 0){
          System.out.println(i);
     }	
    }

  }
}

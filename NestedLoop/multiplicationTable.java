public class multiplicationTable {

	public static void main(String[] args) {
		// program a multiplication table
		for (int i = 1; i <= 10; i++) { //10 rows
            for (int j = 1; j <= 10; j++) { //10 columns
                System.out.print(i * j + "\t");
            }
            System.out.println("");
        }

	}

}

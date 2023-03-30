public class NestedLoopExamples {

	public static void main(String[] args) {
		// Nested loops - definition, components (outer loop, inner loop)
     for (int i = 0; i < 5; i++) { // outer loop (rows)
          for (int j = 0; j < 10; j++) { //inner loop (columns)
              System.out.print("+");
          }
         System.out.println("");
      }
     //NESTED LOOP SAMPLE
     for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 5; j++) {
             System.out.print("*");
         }
         System.out.println("");
     }
}

}

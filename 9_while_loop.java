public class Whileloop {
    public static void main(String[] args) {
        /* while loop loops through a block of code
         * as long as a specified condition is true
         * while (condition) {
         *    // code block to be executed
         * }
        */
        // output = 0 1 2 3 4
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
      
      
        /* the Do/While loop
         * the do/while loop is a variant of the while loop
         * this loop will EXECUTE the code block ONCE
         * BEFORE checking if the condition is true
         * then it will rrepeat the loop as long as the condition is true
         * do {
         *    // code block to be executed
         * } while (condition)
        */
        // output = 0 1 2 3 4
        int i = 0;
        do {
          System.out.println(i);
          i++;
        } while (i < 5);
    }
}

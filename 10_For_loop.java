/* for loop
 * for (statement 1; statement 2; statement 3) {
 *    // code block to be executed
 * }
 * statement 1: is executed ONE time BEFORE the execution of the code block
 * statement 2: defines the condition for executing the code block
 * statement 3: is executed (every time) after the code block has been executed
*/

public class Forloop {
    public static void main(String[] args) {
        // output = 0 1 2 3 4
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // example2
        // output = 0 2 4 6 8 10
        for (int i =0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
      
        /* For-each loop
         * it is used exclusively to loop through elements in an array
         * for (type variable : arrayname) {
         *    // code block to be executed
         * }
        */
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}

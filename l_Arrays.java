/* Arrays
 * arrays are used to store multiple values in a single variable
 * instead of declariing separate variables for each value.
 * to declare an array, define the variable type with SQUARE BRACKET
*/

String[] cars;
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
int[] myNum = {10, 20, 30, 40};

public class Arrays {
    public static void main(String[] args) {
        // access the elements of an array
        // output = Volvo as its index is 0
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
      
        // change an array element
        // output = Opel
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        System.out.println(cars[0]);
      
        // array length
        // output = 4 because there are 4 elements
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars.length);
      
        // loop through an array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
      
        // loop through an array with for each
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
      
      
        // Multi-dimensional Arrays
        // to create a 2d array, add each array within its own set of curly braces
        int[][] myNumbers = {{1,2,3,4} , {5,6,7}};
        /* to access the element
         * [a][b]
         * [a] to tell which array
         * [b] to tell which element in array [a]
         * in the following example [1] represents {5,6,7}
         * [2] means 7
        */
        int x = myNumbers[1][2];
        System.out.println(x);
      
      // forloops to get elements of 2d array
      int[][] myNumbers = {{1,2,3,4} , {5,6,7}};
      // myNumbers.length tell how many dimensions are there in the array
      // in this case myNumbers.length = 2
      // thus the following forloop means stop till reach the last dimention
      for (int i = 0; i < myNumbers.length; i++) {
          for (int j = 0; j < myNumbers[i].length; j++) {
              System.out.println(myNumbers[i][j]);
          }
      }
      // output = 1 2 3 4 5 6 7
      
    }
}


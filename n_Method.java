/* a Method is a block of code which only runs when it is called
 * you can pass data, known as parameters, into a method
 * or you can understand it as Functions
 * you can define the code once and use it many times
 * a Method must be declared within a class
 * it is defined with the name of the method followed by ()
 * System.out.println() is a pre-defined method in Java
 * public class Methods {
 *    static void myMethod() {
 *        // code to be executed
 *    }
 * }
 * myMethod() is the name of the method
 * void means this method doesnt have return value
*/
 public class Methods {
    static void myMethod() {
        System.out.println("I just got executed!");
    }
    public static void main(String[] args) {
        myMethod();
        myMethod();
    }
    // output = I just got executed! (two times)
   
   // method parameters
   static void myMethod(String fname) {
      System.out.println(fname + " lastname");
   }
   public static void main(String[] args) {
      myMethod("Liam");
      myMethod("Andie");
   }
   // output = Liam lastname     \n      Andie lastname
   
   // Return values
   // if you want the method to return a value, use primitive data type (int, char) instead of void
   static int myMethod(int x) {
      return 5 + x;
   }
   public static void main(String[] args) {
      System.out.println(myMethod(3));
   }
   // output = 8
   
   // two parameters with return values
   // output = 8
   // or we can use another variable to store the result see the comment below
   static int myMethod(int x, int y) {
      return x + y;
   }
   public static void main(String[] args) {
      // int z = myMethod(5,3);
      // System.out.println(z);
      System.out.println(myMethod(5,3));
   }
   
   // a method with if..else statement
   static void checkAge(int age) {
      if (age < 18) {
          System.out.println("access denied");
      } else {
          System.out.println("access granted");
      }
     /* or we can use the simple way
      * String result = (age < 18) ? ("access denied") : ("access granted");
        System.out.println(result);
     */
   }
   public static void main(String[] args) {
      checkAge(13);
   }
   
}

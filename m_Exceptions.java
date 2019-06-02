/* when executing Java code, different errors can occur:
 * coding errors made by the programmer
 * errors due to wrong input, or other unforeseeable things
 * when an error occurs, java will normally stop and generate an error message
 * which means: Java will throw an Exception(throw an error)
*/

/* Java Try and Catch
 * Try statement, allows you to define a block of code to be tested for errors while it is being executed
 * Catch statement allows you to defind a block of code to be executed, if an error occurs in try block
 * try {
 *    // block of code
 * } catch (Exception e) {
 *    // block of code to handle errors
 * }
 * Finally statement lets you execute code, after try...catch, REGARDLESS of the result
*/
public class Exceptions {
    public static void main(String[] args) {
        // test to see if there are errors while executing
        try {
            int[] Numbers = {1,2,3,4};
            System.out.println(Numbers[10]);
            // error occurs in this case as the index 10 doesnt even exist
        } catch (Exception e) {
            // after the error excuted, use the catch statement to handle the case
            System.out.println("Something went wrong");
        } finally {
            System.out.println("The \'try catch\' is finished.");
        }
        // output = Something went wrong
        //          The 'try catch' is finished.
    }
}


/* the Throw Keyword
 * the throw statement allows you to create a custom error.
 * Throw statement is used together with an Exception Type
 * there are many exception types in java:
 * ArithmeticException, ClassNotFoundException, ArrayIndexOutOfBoundsException...
 * example
 * throw an exception if Age is below 18 print "access denied"
 * if age is 18 or older print "access granted"
*/


public class ThrowPrac {
    // static void xxx is a function
    static void checkAge (int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied");
        } else {
            System.out.println("Access granted");
        }
    }
      
    public static void main(String[] args) {
        checkAge(15);
    }
}

/* output
 * Exception in thread "main" java.lang.ArithmeticException: Access denied
        	at Exceptions.checkAge(Exceptions.java:4)
        	at Exceptions.main(Exceptions.java:11)
*/


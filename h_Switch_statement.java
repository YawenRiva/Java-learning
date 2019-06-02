/* java switch statements
 * is used to select one of many code blocks to be excuted
 * switch (expression) {
 *    case x:
 *      // code block
 *      break;
 *    case y:
 *      // code block
 *      break;
 *    default:
 *      // code block
 * }
 * the switch expression is evaluated once
 * the value of the expression is compared with values of each case.
 * if there is a match, the associated block of code is executed
 * the break and default keywords are optional
*/
public class Switches {
    public static void main(String[] args) {
        // first switch case, output = Thursday
        // if there is no break for each case
        // the output would be: Thursday  Friday
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            
          // Default including example
          // output = This is the weekend
           int day = 6;
           switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("This is the weekend");
            }
    }
}

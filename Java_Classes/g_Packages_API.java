/* Package in Java is used to group related classes.
 * think of it as a folder in a file directory, avoid name conflict
 * 1. Build-in Packages (packages from Java API)
 * 2. User-defined Packages (create your own packages)
*/

// import a class
// Scanner- used to get user input
import java.util.Scanner;
class Myclass {
  Scanner myObj = new Scanner(System.in);
  System.out.println("Enter username: ");
  String userName = myObj.nextLine();
  System.out.println("Username is: " + userName);
}

// user defined package
package mypack;
class MyPackageClass { 
  public static void main(String[] args) { 
    System.out.println("This is my package!"); 
  } 
}

C:\Users\Your Name>javac MyPackageClass.java
C:\Users\Your Name>javac -d . MyPackageClass.java
C:\Users\Your Name>java mypack.MyPackageClass

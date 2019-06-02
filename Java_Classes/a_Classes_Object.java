/* java is an object-oriented programming language
 * everything in java is associated with classes and objects
 * along with its attributes and methods
 * eg. in real life, car is an object
       the attributes of car are like weight and color
       the methods of car are like drive and brake
 * A class is like an object constructor/ blueprint for creating objects.
 */

// to create a class, use the keyword class:
public class MyClass {
  int x = 5;
}

/* creating an object
 * an object is created from a class.
 * to create an object of Myclass
 * specify the class name, followed by the object name, and use the keyword new
 * in the following example: output would be 5
*/
public class MyClass {
  int x = 5;
  // the class is like an object constructor
  public static void main(String[] args) {
    // now i want to create an object called myObj
    // do the following line to create myObj
    MyClass myObj1 = new MyClass();
    MyClass myObj2 = new MyClass();
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
    // output = 5 5
  }
}

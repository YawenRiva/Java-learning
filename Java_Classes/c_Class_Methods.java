
// methods are declared within class
public class MyClass {
  static void myMethod() {
    System.out.println("Hello World!");
  }
  public static void main(String[] args) {
    myMethod();
  }
}


/* Static and Public
 * java programs have either static or public attributes and methods
 * Static = it can be accessed without creating an object of the class
 * public = we can only be accessed by object
*/
public class Myclass {
  // static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating object");
  }
  // public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }
  // main method
  public static void main(String[] args) {
    // call the static method
    myStaticMethod();
    // create an object of Myclass
    Myclass myObj = new MyClass();
    myObj.myPublicMethod();
  }
}


/* Access Methods with an object
 * create a Car object named myCar
 * call the fullThrottle() and speed() methods on the myCar object
*/
public class Car {
  // create a fullthrottle() method
  public void fullthrottle() {
    System.out.println("the car is going as fast as it can!");
  }
  // create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }
  // inside main, call the methods on the myCar object
  Car myCar = new Car();
  myCar.fullthrottle();
  myCar.speed(200);
}
// output: The car is going as fast as it can!
//         Max speed is: 200


/* Using multiple Classes
 * it is good to practice to create an object of a class and access it in another class
 * Car.java
 * OtherClass.java
*/

// Car.java file
public class Car {
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }
}
// Otherclass.java
class OtherClass {
  public static void main(String[] args) {
    Car myCar = new Car();
    myCar.fullThrottle();
    myCar.speed(200); 
  }
}

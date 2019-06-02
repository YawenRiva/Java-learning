/* A constructor in Java is a special method that is used to Initialize objects
 * the constructor is called when an object of a class is created
 * it can be used to set initial values for object attribute
 * NOTE: the constructor name must MATCH the class name
 *       and it CANNOT have a return type (like void)
 *       constructor is CALLED, Once the object is created
*/

// create a constructor
public class MyClass {
  // this (int x) is a class attribute
  int x;
  // now create a class constructor for the Myclass class
  public MyClass() {
    // set an initial value for the class attribute x
    x = 5;
  }
  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    // now create an object of class MyClass (this will ca;; the constructor)
    System.out.println(myObj.x);
    // print out the value of x 
  }
  // output = 5
}

// another example
public class Car {
  int modelYear;
  String modelName;
  public Car(int year, String name) {
    modelYear = year;
    modelName = name;
  }
  public static void main(String[] args) {
    Car myCar = new Car(1969,"Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}

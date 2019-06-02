/* the Public keyword is an Access Modifier
 * meaning that its used to set the access level for classes, attributes, methods, constructors
 * we divide modifiers into two groups
 * 1. Access modifiers: controls the access level
 * 2. Non-Access modifiers: do not control access level but provides other functionality
*/

// CLASS
// access modifier: public
// the class is accessible by any other class
public class MyClass {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
// access modifier: default
// the class is onlt accessible by classes in the same package
class MyClass {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}

// ATTRIBUTES, METHODS, CONSTRUCTORS
// public: the code is accessible for all classes
// private: the code is only accessible within the declared class
// default: the code is only accessible in the same package
// protected: the code is accessible in the same package and subclasses

/* NON-ACCESS MODIFIERS
 * final: the class cannot be inherited by other classes
 * abstract: the class cannot be used to create object (toaccess an abstract class it must be inherited from another class)
*/

// declare attributes as final
public class MyClass {
  final int x = 10;
  final double PI = 3.14;
  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    myObj.x = 50;
    // will generate an error: cannot assign a value to a final variable
    myObj.PI = 25;
    // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}

// Static method means that it can accessed without creating object
// see the previous files of the static/public method code

// abstract method belongs to an abstract class
// and it doesnt have a body the body is provided by subclass
// Person.java
abstract class Person {
  /*public*/ String fname = "John";
  /*public*/ int age = 24;
  public abstract void study(); // this is the abstract method
}
// Subclass (inherit from Person)
class Student extends Person {
  public int graduationYear = 2018;
  public void study() {
    // the body of the abstract method is provide here
    System.out.println("Studying all day long");
  }
}
// now, filename: MyClass.java
class Myclass {
  public static void main(String[] args) {
    // create an object of the student class
    // which is a inherits attributes and methods from Person
    Student myObj = new Student();
    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("GraduationYear: " + myObj.graduationYear);
    myObj.study();
  }
}
  
}







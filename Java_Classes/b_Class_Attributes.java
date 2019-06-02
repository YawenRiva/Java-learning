
public class MyClass {
  int x = 5;
  int y = 3;
  // create an object called "myObj" and print the value of x
  public static void main(String[] args) {
    MyClass myObj = new Myclass();
    System.out.println(myObj.x);
    // the output is 5
  }
}

// Modify attributes
public class MyClass {
  int x = 5;
  int y = 3;
  // create an object called "myObj" and print the value of x
  public static void main(String[] args) {
    MyClass myObj = new Myclass();
    myObj.x = 40;
    System.out.println(myObj.x);
    // now, the output is 40
  }
}

// Final keyword is useful when you want a variable to always store the same value
public class MyClass {
  final int x = 5;
  int y = 3;
  // create an object called "myObj" and print the value of x
  public static void main(String[] args) {
    MyClass myObj = new Myclass();
    myObj.x = 40;
    System.out.println(myObj.x);
    // because of the final int x = 5, we cannot change anything, so error contains in the output
  }
}

// Multiple attributes
public class Person {
  String fname = "John";
  String lname = "Doe";
  int age = 24;
  
  public static void main(String[] args) {
    Person myObj = new Person();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
  }
  //output = Name: John Doe
  //         Age: 24
}

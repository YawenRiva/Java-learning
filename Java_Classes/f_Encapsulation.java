/* Encapsulation, make sure that "sensitive" data is HIDDEN from users
 * to achieve this, we need to:
 * decalre class variables/attributes as private
 * provide public SETTER and GETTER methods to access and update the value of a private variable
*/

// Private variabe can only be access within the same class
// however, its possible to access them if we provide public getter and setter
// GET/writeonly method returns the variable value
// SET/readonly method sets the vlue
public class Person {
  // private = restricted access
  private String name;
  // getter: returns the value of the variable, name
  public String getName() {
    return name;
  }
  // setter
  // takes a parameter, newName, and assigns it to the, name, variable
  // this keyword is used to refer to the current object
  public void setName(String newNmae) {
    this.bane = newName;
  }
}
public class MyClass {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.setName("John");
    System.out.println(myObj.getName());
  }
  // output = John
}

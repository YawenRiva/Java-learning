/* It is possible to inherit Attributes and Methods from one class to another
 * 1. subclass(child) - the class that inherits from another class
 * 2. superclass(parent) - the class being inherited from
 * to nherit from a class, use the extends keyword.
*/
class Vehicle {
  protected String brand = "Ford";
  // this is the Vehicle attribute
  // if it is a private, the Car class cannot access it
  // the protected modifier always keeps the parent-child relationship
  
  // because it is a parent/superclass it doesnt has to have a main()
  public void honk() {
    System.out.println("Tuut!");
  }
  // this honk() is a public method : what can the object do
}

class Car extends Vehicle {
  /* as it is extends from the Vehicle, so it has:
   * String brand = "Ford";
   * public void honk()
  */
  private String modelName = "Mustang";
  // this is a Car attribute
  
  public static void main(String[] args) {
    // even it is the inherited class, the honk() is a public method
    // we need to class new object newCar to call the public method
    Car myCar = new Car();
    myCar.honk();
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}

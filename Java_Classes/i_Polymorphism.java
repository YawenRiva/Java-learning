/* polymorphism means "many forms"
 * it occurs when we have many classes that are related to each other by inheritance
*/

/* example: Animal
 * SuperClass called Animal, with method called animalSound()
 * Subclass: pigs, cats, dogs...
*/
class Animal {
  public void animalSound() {
    System.out.println("The animal makes sound");
  }
}
class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}
class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}
//  now we create the pig and dog object as the methods are public
class MyMainClass {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object

    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}

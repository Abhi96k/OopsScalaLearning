package OopsLearning

/**
 * Demonstrates Inheritance, Method Overriding, Use of super, and final members in Scala.
 */

// -------------------------------
// Base class example
// -------------------------------
class Animal {
  /**
   * Prints a generic animal sound.
   */
  def sound(): Unit = {
    println("Animal makes a sound")
  }

  /**
   * Prints a generic animal eating action.
   */
  def eat(): Unit = {
    println("Animal eats food")
  }

  /**
   * A final method cannot be overridden in subclasses.
   */
  final def sleep(): Unit = {
    println("Animal sleeps")
  }
}

// -------------------------------
// Derived class with method overriding and super
// -------------------------------
class Dog extends Animal {
  /**
   * Overrides the sound method and calls the parent method using super.
   */
  override def sound(): Unit = {
    println("Dog barks")
    super.sound() // Call the parent class method
  }

  /**
   * Overrides the eat method and calls the parent method using super.
   */
  override def eat(): Unit = {
    println("Dog eats bones")
    super.eat() // Call the parent class method
  }

  // Uncommenting the following will cause a compilation error due to final in base class
  // override def sleep(): Unit = {
  //   println("Dog sleeps")
  // }
}

// -------------------------------
// Another derived class example
// -------------------------------
class Cat extends Animal {
  override def sound(): Unit = {
    println("Cat meows")
    super.sound()
  }

  override def eat(): Unit = {
    println("Cat eats fish")
    super.eat()
  }
}

// -------------------------------
// Example usage
// -------------------------------
object InheritananceSuper extends App {
  println("Dog Example:")
  val dog = new Dog
  dog.sound() // Output: Dog barks \n Animal makes a sound
  dog.eat()   // Output: Dog eats bones \n Animal eats food
  dog.sleep() // Output: Animal sleeps

  println("\nCat Example:")
  val cat = new Cat
  cat.sound() // Output: Cat meows \n Animal makes a sound
  cat.eat()   // Output: Cat eats fish \n Animal eats food
  cat.sleep() // Output: Animal sleeps

  // Polymorphism example
  println("\nPolymorphism Example:")
  val animals: List[Animal] = List(new Dog, new Cat)
  animals.foreach(_.sound())
}

/*
Output:
Dog Example:
Dog barks
Animal makes a sound
Dog eats bones
Animal eats food
Animal sleeps

Cat Example:
Cat meows
Animal makes a sound
Cat eats fish
Animal eats food
Animal sleeps

Polymorphism Example:
Dog barks
Animal makes a sound
Cat meows
Animal makes a sound
*/

// Note: final members cannot be overridden in subclasses.

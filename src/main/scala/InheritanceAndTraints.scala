package OopsLearning

/**
 * Demonstrates Inheritance, Traits, Constructors, and Auxiliary Constructors in Scala.
 */
object InheritanceAndTraints extends App {

  // -------------------------------
  // Inheritance Example
  // -------------------------------

  /**
   * Base class representing an Animal.
   */
  class Animal {
    def eat(): Unit = {
      println("Animal is eating")
    }
  }

  /**
   * Dog class inherits from Animal and adds its own methods.
   */
  class Dog extends Animal {
    def drink(): Unit = {
      println("Dog is drinking")
    }
    def crunch: Unit = {
      eat()
      println("Dog is crunching")
    }
  }

  /**
   * Cat class inherits from Dog and overrides the drink method.
   */
  class Cat extends Dog {
    override def drink(): Unit = {
      println("Cat is drinking")
    }
  }

  // Usage Example
  val dog = new Dog
  dog.crunch

  // -------------------------------
  // Constructors and Auxiliary Constructors
  // -------------------------------

  /**
   * Person class with primary and auxiliary constructors.
   * @param name Name of the person
   * @param age Age of the person
   */
  class Person(name: String, age: Int) {
    // Auxiliary constructor for initializing with just a name
    def this(name: String) = {
      this(name, 0) // Default age is 0
    }
  }

  /**
   * Adult class extends Person and adds an idCard.
   */
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

  /**
   * Child class extends Person and provides an auxiliary constructor.
   */
  class Child(name: String, age: Int) extends Person(name, age) {
    // Auxiliary constructor for initializing with just a name
    def this(name: String) = {
      this(name, 0) // Default age is 0
    }
  }

  // Example usage
  val person1 = new Person("Alice", 30)
  val person2 = new Person("Bob")
  val adult = new Adult("Charlie", 40, "ID123")
  val child1 = new Child("Daisy", 5)
  val child2 = new Child("Eve")

  println(s"Created persons: ${person1}, ${person2}, ${adult}, ${child1}, ${child2}")
  // Note: The above println will not work as expected since Person does not have a toString method.
}

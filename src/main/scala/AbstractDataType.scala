package OopsLearning

object AbstractDataType extends App {

   /**
    * Abstract class representing a generic Animal.
    * This class cannot be instantiated directly and serves as a blueprint for specific animal types.
    */
   abstract class Animal {
     /**
      * Abstract field representing the type of creature.
      * Must be implemented by subclasses.
      */
     val creatureType: String

     /**
      * Abstract method representing the eating behavior of the animal.
      * Must be implemented by subclasses.
      */
     def eat(): Unit
   }

   /**
    * Concrete class representing a Dog.
    * Provides specific implementations for the abstract members of the Animal class.
    */
   class Dog extends Animal {
      /**
       * Concrete implementation of the creatureType field for Dog.
       */
      override val creatureType: String = "Canine"

      /**
       * Concrete implementation of the eat method for Dog.
       * Prints a message indicating the eating behavior of a dog.
       */
      override def eat(): Unit = println("Dog eats bones")
   }

   /**
    * Concrete class representing a Cat.
    * Provides specific implementations for the abstract members of the Animal class.
    */
   class Cat extends Animal {
      /**
       * Concrete implementation of the creatureType field for Cat.
       */
      override val creatureType: String = "Feline"

      /**
       * Concrete implementation of the eat method for Cat.
       * Prints a message indicating the eating behavior of a cat.
       */
      override def eat(): Unit = println("Cat eats fish")
   }

   // Example usage
   val dog = new Dog
   println(s"A dog is a ${dog.creatureType}.")
   dog.eat()

   val cat = new Cat
   println(s"A cat is a ${cat.creatureType}.")
   cat.eat()
}

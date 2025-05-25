package OopsLearning

object Traid2Learning extends App {

  abstract class Animal {
    val creatureType: String
    def eat(): Unit
  }
  class Dog extends Animal {
    override val creatureType: String = "Canine"
    override def eat(): Unit = println("Dog eats bones")
  }

  trait carnivore {
    def eat(animal: Animal): Unit
  }

  class Crocodile extends Animal with carnivore {
    override val creatureType: String = "Crocodile"
    override def eat(): Unit = println("Crocodile eats meat")

    override def eat(animal: Animal): Unit = {
      println(s"Crocodile eats ${animal.creatureType}")
    }
  }

  val dog = new Dog
  val crocodile = new Crocodile
  crocodile.eat(dog) // Output: Crocodile eats Canine
  dog.eat() // Output: Dog eats bones
  crocodile.eat() // Output: Crocodile eats meat

}

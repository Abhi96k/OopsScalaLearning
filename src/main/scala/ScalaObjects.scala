package OopsLearning

object ScalaObjects extends App {
//scala does not have class level functionality like java means "static" keyword is not available
  // In Scala, we use objects to define singleton instances
  // Objects can have methods and fields, similar to static members in Java

  object MathUtils {
    // A method to calculate the square of a number
    def square(x: Int): Int = x * x

    // A method to calculate the cube of a number
    def cube(x: Int): Int = x * x * x

    // A factory method to create a Person instance
    // This method is not necessary, but demonstrates how to create instances
    // using an object
    def from(mother : String, father: String): Person = new Person("Abhishek")
  }
  // A simple class to demonstrate the use of objects
  class Person(val name: String) {
    // You can define methods and fields in a class
    def greet(): String = s"Hello, my name is $name"
  }

  // Using the MathUtils object
  println(MathUtils.square(5)) // Output: 25
  println(MathUtils.cube(3))   // Output: 27

  //single instance object
  val person=MathUtils
  println(person.square(4)) // Output: 16
  val person2=MathUtils
  println(person2.cube(2))   // Output: 8

  println(person == person2) // Output: true, both refer to the same instance

  // Creating a Person instance using the factory method
  val abhishek = MathUtils.from("Mother", "Father")

  println(s"Created a person named: ${abhishek.name}") // Output: Created a person named: Abhishek
  println(abhishek.greet()) // Output: Hello, my name is Abhishek
}


package OopsLearning

// Class definition with class parameters
// By default, class parameters are not accessible as fields outside the class
// To make them accessible, use `val` (read-only) or `var` (read-write)
class Person(val name: String, val age: Int) {
  // Now, `name` and `age` are class fields and can be accessed from outside the class

  // Example: You can define methods that use these fields
  def greet(): String = s"Hello, my name is $name and I am $age years old."
}

// Object with main method (App trait) to run the code
object OOpsBasic extends App {
  // Creating an instance of Person
  val person = new Person("Abhishek", 22)

  // Accessing fields directly because they are declared with `val`
  println(s"Name: ${person.name}, Age: ${person.age}")

  // Calling a method of the class
  println(person.greet())
}

/*
Documentation:

1. Class Parameters vs Fields:
   - In Scala, class parameters (e.g., `name: String`) are not fields by default.
   - To make them accessible as fields, use `val` (for immutable) or `var` (for mutable).
   - Example:
     class Person(val name: String, var age: Int)

2. Access Modifiers:
   - `val` makes the field read-only (cannot be reassigned).
   - `var` makes the field mutable (can be reassigned).

3. Accessing Fields:
   - If you do not use `val` or `var`, you cannot access the parameter outside the class.
   - Example:
     class Person(name: String) // `name` is not accessible outside

4. Example Usage:
   val p = new Person("Alice", 25)
   println(p.name) // Allowed if `name` is `val` or `var`

5. Methods:
   - You can define methods inside the class that use these fields.

6. Summary:
   - Always use `val` or `var` in the constructor if you want to access parameters as fields.
*/
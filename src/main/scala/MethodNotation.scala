package OopsLearning

import scala.language.postfixOps

object MethodNotation extends App {

  class Person(val name:String,favroiteMovie:String) {

    def likes(movie:String):Boolean={
      movie == favroiteMovie
    }
  }
   val person = new Person("Abhishek", "Inception")
   println(person.likes("Inception")) // true
   println(person likes "Inception") // true, using infix notation

}

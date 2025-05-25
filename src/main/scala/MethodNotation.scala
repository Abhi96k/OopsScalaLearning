package OopsLearning

import scala.language.postfixOps

object MethodNotation extends App {

  class Person(val name:String,favroiteMovie:String) {

    def likes(movie:String):Boolean={
      movie == favroiteMovie
    }

    def hangoutName(person: Person):String=s"${this.name} hangs out with ${person.name}"

    def + (person: Person): String = {
      s"${this.name} is friends with ${person.name}"
    }

    //prefix operator Notation
    def unary_! : String = s"$name, what the heck are you doing?"

    //postfix operator Notation
    //availbe only in without parameters
    def isAlive: String = s"$name is alive"


  }
   val person = new Person("Abhishek", "Inception")
   println(person.likes("Inception")) // true
   println(person likes "Inception") // true, using infix notation

   val person2=new Person("John", "Avatar")
    println(person hangoutName person2) // Abhishek hangs out with John

    println(person + person2) // Abhishek is friends with John
    println(person.+ (person2)) // Abhishek is friends with John, using method notation



}

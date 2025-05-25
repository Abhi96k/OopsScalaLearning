package OopsLearning

object traitsLearning extends App{

  trait Porsche {
    var make:String= "Porsche"
    var model:String= "911"
    var fuel: String = "Petrol"
    var year: Int = 2023

    def start(): Unit = {
      println(s"$make $model is starting with $fuel fuel.")
    }
    def stop(): Unit = {
      println(s"$make $model is stopping.")
    }
    def accelerate(): Unit = {
      println(s"$make $model is accelerating.")
    }
  }

  // Concrete class implementing the Porsche trait
  class MyPorsche extends Porsche {
    override def start(): Unit = {
      println(s"$make $model is roaring to life!")
    }

    override def accelerate(): Unit = {
      println(s"$make $model is speeding up!")
    }
  }

  class MyPorsche2 extends Porsche {
    override def start(): Unit = {
      println(s"$make $model is starting with a smooth purr.")
    }

    override def accelerate(): Unit = {
      println(s"$make $model is zooming down the road!")
    }
  }


  val myPorsche = new MyPorsche
  myPorsche.start()        // Output: Porsche 911 is roaring to life!
  myPorsche.accelerate()   // Output: Porsche 911 is speeding up!
  myPorsche.stop()         // Output: Porsche 911 is stopping.

  val myPorsche2 = new MyPorsche2
  myPorsche2.start()        // Output: Porsche 911 is starting with a smooth purr.
  myPorsche2.accelerate()   // Output: Porsche 911 is zooming down the road!
  myPorsche2.stop()         // Output: Porsche 911 is stopping.

}


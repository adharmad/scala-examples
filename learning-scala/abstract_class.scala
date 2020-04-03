// abstract classes

abstract class Car {
  val year: Int
  val automatic: Boolean = true
  def make: String
}

class Toyota(val year: Int) extends Car {
  def make = "Toyota"
}

// this will raise error
//val c = new Car() 

val c1 = new Toyota(2006)
println (c1)

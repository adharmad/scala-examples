// abstract classes

// abstract class Car
abstract class Car {
  val year: Int
  val electric: Boolean
  def make: String
  override def toString = make + " car from year " + year + " and is " + (if (electric) "" else "not") + " electric"
}

// concrete class Toyota
class Toyota(val year: Int, val electric: Boolean) extends Car {
  def make = "Toyota"
}

// concrete class Tesla
class Tesla(val year: Int, val electric: Boolean) extends Car {
  def make = "Tesla"
}

// this will raise error
//val c = new Car()

val car1 = new Toyota(2006, false)
println (car1)

val car2 = new Tesla(2016, true)
println (car2)

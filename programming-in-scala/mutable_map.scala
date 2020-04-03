import scala.collection.mutable.Map

val myMap = Map[Int, String]()

myMap += (1 -> "Test")
myMap += (2 -> "kashmira")
myMap += (3 -> "Another")
myMap += (4 -> "this one")

println(myMap)

myMap += (1 -> "Modified test")

println(myMap)
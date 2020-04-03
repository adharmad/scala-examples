// case class

case class Animal(name: String, isMammal: Boolean)

val dog = Animal("dog", true)
val tuna = Animal("tune", false)

val s = dog match {
  case Animal(_, true) => "This is a mammal"
  case Animal(_, false) => "This is NOT a mammal"
}

println(s)

// A very basic class

class User(n: String) {
	val name: String = n
	def greet: String = s"Hello $name"
    override def toString = "My name is " + name
}

val u1 = new User("Tom")
val u2 = new User("John")
val u3 = new User("Harry")

val myList = List[User](u1, u2, u3)
for (elem <- myList) {
  println(elem)
  println(elem.greet)
}


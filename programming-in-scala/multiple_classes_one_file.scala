class A {
  def callA(): String = "calling A"
}

class B {
  def callB(): String = "calling B"
}

object entry {
  def main(args: Array[String]) {
    val a = new A
    val b = new B

    println(a.callA())
    println(b.callB())

    println("done")
  }
}

entry.main(args)

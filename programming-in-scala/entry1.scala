object entry1 {
  def main(args: Array[String]) {
    val a = new A
    val b = new B

    println(a.callA())
    println(b.callB())

    println("done")
  }
}

object call_complex {
  def main(args: Array[String]) {
    val c1 = new Complex(1, 2)
    println(c1)

    val c2 = new Complex(3, 4)
    println(c2)

    val c3 = c1 + c2
    println("Sum: " + c3)

    val c4 = c1 - c2
    println("Difference: " + c4)

    val c5 = c1 * c2
    println("Product: " + c5)


  }
}


call_complex.main(args)

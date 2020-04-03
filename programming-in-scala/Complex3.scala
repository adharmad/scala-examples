
// complex class

class Complex(real: Double, imaginary: Double) {
    def re() = real
    def im() = imaginary

    override def toString() = 
        "" + re + (if (im < 0) "" else "+") + im + "i"
}

object Complex {
	def add(c1 : Complex, c2 : Complex) : Complex = {
		val c = new Complex(c1.re() + c2.re(), c1.re() + c2.re())
		return c
	}

}

val c1 = new Complex(1.1, 2.2)
val c2 = new Complex(4.4, 3.3)

val c = Complex.add(c1, c2)

println(c)
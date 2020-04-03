// complex class

class Complex(real: Double, imaginary: Double) {
    def re() = real
    def im() = imaginary

    override def toString() = 
        "" + re + (if (im < 0) "" else "+") + im + "i"
}

val c = new Complex(1.1, 2.2)
println("Real = " + c.re())
println("Imaginary = " + c.im())
println("c = " + c)


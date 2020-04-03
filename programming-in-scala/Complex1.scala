class Complex(real: double, imaginary: double) {
    def re() = real
    def im() = imaginary

    override def toString() = 
        "" + re + (if (im < 0) "" else "+") + im + "i"

}


object ComplexNumbers {
    def main(args: Array[String]) {
        def c = new Complex(1.1, 2.2);
        println("imaginary part = " + c.im());
        println(c);
    }
}

class Complex(re: Int, im: Int) {
  val real: Int = re
  val imag: Int = im

  override def toString = real + (if (imag <0) "-" else "+") + "i" + (if (imag <0) (-imag) else imag)

  def + (that: Complex): Complex = new Complex(
    real + that.real,
    imag + that.imag
  )

  def - (that: Complex): Complex = new Complex(
    real - that.real,
    imag - that.imag  
  )

  def * (that: Complex): Complex = new Complex(
    real * that.real - imag * that.imag,
    real * that.imag + imag * that.real
  )
}

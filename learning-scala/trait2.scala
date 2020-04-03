// self types with traits

class A {
  def hello = "hello"
  override def toString = "A : toString"
} 

trait B {
    self: A // attach this trait only to class A
    override def toString = "B : toString"
}



// inheritence

class A {
  def hello = println("Say hello_A")
}

class B extends A {
  override def hello = println("Say hello_B")
}

class C extends B {
  override def hello = println("Say hello_C")
}

val a = new A
val b = new B
val c = new C

val lst = List[A](a, b, c)
for (elem <- lst) {
  elem.hello
}

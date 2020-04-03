// try traits

trait T1 {
  def trait1 = {
    println ("This is T1->trait1")
  }
}

trait T2 {
  def trait2 = {
    println ("This is T2->trait2")
  }
}

class A extends T1 with T2 

val a = new A
a.trait1
a.trait2

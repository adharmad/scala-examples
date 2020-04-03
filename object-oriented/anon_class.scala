// anonymous inner class implementing an interface

abstract class TestInterface {
  def listen
}

val testImpl = new TestInterface {
  def listen = {
    println("listening....!")
  }
}

testImpl.listen

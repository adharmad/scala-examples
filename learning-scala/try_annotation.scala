import scala.annotation._
import scala.reflect.runtime.universe._

class A extends StaticAnnotation

@A
class X {
    @A
    def aa() {}
}

println("foo")

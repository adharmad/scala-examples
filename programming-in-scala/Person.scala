// try multiple classes

class Person1(pname: String, page: String) {
    var age = page
    var name = pname

    override def toString() = 
        "name = " + name + " age = " + age
}

class Person2(pname: String, page: String) {
    def age() = page
    def name() = pname

    override def toString() = 
        "name = " + name + " age = " + age
}

val p = new Person1("test", "foo")
p.age = "hello"
p.name = "world"
println(p)

val p1 = new Person2("test111", "foo22")
println(p1)
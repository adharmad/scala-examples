val lst1 = List(1, 2, 3)
val lst2 = List(4, 5, 6)

val lst_append = lst1 ::: lst2
println("appended list is: " + lst_append)
println()

val lst_str1 = "Amol" :: "Bageshree" :: "Kashmira" :: "Madhura" :: "Vishal" :: Nil
val lst_filter1 = lst_str1.filter(s => s.length < 5)
println("filtered list is: " + lst_filter1)
println()

println("print length of all elements")
lst_str1.foreach(s => println(s + " --> " + s.length))
println()

println("print the entire list")
lst_str1.foreach(print)
println()
println()

println("first element = " + lst_str1.first)
println("last element = " + lst_str1.last)
println()

println("reversing individual elements")
lst_str1.foreach(s => println(s.reverse))
println()

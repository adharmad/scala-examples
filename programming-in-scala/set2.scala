var set1 = Set("Ambarnath", "Pune", "Nagpur")
println(set1.hashCode())
set1 += "San Francisco"
println(set1.hashCode()) // this is a different set
println(set1)

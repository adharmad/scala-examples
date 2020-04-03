// read command line arguments

for (i <- 0 until args.length) {
    println(args(i))
}

println ("In another way")
println

args.foreach { arg =>
    println(arg)
}

println ("Yet another way")
println

var i = 0
while (i < args.length) {
    println(i + " " + args(i))
    i+=1
}

// The most concise manner of processing command line arguments
args.foreach((arg: String) => println(arg))


// Long form using a while loop
var i = 0

while (i < args.length) {
    println("Argument " + i + " = " + args(i))
    i += 1
}

// Using a for loop
for (arg <- args)
    println(arg)

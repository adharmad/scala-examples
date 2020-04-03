import scala.io.Source

val fileName = args(0)

for (line <- Source.fromFile(fileName).getLines)
    println(line.length + " " + line)

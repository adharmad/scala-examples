import scala.io.Source

def widthOfLength(s: String): Int = s.length.toString.length

val fileName = args(0)

val lines = Source.fromFile(fileName).getLines.toList

val longestLine = lines.reduceLeft(
  (a, b) => if (a.length > b.length) a else b
)

val maxWidth = widthOfLength(longestLine)

for (line <- lines) {
  val numSpaces = maxWidth - widthOfLength(line)
  val padding = " " * numSpaces
  print(padding + line.length + " | " + line)
}

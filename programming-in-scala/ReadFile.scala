import java.io._

object ReadFile {
    def main(args: Array[String]) {
        val fileName = args(0)

        val br: BufferedReader = new BufferedReader(new
            FileReader(fileName))

        var line: String = br.readLine

        while (line != null) {
            println(line)
            line = br.readLine
        }
    }
}

ReadFile.main(args)

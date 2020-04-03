object factorial {
    def main(args: Array[String]) {
        println(factorial(10))

    }

    def factorial(n: Long): Long = {
        if (n == 0) 
            1
        else
            n * factorial(n-1)
    }
}

//factorial.main(args)
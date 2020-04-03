// define a function and invoke it

def sumUpto(limit: Int): Int = {
    var sum = 0

    for (i <- 0 until limit+1) {
        sum += i
    }

    return sum
}

val x = sumUpto(10)
println(x)

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()

    if (b == 0) {
        println("Division by zero, please fix the second argument!")
    } else {
        println(a / b)
    }
}

/*
Look at other solutions to this problem
Sort by:
AS
Aditi Shevale
2 years ago
1
2
3
4
fun main() {
    val (a, b) = List(2) { readLine()!!.toInt() }
    println(if (b == 0)"Division by zero, please fix the second argument!" else a / b)
}
Correct.
Upgrade plan for more solutions
 */
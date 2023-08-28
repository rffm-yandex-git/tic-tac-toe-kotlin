fun main() {
    val list = readln().split(" ").map { it.toInt() }
    // write your code here
    val res = list.all { x -> x % 2 == 0 && x <= 20 }

    println(res)
}

/*
Look at other solutions to this problem
Sort by:
avatar
Victor Yghor
4 months ago
1
2
3
4
5
6
fun main() {
    val list = readln().split(" ").map { it.toInt() }
    val res = list.all { ((it and 1) == 0) && it <= 20} // bitwise operator
    println(res)
}

Correct.
 */
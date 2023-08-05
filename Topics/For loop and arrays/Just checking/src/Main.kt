fun main() {
    // write your code here
    val n = readln().toInt()
    val arr = IntArray(n) { readln().toInt() }
    val (p, m) = readln().split(" ").map { it.toInt() }

    if (arr.contains(p) && arr.contains(m)) {
        println("YES")
    } else { println("NO") }
}
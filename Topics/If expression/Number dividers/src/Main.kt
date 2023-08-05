fun main() {
    // put your code here
    val n = readln().toInt()
    val divs = intArrayOf(2, 3, 5, 6)
    for (d in divs) {
        if (n % d == 0) println("Divided by $d")
    }
}
fun main() {
    val grades = IntArray(readln().toInt()) { readln().toInt() }
    var (d, c, b, a) = intArrayOf(0, 0, 0, 0)
    for (grade in grades) {
        when (grade) { 2 -> d++ 3 -> c++ 4 -> b++ 5 -> a++ }
    }
    println("$d $c $b $a")
}
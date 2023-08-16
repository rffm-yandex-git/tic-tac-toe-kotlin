fun main() {
    val n = readln()
    val half = n.map { it.digitToInt() }.chunked(n.length / 2)
    println(if (half[0].sum() == half[1].sum()) "YES" else "NO")
}
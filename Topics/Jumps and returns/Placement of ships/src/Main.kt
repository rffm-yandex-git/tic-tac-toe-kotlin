fun main() {
    // put your code here
    val (x1, y1) = readln().split(" ").map { it.toInt() }
    val (x2, y2) = readln().split(" ").map { it.toInt() }
    val (x3, y3) = readln().split(" ").map { it.toInt() }

    val xFree = mutableListOf(1, 2, 3, 4, 5)
    val yFree = mutableListOf(1, 2, 3, 4, 5)

    for (x in xFree.lastIndex downTo 0) {
        if (x + 1 == x1 || x + 1 == x2 || x + 1 == x3) {
            xFree.removeAt(x)
        }
    }

    for (y in yFree.lastIndex downTo 0) {
        if (y + 1 == y1 || y + 1 == y2 || y + 1 == y3) {
            yFree.removeAt(y)
        }
    }

    println(xFree.joinToString(" "))
    println(yFree.joinToString(" "))

}
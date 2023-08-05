fun main() {
    val n = readln().toInt()
    val array = IntArray(n) { readln().toInt() }
    val (p, m) = readln().split(" ").map { it.toInt() }

    var neverNextToEachOther = "YES"

    for (i in 0 until array.size - 1) {
        if (array[i] == p && array[i + 1] == m ||
            array[i] == m && array[i + 1] == p
        ) neverNextToEachOther = "NO"
    }
    println(neverNextToEachOther)
}
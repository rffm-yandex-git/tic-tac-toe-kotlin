fun main() {
    val n = readln().toInt()
    val list = IntArray(n) { readln().toInt() }

    var max: Int = list[0]

    for (i in 1..list.lastIndex) {
        if (list[i] > max) max = list[i]
    }

    println(list.indexOf(max))
}
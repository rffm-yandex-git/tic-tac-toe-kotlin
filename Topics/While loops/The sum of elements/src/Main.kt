fun main() {
    var sum: Int = 0
    while (true) {
        val i = readln().toInt()
        if (i == 0) { break }
        sum += i
    }
    println(sum)
}
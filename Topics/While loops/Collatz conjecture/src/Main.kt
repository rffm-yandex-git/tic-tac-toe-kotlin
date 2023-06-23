fun main() {
    var n = readln().toInt()

    if (n < 1) return

    val seq = mutableListOf<Int>()

    while (true) {
        seq.add(n)
        if (n == 1) {
            break
        } else if (n % 2 == 0) {
            n = n / 2
        } else if (n % 2 == 1) {
            n = n * 3 + 1
        }
    }

    println(seq.joinToString(" "))
}
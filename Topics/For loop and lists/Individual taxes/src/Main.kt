fun main() {
    val n = readln().split(" ").first().toInt()
    val income = IntArray(n)
    repeat(n) { income[it] = readln().split(" ").first().toInt() }
    // populated an array using "repeat" above, below a more concise way
    val taxrate = IntArray(n) { readln().split(" ").first().toInt() }
    var maxtax = 0
    var maxnum = 1
    repeat(n) {
        val tax = income[it] * taxrate[it]
        if (tax > maxtax) {
            maxtax = tax
            maxnum = it + 1
        }
    }
    println(maxnum)

}
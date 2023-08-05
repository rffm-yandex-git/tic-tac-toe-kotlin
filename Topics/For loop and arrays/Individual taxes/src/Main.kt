fun main() {
    val n = readln().toInt()
    val income = IntArray(n)
    for (i in 1..n) {
        income[i - 1] = readln().toInt()
    }
    val taxrate = IntArray(n)
    for (i in 1..n) {
        taxrate[i - 1] = readln().toInt()
    }

    var maxtax = 0
    var maxtax_i = 1
    for (i in 1..n) {
        val tax = taxrate[i - 1] * income[i - 1]
        if (tax > maxtax) {
            maxtax = tax
            maxtax_i = i
        }
    }

    println(maxtax_i)

}
fun main() {
    val sNum = readln()
    val line = String.format(
        "The obtained value is $sNum " +
            "and its Int representation after division by 2 is %d",
        sNum.toInt() / 2
    )
    println(line)
}
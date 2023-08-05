// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    // put your code here
    val rows = "012345678036147258048246".map { it.digitToInt() }.chunked(3)
    println(rows[2][2])
}

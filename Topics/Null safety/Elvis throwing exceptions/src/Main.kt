fun main() {
    val line: String? = readLine() // you need to add something
        ?: throw IllegalStateException()
    println("Elvis says: $line")
}
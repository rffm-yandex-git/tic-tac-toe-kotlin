fun main() {
    for (char in readln()) {
        if (char.isDigit()) {
            println(char)
            break
        }
    }
}
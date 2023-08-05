fun main() {
    val input = readln()
    var output = input

    if (output.isEmpty()) {
        output = ""
    } else if (output.first() == 'i') {
        output = (output.drop(1).toInt() + 1).toString()
    } else if (output.first() == 's') {
        output = output.drop(1).reversed()
    }

    println(output)
}
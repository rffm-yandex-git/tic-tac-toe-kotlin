fun main() {
    val word = readln()
    var countUniqueChars = 0
    for (i in word.indices) {
        if (word[i] in word.takeLast(word.lastIndex - i)) {
            continue
        } else if (i > 0 && word[i] in word.take(i)) {
            continue
        } else {
            countUniqueChars++
        }
    }
    println(countUniqueChars)
}
fun main() {
    val list = readln().split(" ")
    val iterator = list.iterator()

    val wordCount = mutableMapOf<String, Int>()

    while (iterator.hasNext()) {
        val word = iterator.next()
        wordCount[word] = (wordCount[word] ?: 0) + 1
    }

    wordCount.forEach { (key, value) -> println("$key $value") }
}

/*

Look at other solutions to this problem
Sort by:
avatar
Tadeusz Kurpiel
1 year ago
1
2
fun main() = readln().split(" ").groupingBy { it }.eachCount().map { "${it.key} ${it.value}" }.forEach(::println)

Correct.
avatar
karbon
1 year ago
It's a nicer and more Kotlin-based solution. I've always used the Collections.frequency utility method out of habit, but your solution looks much better - it's worth remembering - thanks! :)
avatar
Tadeusz Kurpiel
1 year ago
Thank you :)
It's based directly on Kotlin documentation - see the example at:
https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.sequences/grouping-by.html


 */
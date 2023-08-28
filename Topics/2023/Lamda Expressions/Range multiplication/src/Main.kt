fun rangeMult(a: Long, b: Long): Long {
    if (a == b) return a

    var prod = a
    for (i in a + 1..b) {
        prod *= i
    }
    return prod
}

val lambda: (Long, Long) -> Long = { a, b -> (::rangeMult)(a, b) }

/*
 Range multiplication

Write a lambda expression that accepts two long arguments as range borders and returns the multiplication of all the numbers in this range (inclusively). Guaranteed that 0 <= left border <= right border. If left border == right border then the result is any border.

Note that you don't need to write in one line, you can use loops.
Hint by avatar
Pavel Reiter
You can use https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/reduce.html even for ranges
Was this hint helpful?
 */
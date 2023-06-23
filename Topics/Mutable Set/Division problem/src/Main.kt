fun solution(first: Set<Int>, second: Set<Int>): Set<Int> {
    val third = mutableSetOf<Int>()
    for (i in first) {
        if (i % second.size == 0) {
            third.add(i)
        }
    }
    return third
}
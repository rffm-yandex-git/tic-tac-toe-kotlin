fun main() {

    /* Oops, I already solved this one before, just found it
    by accident in the IDE Project sidebar under Topics! :-) */
    val n = readln().toInt()
    val arr = IntArray(n)
    for (i in 0 until arr.size) {
        arr[i] = readln().toInt()
    }
    var tripleCount = 0
    for (i in 1 until arr.lastIndex) {
        if (arr[i] - arr[i - 1] == 1 && arr[i + 1] - arr[i] == 1) {
            tripleCount++
        }
    }
    println(tripleCount)
}
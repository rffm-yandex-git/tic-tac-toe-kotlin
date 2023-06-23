fun main() {
    // write your code here
    val n = readln().toInt()
    val array = IntArray(n)
    for (i in 0..array.lastIndex) {
        array[i] = readln().toInt()
    }
    var count = 0
    val m = readln().toInt()
    for (i in 0..array.lastIndex) {
        if (array[i] == m) {
            count++
        }
    }
    println(count)
}
fun main() {
    // write your code here
    val n = readln().toInt()
    val array = IntArray(n)
    for (i in 0 until n) {
        array[i] = readln().toInt()
    }
    val m = readln().toInt()

    if (array.contains(m)) {
        println("YES")
    } else {
        println("NO")
    }
}
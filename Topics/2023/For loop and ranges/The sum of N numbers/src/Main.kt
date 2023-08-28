fun main() {
    val nums = IntArray(readln().toInt()) { readln().toInt() }
    var sum = 0
    for (num in nums) {
        sum += num
    }
    println(sum)
}
fun main() {
    val nums = IntArray(readln().toInt()) { readln().toInt() }
    var sorted = "YES"
    for (i in 1..nums.lastIndex) {
        if (nums[i] < nums[i - 1]) {
            sorted = "NO"
            break
        }
    }
    println(sorted)
}
fun main() {
    // write your code here
    val m = readln().toInt()
    val nums = IntArray(m)
    for (i in 0 until m) {
        nums[i] = readln().toInt()
    }
    val t = readln().toInt()

    if (nums.contains(t)) {
        println("YES")
    } else {
        println("NO")
    }

}
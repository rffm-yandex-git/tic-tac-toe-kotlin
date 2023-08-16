val isPositive: (Int) -> Boolean = { x -> x > 0 }

fun main() {
    val nums = IntArray(readln().toInt()) { readln().toInt() }
    println(nums.count(isPositive))
}

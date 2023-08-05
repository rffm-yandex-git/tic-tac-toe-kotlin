fun main() {
    // avatar
    //Paul Gorda
    //1 year ago
    val array = UIntArray(readln().toInt()) { readln().toUInt() }
    array.sortDescending()
    println(if (array.size == 1) array[0] else array[0] * array[1])
}
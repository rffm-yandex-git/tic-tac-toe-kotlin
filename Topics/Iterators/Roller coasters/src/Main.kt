fun checkHeight(iterator: Iterator<Int>) {
    // write your code here
    while (iterator.hasNext()) {
        val h = iterator.next()
        if (h < 145 || h > 210) {
            println("Sorry, not today")
        } else {
            println("You can go!")
        }
    }
}

fun main() {
    val list = readln().split(" ").map(Integer::parseInt).toList()
    checkHeight(list.iterator())
}
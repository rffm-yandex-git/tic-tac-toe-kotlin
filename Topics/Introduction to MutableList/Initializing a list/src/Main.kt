fun main() {
    val numbers = mutableListOf<Int>()// put your code here
    for (i in 1..100) {
        if (i == 1 || i == 10 || i ==100) {
            numbers.add(i - 1, i)
        } else {
            numbers.add(i -1, 0)
        }
    }

    // do not touch the lines below 
    println(numbers.joinToString())
}
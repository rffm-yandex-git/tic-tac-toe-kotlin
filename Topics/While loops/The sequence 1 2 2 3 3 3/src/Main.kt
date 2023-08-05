fun main() {
    /*val n = readln().toInt()
    val arr = IntArray(n)
    var k = 1
    var i = 0
    while (i < n) {
        // https://stackoverflow.com/questions/68277152/how-can-i-break-out-of-a-kotlin-repeat-loop
        run repeatBlock@{
            repeat(k) {
                arr[i] = k
                i++
                if (i == n) {
                    return@repeatBlock
                }
            }
        }
        k++
    }
    println(arr.joinToString(" "))*/

    println(
        generateSequence(1) { it + 1 }.flatMap {
            n ->
            List(n) { n }
        }.take(readln().toInt()).joinToString(" ")
    )

    /*
    avatar
Michael Rivera
3 months ago
1
2
fun main() = generateSequence(1) { it + 1 }.flatMap { n -> List(n) { n } }.take(readln().toInt()).forEach { print("$it ") }

Correct.
avatar
Raghul A
3 months ago
Can you explain this? T-T
avatar
Michael Rivera
3 months ago
fun main() =: This defines the main function, which is the entry point. The = symbol indicates that the function body consists of a single expression.

generateSequence(1) { it + 1 }: This creates an infinite sequence of integers starting from 1 and incrementing by 1 for each next element. The sequence looks like this: 1, 2, 3, 4, 5, 6, ...

.flatMap { n -> List(n) { n } }: The flatMap function takes the infinite sequence and transforms it into another sequence by applying a function to each element. In this case, the function creates a list with the length and elements equal to the value of the current element n. For example, for the number 3, it creates a list [3, 3, 3].

.take(readln().toInt()): The take function limits the resulting sequence to a specific number of elements. readln().toInt() reads an integer from the standard input, which determines the number of elements the sequence should have.

.forEach { print("$it ") }: Finally, the forEach function iterates through the elements of the resulting sequence and prints each element followed by a space.
avatar
Raghul A
3 months ago
Thank you so much.

     */

}
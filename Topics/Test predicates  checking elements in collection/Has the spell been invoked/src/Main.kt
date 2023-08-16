fun main() {
    val list = readln().split(" ")
    // write your code here
    val res = list.any { x -> x.lowercase() == "abracadabra" }
    println(res)
}
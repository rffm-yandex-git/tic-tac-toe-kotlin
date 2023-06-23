fun main() {
    var countPerfect = 0
    var countLargerCanFix = 0
    var countSmallerReject = 0
    repeat(readln().toInt()) {
        when (readln().toInt()) {
            0 -> countPerfect += 1
            1 -> countLargerCanFix += 1
            -1 -> countSmallerReject += 1
        }
    }
    println("$countPerfect $countLargerCanFix $countSmallerReject")
}
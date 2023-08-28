import kotlin.math.hypot

fun main() {
    println(perimeter(0.0, 0.0, 12.0, 0.0, 0.0, 5.0))
}

fun perimeter(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double = x3,
    y4: Double = y3
): Double {
    val a = hypot(x2 - x1, y2 - y1)
    val b = hypot(x3 - x2, y3 - y2)
    val c = hypot(x4 - x3, y4 - y3)
    val d = hypot(x1 - x4, y1 - y4)
    return a + b + c + d
}

/*
Look at other solutions to this problem
Sort by:
AD
Alexander Dröfke
2 years ago
1
2
3
4
5
6
import kotlin.math.hypot

fun perimeter(vararg vertices: Double): Double {
    return vertices.toList().plus(vertices.take(2)).chunked(2)
        .zipWithNext { a, b -> hypot(b[0] - a[0], b[1] - a[1]) }.sum()
}
Correct.
avatar
Victor Yghor
6 months ago
can you explain what you doing in this solution, please?
AD
Alexander Dröfke
6 months ago
you take an array of double values (vertices) with any length (vararg concats parameters into an array)) convert it to a list and add the the first 2 points of the list to the end of the list to consider the distance from last -> first aswell (closed perimeter) afterwards you split the list into chunks of 2, where zipWithNext slides over the pairs and calulates their distance and sums that for all pairs (thats we we need the vertices.take(2) to consider distance from last point back to first point again)
avatar
Nikita Walkowski
5 months ago
Smart practice but not a good one
avatar
Moise DETE KPINSSOUNON
2 months ago
What's not good about it? Efficiency?
avatar
Moise DETE KPINSSOUNON
2 months ago
This is another level. Thanks for inspiring me to know more kotlin
Upgrade plan for more solutions
 */
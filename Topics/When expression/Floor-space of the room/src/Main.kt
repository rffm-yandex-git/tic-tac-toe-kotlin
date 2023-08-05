import kotlin.math.sqrt

fun main() {
    val type = readln()
    var area = 0.0
    when (type) {
        "triangle" -> {
            val sides = DoubleArray(3) { readln().toDouble() }
            /*
            https://www.cuemath.com/measurement/area-of-triangle-with-3-sides/
            */
            val s = (sides[0] + sides[1] + sides[2]) / 2
            area = sqrt(s * (s - sides[0]) * (s - sides[1]) * (s - sides[2]))
        }
        "rectangle" -> {
            val sides = DoubleArray(2) { readln().toDouble() }
            area = sides[0] * sides[1]
        }
        "circle" -> {
            val r = readln().toDouble()
            val pi = 3.14
            area = pi * r * r
        }
    }

    println(area)
}
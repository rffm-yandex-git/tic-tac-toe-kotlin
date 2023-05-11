// Stage 3/5: What's up on the field?
// blabaster blabaster
// about 1 year ago

fun main() {
    val s = readln()
    println("---------")
    s.chunked(3).forEach { println("| ${it[0]} ${it[1]} ${it[2]} |") }
    println("---------")
    val rows = "012345678036147258048246".map { it.digitToInt() }.chunked(3)
    val xo = listOf('X', 'O').map { ch -> rows.map { r -> r.map { s[it] == ch }.all { it } }.any { it } }
    val e = s.any { it == '_' }
    println(when {
        xo.all { it } || s.count { it == 'X' } - s.count { it == 'O' } !in -1..1 -> "Impossible"
        !xo.any { it } && e -> "Game not finished"
        !xo.any { it } && !e -> "Draw"
        else -> "${if (xo[0]) 'X' else 'O'} wins"
    })
}
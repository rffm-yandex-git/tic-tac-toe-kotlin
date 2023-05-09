package tictactoe

const val ROWS = 3
const val COLS = 3

fun main() {

    val grid = fillGrid()

    printGrid(grid)

    if (impossible(grid)) {
        println("Impossible")
    } else {
        println("WIP")
    }
}

fun printGrid(grid: MutableList<MutableList<Char>>) {
    println("-".repeat(COLS * 2 + 3))
    for (r in 0 until ROWS) {
        println("| " + grid[r].joinToString(" ") + " |")
    }
    println("-".repeat(COLS * 2 + 3))
}

fun fillGrid(): MutableList<MutableList<Char>> {

    val state = readln()

    val grid = mutableListOf<MutableList<Char>>()

    var i = 0
    for (r in 0 until ROWS) {
        val row = mutableListOf<Char>()
        for (c in 0 until COLS) {
            row.add(state[i++].uppercaseChar())
        }
        grid.add(r, row)
    }

    return grid
}

fun impossible(grid: MutableList<MutableList<Char>>): Boolean {
    var isImpossible = false
    if (kotlin.math.abs(countChar(grid, 'X') - countChar(grid, 'O')) > 1
    || (charHasWon(grid, 'X') && charHasWon(grid,'O'))) {
        isImpossible = true
    }
    return isImpossible
}

fun charHasWon(grid: MutableList<MutableList<Char>>, charToCheck: Char): Boolean {
    var hasWon = false
    for (r in 0 until ROWS) {
        if (grid[r].joinToString("") == charToCheck.toString().repeat(COLS)) {
            hasWon = true
            break
        }
    }
    return hasWon
}

fun countChar(grid: MutableList<MutableList<Char>>, charToCount: Char): Int {
    var charCounted = 0
    for (r in 0 until ROWS) {
        for (c in 0 until COLS) {
            if (grid[r][c].uppercaseChar() == charToCount.uppercaseChar()) {
                charCounted++
            }
        }
    }
    return charCounted
}
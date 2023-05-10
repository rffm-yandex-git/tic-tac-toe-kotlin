package tictactoe

import kotlin.system.exitProcess

const val ROWS = 3
const val COLS = 3

val grid = mutableListOf<MutableList<Char>>()
val gridCols = mutableListOf<MutableList<Char>>()

var diagDown = ""
var diagUp = ""

fun main() {

    fillGrid()

    printGrid()

    if (checkImpossible()) {
        println("Impossible")
    } else if (charHasWon('X')) {
        println("X wins")
    } else if (charHasWon('O')) {
        println("O wins")
    } else if (countChar('X') + countChar('O') == ROWS * COLS) {
        println("Draw")
    } else if (countChar('X') + countChar('O') < ROWS * COLS) {
        println("Game not finished")
    }
}

fun printGrid() {
    println("-".repeat(COLS * 2 + 3))
    for (r in 0 until ROWS) {
        println("| " + grid[r].joinToString(" ") + " |")
    }
    println("-".repeat(COLS * 2 + 3))
}

fun fillGrid() {

    val state = readln()

    if (state.length < ROWS * COLS) {
        println("Wrong input!")
        exitProcess(1)
    }

    var i = 0
    for (r in 0 until ROWS) {
        val row = mutableListOf<Char>()
        for (c in 0 until COLS) {
            row.add(state[i++].uppercaseChar())

            if (r == c) { diagDown += row.last()}
            if (r == COLS - c - 1) { diagUp += row.last()}
        }
        grid.add(r, row)
    }

    for (c in 0 until COLS) {
        val col = mutableListOf<Char>()
        for (r in 0 until ROWS) {
            col.add(grid[r][c])
        }
        gridCols.add(c, col)
    }
}

fun checkImpossible(): Boolean {
    var isImpossible = false
    if (kotlin.math.abs(countChar('X') - countChar('O')) > 1
    || (charHasWon('X') && charHasWon( 'O'))) {
        isImpossible = true
    }
    return isImpossible
}

fun charHasWon(charToCheck: Char): Boolean {

    // Assume <ROWS> times repeat of a char as win string for Tic-Tac-Toe
    // But could be different if game were extended to a non-square field
    val charsWinString = charToCheck.uppercaseChar().toString().repeat(ROWS)

    for (r in 0 until ROWS) {
        val rowState = grid[r].joinToString("")
        if (rowState == charsWinString) {
            return true
        }
    }

    for (c in 0 until COLS) {
        val colState = gridCols[c].joinToString("")
        if (colState == charsWinString) {
            return true
        }
    }

    if (diagDown == charsWinString || diagUp == charsWinString) {
        return true
    }

    return false
}

fun countChar(charToCount: Char): Int {
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
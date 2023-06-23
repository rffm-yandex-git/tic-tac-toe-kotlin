import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    var unaffordable = 0
    var newbalance = balance
    while (scanner.hasNextInt()) {
        // TODO
        val payment = scanner.nextInt()
        newbalance -= payment
        if (newbalance >= 0) {
            balance -= payment
        } else {
            unaffordable += payment
        }
    }
    // TODO
    if (newbalance >= 0) {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    } else {
        println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $unaffordable.")
    }
}
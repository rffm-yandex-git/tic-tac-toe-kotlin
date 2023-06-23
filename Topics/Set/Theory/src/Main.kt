// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
  // put your code here
    val visitors = setOf("Paula", "Tanya", "Julia")

    println("Is it true that Tanya came? It's ${visitors.contains("Tanya")}") // Is it true that Tanya came? It's true
    println("And what is her index? ${visitors.indexOf("Tanya")}" ) // And her index is 1
    println(visitors.elementAt(1))
}

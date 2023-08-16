/*fun main() {
    val namesList = listOf("Vasya", "Olga", "Vasya", "Dima", "Masha", "Vasa", "Olga")
    val nameCount = names(namesList)

    print(nameCount)
}*/

fun names(namesList: List<String>): List<String> {
    var count = 0
    val nameCount = mutableListOf<String>()
    //
    // add your code here
    val alreadyCounted = mutableListOf<String>()
    for (name in namesList) {
        if (!alreadyCounted.contains(name)) {
            count = namesList.count { it.equals(name) }
            nameCount.add("The name $name is repeated $count times")
            alreadyCounted.add(name)
        }
    }
    //
    return nameCount
}

/*
Kaloyan Karaivanov
8 months ago
1
2
3
4
fun names(namesList: List<String>) = namesList
    .groupingBy { it }
    .eachCount()
    .map { (key, value) -> "The name $key is repeated $value times" }
Correct.
K
Kotlinit
2 months ago
This is great man, thanks for posting your solution. Kotlin is truly amazing!
 */
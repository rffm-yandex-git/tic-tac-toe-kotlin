fun main() {
    val studentsMarks = mutableMapOf<String, Int>()
    while (true) {
        val name = readln()
        if (name == "stop") {
            break
        } else {
            val age = readln().toInt()
            if (!studentsMarks.containsKey(name)) {
                studentsMarks[name] = age
            }
        }
    }
    println(studentsMarks)
}
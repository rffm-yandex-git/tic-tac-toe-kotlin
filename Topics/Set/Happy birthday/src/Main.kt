fun findByIndex(names: Set<String>): String {
    // write here
    return listOf<Int>(names.indexOf("Alice"), names.indexOf("Victor")).joinToString(", ")

}
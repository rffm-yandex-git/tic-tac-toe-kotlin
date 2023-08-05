fun main() {
    val maxValuesOfFourIntegerTypes = listOf(
        Int.MAX_VALUE.toLong(), Long.MAX_VALUE,
        Short.MAX_VALUE.toLong(), Byte.MAX_VALUE.toLong()
    )

    maxValuesOfFourIntegerTypes.sorted().forEach { println(it) }

}
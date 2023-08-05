fun solution(elements: Set<String>, element: String): MutableSet<String> {
    val newElements = elements.toMutableSet()
    newElements.remove(element)
    return newElements
}
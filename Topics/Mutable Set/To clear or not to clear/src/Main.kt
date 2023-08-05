fun solution(elements: MutableSet<Int>, element: Int): MutableSet<Int> {
    // put your code here
    if (elements.contains(element)) {
        return mutableSetOf<Int>()
    } else {
        return elements
    }
}

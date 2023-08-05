fun solution(setSource: Set<String>, listSource: MutableList<String>): MutableSet<String> {
    // put your code here
    val setResult = setSource.toMutableSet()
    setResult.addAll(listSource)    
    return setResult
}

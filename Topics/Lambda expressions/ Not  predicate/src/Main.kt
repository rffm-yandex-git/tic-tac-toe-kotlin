// https://stackoverflow.com/questions/63225572/lambda-expressions-not-predicate
val notPredicate: (Char) -> Boolean = { !originalPredicate(it) }
fun bill(priceList: Map<String, Int>, shoppingList: MutableList<String>): Int {
    // put your code here
    /*var total = 0

    for (item in shoppingList) {
        if (priceList.contains(item)) {
            total += priceList[item]!!
        }
    }
    return total*/

    //User 127878532
    //2 years ago
    return shoppingList.sumOf { priceList[it] ?: 0 }
}
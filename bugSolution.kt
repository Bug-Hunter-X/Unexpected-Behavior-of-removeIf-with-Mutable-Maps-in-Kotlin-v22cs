fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val keysToRemove = mutableListOf<String>()
    for ((key, value) in map) {
        if (value % 2 == 0) {
            keysToRemove.add(key)
        }
    }
    keysToRemove.forEach { map.remove(it) }
    println(map) // Output: {a=1, c=3}
    
    //Alternative solution using filter
    val map2 = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    map2.filterValues { it % 2 != 0 }.toMutableMap() //Doesn't modify original map
    println(map2) // Output: {a=1, b=2, c=3} 
    println(map2.filterValues { it % 2 != 0 }) // Output: {a=1, c=3}
}
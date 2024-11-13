fun main() {
    println("Введите строку:")
    val a = readln() ?: ""
    val b = a.groupingBy { it }.eachCount().toSortedMap()
    for ((number, result) in b) {
        println("$number - $result")
    }
}
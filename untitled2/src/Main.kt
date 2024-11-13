fun main() {
    println("Введите натуральное число:")
    val a = readLine()!!.toInt()
    var result = ""
    var b = a
    while (b > 0) {
        val c = b % 2
        result = "$c$result"
        b /= 2
    }
    println("Число $a в двоичной системе: $result")
}
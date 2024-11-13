fun main() {
    print("Введите два числа и символ операции (разделенные пробелом): ")
    val a = readln()
    if (a != null) {
        val data = a.split(" ")
        if (data.size == 3) {
            val b1 = data[0].toDouble()
            val b2 = data[1].toDouble()
            val c = data[2]
            when (c) {
                "+" -> println("Результат: ${b1 + b2}")
                "-" -> println("Результат: ${b1 - b2}")
                "*" -> println("Результат: ${b1 * b2}")
                "/" -> {
                    if (b2 != 0.0) {
                        println("Результат: ${b1 / b2}")
                    } else {
                        println("Ошибка: деление на ноль")
                    }
                }
                else -> println("Ошибка")
            }
        }
    }
}
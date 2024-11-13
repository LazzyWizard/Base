fun main() {
    println("Введите первую цифру:")
    val a = readln().toInt()
    println("Введите вторую цифру:")
    val b = readln().toInt()
    if (a != null && b != null) {
        if (a != b) {
            val result = a + b
            if (result % 2 != 0) {
                println("Из введённых цифр можно создать нечётное число: $result")
            }
            else if (a != b)
            {
                val result = a - b
                if (result % 2 != 0) {
                    println("Из введённых цифр можно создать нечётное число: $result")
                }
                else if (a != b)
                {
                    val result = a * b
                    if (result % 2 != 0) {
                        println("Из введённых цифр можно создать нечётное число: $result")
                    }
                }
                else if (a != b)
                {
                    val result = a / b
                    if (result % 2 != 0) {
                        println("Из введённых цифр можно создать нечётное число: $result")
                    }
                    else
                    {
                        println("Создать нечетное число невозможно")
                    }
                }
            }
        }
    }
}
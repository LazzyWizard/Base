fun main() {
    println("Введите строку:")
    val a = readln()
    if (a != null)
    {
        var result = ""
        var count = 1
        for (i in 0..<a.length - 1)
        {
            if (a[i] == a[i + 1]) {
                count++
            }
            else
            {
                result += "${a[i]}${if (count > 1) count else ""}"
                count = 1
            }
        }
        result += "${a[a.length - 1]}${if (count > 1) count else ""}"
                println("Результат: $result")
    }
    else
    {
        println("Ошибка ввода")
    }
}
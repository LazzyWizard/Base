fun main() {
    println("Введите целое число n:")
    val n = readln().toInt() ?: return
    println("Введите основание степени x:")
    val x = readln().toInt() ?: return
    var y = 0
    var result = 1
    while (result < n)
    {
        y++
        result *= x
    }
    if (result == n)
    {
        println("Целочисленный показатель равен $y")
    }
    else
    {
        println("Целочисленный показатель не существует")
    }
}
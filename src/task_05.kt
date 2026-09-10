fun main() {
    print("Введите число 1: ")
    val number1 = readln().toDouble()

    print("Введите число 2: ")
    val number2 = readln().toDouble()

    print("Введите число 3: ")
    val number3 = readln().toDouble()

    println("Среднее арифметическое ${(number1 + number2 + number3) / 3 }")
}
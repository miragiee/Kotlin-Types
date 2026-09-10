fun main() {
    print("Введите число 1: ")
    var number1 = readln().toDouble()

    print("Введите число 2: ")
    var number2 = readln().toDouble()

    print("Введите число 3: ")
    var number3 = readln().toDouble()

    println("Среднее арифметическое ${(number1 + number2 + number3) / 3 }")
}
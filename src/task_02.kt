fun main() {
    print("Введите количество населения: ")
    val peopleAmount = readln().toInt();

    print("\nВведите площадь в кв. км: ")
    val area = readln().toFloat();

    println("Плотность населения:${String.format("%.3f", peopleAmount / area)} чел./кв. км")
}
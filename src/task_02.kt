fun main() {
    print("Введите количество населения: ")
    var peopleAmount = readln().toInt();

    print("\nВведите площадь в кв. км: ")
    var area = readln().toFloat();

    println("Плотность населения:${String.format("%.3f", peopleAmount / area)} чел./кв. км")
}
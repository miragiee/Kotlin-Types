fun main() {
    print("Введите фамилию: ")
    var lastName = readln()

    print("\n\nВведите имя: ")
    var name = readln()

    print ("\n\nВведите отчество")
    var patronymic = readln()

    print("\n\nВведите год рождения")
    var year = readln()

    println("\n${lastName + name.take(1)}. ${patronymic.take(1)}. $year года рождения")
}
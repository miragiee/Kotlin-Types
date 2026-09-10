fun main() {
    print("Введите фамилию: ")
    val lastName = readln()

    print("Введите имя: ")
    val name = readln()

    print ("Введите отчество ")
    val patronymic = readln()

    print("Введите год рождения ")
    val year = readln()

    println("\n$lastName ${name.take(1)}. ${patronymic.take(1)}. родился в $year году")
}
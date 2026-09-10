fun main() {
    print("Введите фамилию: ")
    var lastName = readln()

    print("Введите имя: ")
    var name = readln()

    print ("Введите отчество ")
    var patronymic = readln()

    print("Введите год рождения ")
    var year = readln()

    println("\n$lastName ${name.take(1)}. ${patronymic.take(1)}. родился в $year году")
}
fun getCoordinatesFromString(coordinates : string) {
    var x : float = point1.substringBefore(',').toFloat()
    var y : float = point1.substringAfter(',').trimStart().toFloat()
}

fun main() {
    print("Введите координаты первой точки в формате X Y")

    var point1 : string = readln()

    print("\n Введите координаты второй точки")
}
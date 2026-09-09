import kotlin.math.sqrt

fun getCoordinatesFromString(coordinates : string) : Pair<Float, Float> {
    var x : float = point1.substringBefore(',').toFloat()
    var y : float = point1.substringAfter(',').trimStart().toFloat()

    return Pair(x, y)
}

fun main() {
    print("Введите координаты первой точки в формате X Y")
    var point1 : string = getCoordinatesFromString(readln())

    print("\n Введите координаты второй точки")
    var point2 : string = getCoordinatesFromString(readln());

    var result = sqrt()
}
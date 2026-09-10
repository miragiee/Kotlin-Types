import kotlin.Pair
import kotlin.math.sqrt
import kotlin.math.pow

fun getCoordinatesFromString(coordinates : String) : Pair<Float, Float> {
    var x : Float = coordinates.substringBefore(',').toFloat()
    var y : Float = coordinates.substringAfter(',').trimStart().toFloat()

    return Pair(x, y)
}

fun main() {
    print("Введите координаты первой точки в формате 'X, Y' ")
    var input1 : String = readln()

    print("\nВведите координаты второй точки в формате 'X, Y' ")
    var input2 : String = readln();

    var point1 : Pair<Float, Float> = getCoordinatesFromString(input1)
    var point2 : Pair<Float, Float> = getCoordinatesFromString(input2)
    var result = sqrt((point2.first - point1.first).pow(2) + (point2.second - point1.second).pow(2));

    println("Евклидово расстояние равно: ${String.format("%.3f", result)}")
}
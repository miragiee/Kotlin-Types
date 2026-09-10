import kotlin.Pair
import kotlin.math.sqrt
import kotlin.math.pow

fun getCoordinatesFromString(coordinates : String) : Pair<Float, Float> {
    val x : Float = coordinates.substringBefore(',').toFloat()
    val y : Float = coordinates.substringAfter(',').trimStart().toFloat()

    return Pair(x, y)
}

fun main() {
    print("Введите координаты первой точки в формате 'X, Y' ")
    val input1 : String = readln()

    print("\nВведите координаты второй точки в формате 'X, Y' ")
    val input2 : String = readln();

    val point1 : Pair<Float, Float> = getCoordinatesFromString(input1)
    val point2 : Pair<Float, Float> = getCoordinatesFromString(input2)
    val result = sqrt((point2.first - point1.first).pow(2) + (point2.second - point1.second).pow(2));

    println("Евклидово расстояние равно: ${String.format("%.3f", result)}")
}
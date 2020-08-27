import java.util.*

// A
// Val for computed constant
// Var if it can change
// A data class is like a tuple or struct, just has data in it
data class Person(val name: String, val age: Int? = null)

// D
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// E
// Using var in front of the params automatically creates them as properties
// Without it, they will be only local variables
class Rectangle(var width: Int, var height: Int = 15) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

// F
enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun getMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun getWarmth (color: Color) =
    when (color) {
        Color.RED, Color.ORANGE, Color.YELLOW -> "Warm"
        Color.GREEN -> "Neutral"
        Color.BLUE, Color.INDIGO, Color.VIOLET -> "Cold"
    }

// I
fun String.lastChar(): Char = this[length - 1] // Or this.last

// J
fun printAllCaps(s: String?) {
    val allCaps: String? = s?.toUpperCase(Locale.ENGLISH) // Locale not necessary just gets rid of warning
    println(allCaps)
}

// K
fun strLenSafe(s: String?): Int = s?.length ?: 0

// B
fun main(args: Array<String>) {
    // C
    val persons = listOf(Person("Alice"),
                         Person(name = "Bob", age = 29))

    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is $oldest")

    // D
    println(max(1, 2))

    // E
    val rectangle = Rectangle(41, 43)
    println(rectangle.width)
    println(rectangle.height)
    println(rectangle.isSquare)
    val rectangle2 = Rectangle(15)
    println(rectangle2.isSquare)

    // F
    println(getMnemonic(Color.BLUE))
    println(getWarmth(Color.ORANGE))

    // G
    for (i in 100 downTo 1 step 2) {
        print(i)
    }
    println("\nDone")

    // H
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }
    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

    // I
    println("Mobile App Dev II".lastChar())

    // J
    printAllCaps("abc")
    printAllCaps(null)

    // K
    println(strLenSafe("abc"))
    println(strLenSafe(null))
}
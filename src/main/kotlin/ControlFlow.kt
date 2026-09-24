fun main() {
    val check = true
    val d: Int

    if (check) {
        d = 1
    } else {
        d = 2
    }
    println(d)

    val obj = "Hello"
    val result = when (obj) {
        "1" -> println("One")
        "Hello" -> println("Greeting")
        else -> println("Unknown")
    }

    val obj2 = "Hello"
    val result2 = when (obj2) {
        "1" -> "One"
        "Hello" -> "Greeting"
        else -> "Unknown"
    }
    println(result2)

    // Ranges
    println(1..4)
    println(1..<4)
    println(4 downTo 1)
    println(1..5 step 2)
    println('a'..'d')
    println('z' downTo 's' step 2)

    // For loop
    for (number in 1..5) {
        print(number)
    }
    println()

    // While loop
    var i = 1
    while (i <= 5) {
        print(i)
        i++
    }
    println()
}

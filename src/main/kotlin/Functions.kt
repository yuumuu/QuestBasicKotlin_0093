fun sum(x: Int, y: Int): Int {
    return x + y
}

fun main() {
    println(sum(1, 2))
    // 3
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun main() {
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    // [Log] Hello

    printMessageWithPrefix("Hello", "Log")
    // [Log] Hello

    printMessageWithPrefix("Hello")
    // [Info] Hello

    printMessageWithPrefix(prefix = "Log", message = "Hello")
    // [Log] Hello
}

fun printMessage(message: String) {
    println(message)
}

fun main() {
    printMessage("Hello")
    // Hello
}

fun uppercaseString(string: String): String {
    return string.uppercase()
}

fun main() {
    println(uppercaseString("hello"))
    // HELLO

    println({ string: String -> string.uppercase() }("hello"))
    // HELLO
}

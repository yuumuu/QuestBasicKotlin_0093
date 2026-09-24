fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}
fun main() {
    printMessageWithPrefix(prefix = "Log", message = "Hello")
}

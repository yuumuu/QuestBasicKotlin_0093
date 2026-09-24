fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}
fun main() {
    printMessageWithPrefix("Hello")
}

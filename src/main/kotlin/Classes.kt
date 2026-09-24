class Customer

class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "mary@gmail.com")
    println(contact.email)
    // mary@gmail.com

    contact.email = "jane@gmail.com"
    println(contact.email)
    // jane@gmail.com
}

class ContactWithFunction(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

fun main() {
    val contact = ContactWithFunction(1, "mary@gmail.com")
    contact.printId()
    // 1
}

data class User(val name: String, val id: Int)

fun main() {
    val user = User("Alex", 1)
    println(user)
    // User(name=Alex, id=1)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")
    // user == secondUser: true
    println("user == thirdUser: ${user == thirdUser}")
    // user == thirdUser: false

    println(user.copy())
    // User(name=Alex, id=1)

    println(user.copy("Max"))
    // User(name=Max, id=1)

    println(user.copy(id = 3))
    // User(name=Alex, id=3)
}

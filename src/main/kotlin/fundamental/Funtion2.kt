package org.example.fundamental

// Fungsi dengan beberapa parameter
fun greet(firstName: String, lastName: String) {
    println("Hello, $firstName $lastName!")
}

// Fungsi dengan argumen default
fun greetWithDefault(firstName: String, lastName: String = "Doe") {
    println("Hello, $firstName $lastName!")
}

fun main() {
    // Memanggil fungsi greet dengan menggunakan named arguments
    greet(firstName = "John", lastName = "Doe")
    greet(lastName = "Smith", firstName = "Alice") // Urutan tidak masalah dengan named arguments

    // Memanggil fungsi greetWithDefault tanpa menyediakan nilai untuk lastName
    greetWithDefault("John") // Output: Hello, John Doe

    // Memanggil fungsi greetWithDefault dengan menyediakan nilai untuk lastName
    greetWithDefault("Alice", "Smith") // Output: Hello, Alice Smith
}

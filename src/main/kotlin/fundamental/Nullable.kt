package org.example.fundamental

fun main() {
    // Deklarasi variabel nullable
    var nullableString: String? = "Hello Kotlin"
    // nullableString = null // Uncomment this line to test null value

    // Menggunakan if/else untuk penanganan nullable
    if (nullableString != null) {
        // Safe call (?.) untuk mengakses nullable
        println("Length of the string: ${nullableString.length}")
    } else {
        println("String is null")
    }

    // Menggunakan operator Elvis (?:) untuk memberikan nilai default jika null
    val length = nullableString?.length ?: -1
    println("Length of the string (using Elvis operator): $length")

    // Smart cast dengan is untuk memastikan tipe data
    val anyObject: Any = "Hello"
    if (anyObject is String) {
        println("Length of anyObject: ${anyObject.length}") // Smart cast to String
    }
}

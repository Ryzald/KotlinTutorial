package org.example.fundamental

// fungsi pada kotlin selalu harus ada nilai kembalian jika tidak ada maka dapat menggunakan Unit

// Fungsi dengan parameter dan nilai kembalian
fun calculateSum(a: Int, b: Int): Int {
    return a + b
}

// Fungsi dengan expression body
fun calculateProduct(x: Int, y: Int): Int = x * y

// Fungsi tanpa parameter dan nilai kembalian Unit
fun greet() {
    println("Hello, Kotlin!")
}

fun main() {
    // Memanggil fungsi calculateSum
    val sum = calculateSum(5, 3)
    println("Sum: $sum")

    // Memanggil fungsi calculateProduct
    val product = calculateProduct(4, 2)
    println("Product: $product")

    // Memanggil fungsi greet
    greet()
}

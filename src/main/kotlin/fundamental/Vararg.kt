package org.example.fundamental


// Fungsi dengan vararg untuk menghitung jumlah dari beberapa bilangan bulat
fun sum(vararg numbers: Int): Int {
    var sum = 0
    for (num in numbers) {
        sum += num
    }
    return sum
}

fun main() {
    // Memanggil fungsi sum dengan beberapa argumen
    val total1 = sum(1, 2, 3, 4, 5)
    println("Total sum: $total1")

    // Memanggil fungsi sum dengan array sebagai argumen menggunakan spread operator (*)
    val array = intArrayOf(6, 7, 8, 9, 10)
    val total2 = sum(*array)
    println("Total sum from array: $total2")

    // Memanggil fungsi sum tanpa argumen
    val total3 = sum()
    println("Total sum with no arguments: $total3")
}
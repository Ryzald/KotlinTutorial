package org.example.fundamental

// Boolean adalah sebuah tipe data yang hanya memiliki dua nilai, yaitu true dan false

fun main() {

    // companion or AND (&&) = mengembalikan nilai true jika semua hasil evaluasi expression yang diberikan bernilai true.
    val minimumCapacity = 3
    val maximumCapacity = 8
    val currentCapacity = 5
    val currentCapacity2 = 9
    val currentCapacity3 = 2

    val condition: String = if (currentCapacity >= minimumCapacity && currentCapacity <= maximumCapacity) {
        "still fit"
    } else {
        "overload passengers"
    }

    val condition2: String = if (currentCapacity2 >= minimumCapacity && currentCapacity2 <= maximumCapacity) {
        "still fit"
    } else {
        "overload passengers"
    }

    // Contoh penggunaan OR (||)
    val condition3: String = if (currentCapacity3 < minimumCapacity || currentCapacity3 > maximumCapacity) {
        "out of acceptable range"
    } else {
        "within acceptable range"
    }

    // Contoh penggunaan negasi (!)
    val condition4: String = if (!(currentCapacity >= minimumCapacity && currentCapacity <= maximumCapacity)) {
        "not within acceptable range"
    } else {
        "within acceptable range"
    }

    println(condition)  // Output: still fit
    println(condition2) // Output: overload passengers
    println(condition3) // Output: out of acceptable range
    println(condition4) // Output: within acceptable range
}

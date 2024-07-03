package org.example.controlFlow

// continue = skip
// break = stop

// with label
fun main() {
    outerLoop@ for (i in 1..5) { // Label outerLoop untuk perulangan luar
        for (j in 1..5) {
            if (j == 3) {
                break@outerLoop // Menghentikan perulangan terluar
            }
            println("i = $i, j = $j")
        }
    }
    println("Loop terminated")

    // looping wil stop ine outerloop not
// output
//    i = 1, j = 1
//    i = 1, j = 2
//    Loop terminated


    var a = 11

    when (a) {
            > 0 -> print("Ok")
    }
}
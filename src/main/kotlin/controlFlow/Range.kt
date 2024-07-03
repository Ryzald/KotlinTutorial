package org.example.controlFlow

fun main() {
    val rangeInt =  1..10 step 2
    println(rangeInt.step)

    rangeInt.forEach{number ->
        println(number)
    }

    if (1 <= 7 && 7 <= 10){
        println("Value 7 available")
    }
    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 available")
    }
}
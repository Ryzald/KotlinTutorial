package org.example.controlFlow

fun main() {

    // while
    var counter = 1
    while (counter <= 7) {
        println("Number $counter")
        counter++
    }
// do while ( at least one looping will execute)
    do {
        println(counter)

    } while (counter < 1) //false
}
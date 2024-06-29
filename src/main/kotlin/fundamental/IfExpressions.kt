package org.example.fundamental

fun main() {
    val hour = 7

    // if else
    val ifStatement: String = if (hour > 6) {
        "true statement"
    } else {
        "false statement"
    }
    println(ifStatement)


    // if else if
    val capacity = 12
    val passengers = 5
    val condition : String

    condition = if (passengers <= capacity) {
        "Still fit"

    } else if (passengers > capacity) {
        "Overloading passengers"
    } else {
        "There is no passengers"
    }

    println(condition)

}
package org.example.controlFlow

fun main() {

    val value = 7
// if only one line code in each branch
    val stringOfValue = when (value) {
        4 -> "value is 4"
        5 -> "value is 5"
        6 -> "value is 6"
        7 -> "value is 7"
        else -> "invalid value"

    }
    println(stringOfValue)
// if more than one line U can use {}
    val stringOfValue2 = when (value) {
        7 -> {
            println("seven")
            "the value is seven"
        }

        8 -> {
            println("eight")
            "the value is eight"
        }

        else -> {
            "invalid input value"
        }
    }

    // using is
    println(stringOfValue2)
    fun checkType(obj: Any) {
        when (obj) {
            is String -> {
                println("The object is a String: $obj")
            }

            is Int -> {
                println("The object is an Int: $obj")
            }

            is Double -> {
                println("The object is a Double: $obj")
            }

            !is String -> {
                println("The object is not a String: $obj")
            }

            else -> {
                println("Unknown type")
            }
        }
    }
    checkType("Hello")    // The object is a String: Hello
    checkType(123)        // The object is an Int: 123
    checkType(45.67)      // The object is a Double: 45.67
    checkType(true)       // The object is not a String: true
}
package org.example.controlFlow

fun main() {
    val ranges = 1.rangeTo(5)
    for (i in ranges) {
        println("value is $i")
    }


//    from code above you can do the same result usign foreach

    ranges.forEach { it ->
        println(it)
    }
}
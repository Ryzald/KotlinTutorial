package org.example.fundamental

fun main() {
    // indexing string start from 0
    // but length of textstring is 6

    val textString = "KOTLIN"

    println(textString.length)

    val firstChar = textString[0]
    val lastChar = textString[5]

    println("first character is $firstChar and last character is $lastChar")

//    \t: menambah tab ke dalam teks.
//    \n: membuat baris baru di dalam teks.
//    \’: menambah karakter single quote kedalam teks.
//    \”: menambah karakter double quote kedalam teks.
//    \\: menambah karakter backslash kedalam teks.

    val statement = "Kotlin is \"Awesome!\""
    println(statement)


//    RAW STRING using """ and .trimIndent()

    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    print(line)


//    String Template = menyisipkan sebuah variabel ke dalam sebuah String tanpa concatenation
    val name = "Rizaldi"
    println("my name is " + name) // using concate
    println("my name is $name") //  using string template
    val hour = 7
    print("Office ${if (hour > 7) "already close" else "is open"}")

}
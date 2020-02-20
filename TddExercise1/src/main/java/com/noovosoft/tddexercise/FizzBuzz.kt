package com.noovosoft.tddexercise

fun fizzBuzz(number: Int): String {
    var output = ""
    if (number % 3 == 0) {
        output = output.plus("Fizz")
    }
    if (number % 5 == 0) {
        output = output.plus("Buzz")
    }
    if (output == "") {
        return "$number"
    }
    return output
}
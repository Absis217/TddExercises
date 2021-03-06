package com.noovosoft.tddexercise

fun factorial(number: Int): Int {
    var factorial = 1
    if (number < 0) {
        println("Invalid argument: given number is negative")
        return -1
    }
    for (multiplier in 1..number) {
        factorial *= multiplier
    }
    return factorial
}

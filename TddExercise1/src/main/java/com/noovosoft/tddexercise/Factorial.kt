package com.noovosoft.tddexercise

fun factorial(number: Int): Int {
    var product = 1
    if (number < 0) {
        print("Invalid argument: given number is negative ")
        return -1
    }
    for (multiplier in 1..number) {
        product *= multiplier
    }
    return product
}
package com.noovosoft.tddexercise

fun fibonacci(number: Int): Int {
    if (number <= 0) {
        print("invalid Input: input number must be greater than or equal to 1")
        return -1
    }
    var nextNumber = 1
    var prevNumber = 1
    var currentNumber = 1
    for (i in 3..number) {
        nextNumber = currentNumber + prevNumber
        prevNumber = currentNumber
        currentNumber = nextNumber
    }
    return nextNumber
}
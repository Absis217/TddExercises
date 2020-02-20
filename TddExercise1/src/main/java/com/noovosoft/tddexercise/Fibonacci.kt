package com.noovosoft.tddexercise

fun fibonacciIterative(number: Int): Int {
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

fun fibonacciRecursive(number: Int): Int {
    if (number <=0) {
        print("Invalid input to Fibonacci function: input number should be greater than or equal to 1")
        return 0
    }
    if (number == 1) {
        return number
    }
    return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2)
}
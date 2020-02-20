package com.noovosoft.tddexercise

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
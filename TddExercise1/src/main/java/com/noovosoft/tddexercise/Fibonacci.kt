package com.noovosoft.tddexercise

fun fibonacciIterative(number: Int): Int {
    if (number <= 0) {
        return -1
    }
    if (number == 1) {
        return 0
    }
    var next = 1
    var prev = 0
    var current = 1
    for (i in 3..number) {
        next = current + prev
        prev = current
        current = next
    }
    return next
}

fun fibonacciRecursive(number: Int): Int {
    if (number <= 0) {
        return 0
    }
    if (number == 1) {
        return number
    }
    return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2)
}
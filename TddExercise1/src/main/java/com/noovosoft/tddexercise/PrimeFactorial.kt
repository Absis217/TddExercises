package com.noovosoft.tddexercise

fun primeFactorial(input: Int): List<Int> {
    val primeFactors = mutableListOf<Int>()
    var number = input
    if (number <= 1) {
        print("invalid input: provide number greater than 1")
        primeFactors.add(-1)
        return primeFactors
    }
    for (i in 2..number) {
        if (number % i == 0) {
            number /= i
            primeFactors.add(i)
            if (number % i == 0) {
                primeFactors.addAll(primeFactorial(number))
                return primeFactors
            }
        }
    }
    return primeFactors
}
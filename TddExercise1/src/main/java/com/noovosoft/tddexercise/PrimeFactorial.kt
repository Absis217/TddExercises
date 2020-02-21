package com.noovosoft.tddexercise

fun primeFactorial(input: Int, startNum: Int = 2): List<Int> {
    val primeFactors = mutableListOf<Int>()
    var number = input
    if (number <= 1) {
        print("invalid input: provide number greater than 1")
        primeFactors.add(-1)
        return primeFactors
    }
    for (i in startNum..number) {
        if (number % i == 0) {
            number /= i
            primeFactors.add(i)
            if (number % i == 0) {
                primeFactors.addAll(primeFactorial(number, i))
                return primeFactors
            }
        }
    }
    return primeFactors
}
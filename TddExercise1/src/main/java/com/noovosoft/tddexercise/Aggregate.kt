package com.noovosoft.tddexercise

import kotlin.math.round

fun minimum(input: List<Int>): Int {
    return input.min()!!
}

fun maximum(input: List<Int>): Int {
    return input.max()!!
}

fun count(input: List<Int>): Int {
    return input.size
}

fun averageOfList(input: List<Int>): Double {
    return (round(input.average() * 100) / 100)
}

fun aggregate(inputList: List<Int>): Map<String, Number> {
    val result = mutableMapOf<String, Number>(
            "Min" to minimum(inputList),
            "Max" to maximum(inputList),
            "Count" to count(inputList),
            "Average" to averageOfList(inputList)
    )
    return result
}
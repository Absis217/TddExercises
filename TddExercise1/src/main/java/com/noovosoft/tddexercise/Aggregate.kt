package com.noovosoft.tddexercise

import kotlin.math.round

fun minimum(input: List<Int>): Int {
    return input.sorted().first()
}

fun maximum(input: List<Int>): Int {
    return input.sorted().last()
}

fun count(input: List<Int>): Int {
    return input.size
}

fun listAverage(input: List<Int>): Double {
    return (round(input.average() * 100) / 100)
}

fun aggregate(args: List<Int>): Map<String, Number> {
    var arguments = mutableListOf<Int>()
    var result = mutableMapOf<String, Number>()
    args.forEach { arguments.add(it) }
    result.set("Min", minimum(arguments))
    result.set("Max", maximum(arguments))
    result.set("Count", count(arguments))
    result.set("Average", listAverage(arguments))
    return result
}
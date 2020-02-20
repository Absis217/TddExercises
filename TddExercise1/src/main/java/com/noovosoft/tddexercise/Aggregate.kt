package com.noovosoft.tddexercise

import kotlin.math.min
import kotlin.math.round

fun Min(input: List<Int>): Int {
    return input.sorted().first()
}

fun Max(input: List<Int>): Int {
    return input.sorted().last()
}

fun Count(input: List<Int>): Int {
    return input.size
}

fun Average(input: List<Int>): Double {
    return (round(input.average() * 100) / 100)
}

fun Aggregate(args: List<Int>): Map<String, Number> {
    var arguments = mutableListOf<Int>()
    var result = mutableMapOf<String, Number>()
    args.forEach { arguments.add(it) }
    result.set("Min", Min(arguments))
    result.set("Max", Max(arguments))
    result.set("Count", Count(arguments))
    result.set("Average", Average(arguments))
    return result
}
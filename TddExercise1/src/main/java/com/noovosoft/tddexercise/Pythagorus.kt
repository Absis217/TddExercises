package com.noovosoft.tddexercise

import kotlin.math.round
import kotlin.math.sqrt

fun pythagorus(sideOne: Double, sideTwo: Double): Double {
    var hypotenous: Double
    if (sideOne * sideTwo == 0.0) return 0.0
    hypotenous = (sideOne * sideOne) + (sideTwo * sideTwo)
    return (round(sqrt(hypotenous) * 100) / 100)
}
package com.noovosoft.tddexercise

import kotlin.math.round
import kotlin.math.sqrt

fun pythagoras(sideOne: Double, sideTwo: Double): Double {
    if (sideOne <= 0 || sideTwo <= 0 ) {
        return 0.0
    }
    val hypotenuse: Double = (sideOne * sideOne) + (sideTwo * sideTwo)
    return (round(sqrt(hypotenuse) * 100) / 100)
}
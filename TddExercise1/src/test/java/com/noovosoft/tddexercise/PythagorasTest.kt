package com.noovosoft.tddexercise

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

internal class PythagorasTest {

    @ParameterizedTest
    @MethodSource("Provide input to pythagorasTest")
    fun `Test Pythagoras function with provided input test cases`(expected: Double, sideOne: Double, sideTwo: Double) {
        assertEquals(expected, pythagoras(sideOne, sideTwo))
    }

    companion object {
        @JvmStatic
        fun `Provide input to pythagorasTest`(): Stream<Arguments> =
                Stream.of(
                        Arguments.of(0.0, 0.0, 0.0),
                        Arguments.of(0.0, 0.0, 10.0),
                        Arguments.of(5.0, 3.0, 4.0),
                        Arguments.of(0.0, -3.0, 4.0),
                        Arguments.of(8.57, 2.5, 8.2),
                        Arguments.of(2.83, 2.0, 2.0)
                )
    }
}
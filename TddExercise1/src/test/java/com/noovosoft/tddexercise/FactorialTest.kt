package com.noovosoft.tddexercise

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

internal class FactorialTest {
    companion object {
        @JvmStatic
        fun `factorial of given number`(): Stream<Arguments> =
                Stream.of(
                        Arguments.of(-5, -1),
                        Arguments.of(-87, -1),
                        Arguments.of(0, 1),
                        Arguments.of(9, 362880),
                        Arguments.of(6, 720)
                )
    }

    @ParameterizedTest
    @MethodSource("factorial of given number")
    fun `factorial Of Given Input`(testInputNumber: Int, expected: Int) {
        assertEquals(expected, factorial(testInputNumber))
    }
}
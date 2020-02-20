package com.noovosoft.tddexercise

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

internal class FactorialTest {

    @ParameterizedTest
    @MethodSource("Provide arguments to factorial test case")
    fun `Factorial Of given Input`(expected: Int, testInputNumber: Int) {
        assertEquals(expected, factorial(testInputNumber))
    }

    companion object {
        @JvmStatic
        fun `Provide arguments to factorial test case`(): Stream<Arguments> =
                Stream.of(
                        Arguments.of(-1, -5),
                        Arguments.of(-1, -87),
                        Arguments.of(1, 0),
                        Arguments.of(362880, 9),
                        Arguments.of(720, 6)
                )
    }
}
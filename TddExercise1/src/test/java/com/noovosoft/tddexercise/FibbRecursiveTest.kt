package com.noovosoft.tddexercise

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

internal class FibonacciRecursiveTest {

    companion object {
        @JvmStatic
        fun `input to recursive fibonacci`(): Stream<Arguments> =
                Stream.of(
                        Arguments.of(0, 0),
                        Arguments.of(1, 1),
                        Arguments.of(1, 2),
                        Arguments.of(8, 6),
                        Arguments.of(0, -9)
                )
    }

    @ParameterizedTest
    @MethodSource("input to recursive fibonacci")
    fun `input given to Fibonacci Recursive`(expected: Int, inputToFib: Int) {
        assertEquals(expected, fibonacciRecursive(inputToFib))
    }
}
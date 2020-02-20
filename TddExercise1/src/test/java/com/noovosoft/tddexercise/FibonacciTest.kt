package com.noovosoft.tddexercise

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

internal class HelloTest {

    companion object {
        @JvmStatic
        fun `provide input to fibonacciIterative test`(): Stream<Arguments> =
                Stream.of(
                        Arguments.of(-1, 0),
                        Arguments.of(0, 1),
                        Arguments.of(1, 2),
                        Arguments.of(1, 3),
                        Arguments.of(8, 7),
                        Arguments.of(-1, -8),
                        Arguments.of(34, 10)
                )

        @JvmStatic
        fun `provide input to recursive fibonacci`(): Stream<Arguments> =
                Stream.of(
                        Arguments.of(0, 0),
                        Arguments.of(1, 1),
                        Arguments.of(1, 2),
                        Arguments.of(8, 6),
                        Arguments.of(0, -9)
                )
    }

    @ParameterizedTest
    @MethodSource("provide input to fibonacciIterative test")
    fun `give Input to Fibonacci function`(expected: Int, inputNumber: Int) {
        assertEquals(expected, fibonacciIterative(inputNumber) )
    }

    @ParameterizedTest
    @MethodSource("provide input to recursive fibonacci")
    fun `input given to Fibonacci Recursive`(expected: Int, inputToFib: Int) {
        assertEquals(expected, fibonacciRecursive(inputToFib))
    }
}


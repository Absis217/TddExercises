package com.noovosoft.tddexercise

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

internal class PrimeFactorialTest {

    @ParameterizedTest
    @MethodSource("provide test cases to primeFactorialTest")
    fun `input test cases to primeFactorial function`(expected: List<Int>, inputNumber: Int) {
        assertEquals(expected, primeFactorial(inputNumber))
    }

    companion object {
        @JvmStatic
        fun `provide test cases to primeFactorialTest`(): Stream<Arguments> =
                Stream.of(
                        Arguments.of(mutableListOf(-1), 0),
                        Arguments.of(mutableListOf(-1), 1),
                        Arguments.of(mutableListOf(-1), -7),
                        Arguments.of(mutableListOf(2), 2),
                        Arguments.of(mutableListOf(2, 3), 6),
                        Arguments.of(mutableListOf(2, 2, 3), 12),
                        Arguments.of(mutableListOf(5, 5, 7, 13), 2275)
                )
    }
}

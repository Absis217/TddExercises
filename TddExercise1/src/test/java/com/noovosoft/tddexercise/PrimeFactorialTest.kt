package com.noovosoft.tddexercise

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

internal class PrimeFactorialtest {

    companion object {
        @JvmStatic
        fun `provide test cases to primeFactorialTest`(): Stream<Arguments> =
                Stream.of(
                        Arguments.of(2)
                )
    }

    @ParameterizedTest
    @MethodSource("provide test cases to primeFactorialTest")
    fun `Input given to primeFactorial function is 1`() {

    }
}

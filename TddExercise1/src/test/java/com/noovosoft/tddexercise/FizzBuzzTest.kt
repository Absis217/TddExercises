package com.noovosoft.tddexercise

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

internal class FizzBuzzTest {

    @ParameterizedTest
    @MethodSource("Provide input to FizzBuzz function")
    fun `Input given to FizBuzz function`(expected: String, inputToFizzBuzz: Int) {
        assertEquals(expected, fizzBuzz(inputToFizzBuzz))
    }

    companion object {
        @JvmStatic
        fun `Provide input to FizzBuzz function`(): Stream<Arguments> =
                Stream.of(
                        Arguments.of("FizzBuzz", 0),
                        Arguments.of("Fizz", 6),
                        Arguments.of("Buzz", 10),
                        Arguments.of("7", 7),
                        Arguments.of("FizzBuzz", -15),
                        Arguments.of("FizzBuzz", 120),
                        Arguments.of("98", 98)
                )
    }
}
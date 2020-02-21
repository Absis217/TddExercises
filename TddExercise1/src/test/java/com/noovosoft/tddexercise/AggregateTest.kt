package com.noovosoft.tddexercise

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

fun convertToTestMap(min: Int, max: Int, count: Int, average: Double): Map<String, Number> {
    return mutableMapOf("Min" to min, "Max" to max, "Count" to count, "Average" to average)
}

internal class AggregateTest {

    @ParameterizedTest
    @MethodSource("Give different number of inputs to Aggregate function test case")
    fun `Aggregate function to calculate min max count average`(expected: Map<String, Number>, input: List<Int>) {
        assertEquals(expected, aggregate(input))
    }

    companion object {
        @JvmStatic
        fun `Give different number of inputs to Aggregate function test case`(): Stream<Arguments> =
                Stream.of(
                        Arguments.of(convertToTestMap(0, 0, 1, 0.0), mutableListOf(0)),
                        Arguments.of(convertToTestMap(3, 8, 3, 5.67), mutableListOf(3, 6, 8)),
                        Arguments.of(convertToTestMap(-5, 9, 4, 0.50), mutableListOf(-5, -2, 0, 9)),
                        Arguments.of(convertToTestMap(-994, 643, 6, 19.5), mutableListOf(-994, 643, 2, 477, 624, -635))
        )
    }
}
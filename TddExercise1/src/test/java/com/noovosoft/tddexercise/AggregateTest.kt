package com.noovosoft.tddexercise

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

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
                        Arguments.of(mutableMapOf("Min" to 0, "Max" to 0, "Count" to 1, "Average" to 0.0), mutableListOf(0)),
                        Arguments.of(mutableMapOf("Min" to 3, "Max" to 8, "Count" to 3, "Average" to 5.67), mutableListOf(3, 6, 8)),
                        Arguments.of(mutableMapOf("Min" to -5, "Max" to 9, "Count" to 4, "Average" to 0.50), mutableListOf(-5, -2, 0, 9)),
                        Arguments.of(mutableMapOf("Min" to -994, "Max" to 643, "Count" to 6, "Average" to 19.5), mutableListOf(-994, 643, 2, 477, 624, -635))
                )
    }
}
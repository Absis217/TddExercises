package com.noovosoft.tddexercise

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

internal class PalindromeTest {

    companion object {
        @JvmStatic
        fun `provide input to PalindromeTest function`(): Stream<Arguments> =
                Stream.of(
                        Arguments.of(true, ""),
                        Arguments.of(true, "a"),
                        Arguments.of(true, "A dog! A panic in a pagoda"),
                        Arguments.of(false, "Here is a bicycle!!"),
                        Arguments.of(true, "ra@#@%ce@#%^@#car"),
                        Arguments.of(false, "Ab"),
                        Arguments.of(true, "a!a!")
                )
    }

    @ParameterizedTest
    @MethodSource("provide input to PalindromeTest function")
    fun `input test arguments to Palindrome`(expected: Boolean, inputString: String) {
        assertEquals(expected, isPalindrome(inputString))
    }
}
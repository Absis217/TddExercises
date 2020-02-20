package com.noovosoft.tddexercise

fun isPalindrome(inputString: String): Boolean {
    val stringWithOnlyDigits = inputString.filter { it.isLetter() }.toLowerCase()
    val lengthOfFilterString = stringWithOnlyDigits.length
    for (i in 0 until (lengthOfFilterString / 2)) {
        if (stringWithOnlyDigits[i] != stringWithOnlyDigits[lengthOfFilterString - 1 - i]) {
            return false
        }
    }
    return true
}

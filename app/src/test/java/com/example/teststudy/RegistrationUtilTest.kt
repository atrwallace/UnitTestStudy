package com.example.teststudy

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun emptyNameReturnsFalse() {
        val result = RegistrationUtil.validateRegistrationInput(
            "", "123456", "123456"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun usernameAlreadyExistsReturnsFalse() {
        val result = RegistrationUtil.validateRegistrationInput("Joana", "123456", "123456")
        assertThat(result).isFalse()
    }

    @Test
    fun emptyPasswordReturnsFalse() {
        val result = RegistrationUtil.validateRegistrationInput("Altair", "", "")
        assertThat(result).isFalse()
    }

    @Test
    fun confirmedPasswordDoesntMatchReturnsFalse() {
        val result = RegistrationUtil.validateRegistrationInput("Altair", "123456", "aleluia1")
        assertThat(result).isFalse()
    }

    @Test
    fun passwordHaveLessThanTwoDigitsReturnsFalse() {
        val result = RegistrationUtil.validateRegistrationInput("Altair", "1", "1")
        assertThat(result).isFalse()
    }

    @Test
    fun validUsernameandCorrectedRepeatedPasswordReturnsTrue() {
        val result = RegistrationUtil.validateRegistrationInput("Altair", "123456", "123456")
        assertThat(result).isTrue()
    }

}
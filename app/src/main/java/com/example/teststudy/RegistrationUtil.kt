package com.example.teststudy

object RegistrationUtil {

    private val existingList = listOf("Joana", "Maria")

    /**
     * input is not valid if
     * the username is already taken DONE
     * the confirmed password doesnt match password DONE
     * username/password is empty DONE
     * password contains less than 2 digits
     */
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            return false
        }
        if (username in existingList) {
            return false
        }
        if (password != confirmedPassword) {
            return false
        }
        if (password.count { it.isDigit() } < 2) {
            return false
        }
        return true
    }
}
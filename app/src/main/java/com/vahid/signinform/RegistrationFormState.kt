package com.vahid.signinform

data class RegistrationFormState(
    val email: String = "",
    val password: String = "",
    val repeatedPassword: String = "",
    val acceptedTerm: Boolean = false,
    val emailError: String? = "",
    val passwordError: String? = "",
    val repeatedPasswordError: String? = "",
    val termsError: String? = ""
)

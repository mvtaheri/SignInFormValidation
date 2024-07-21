package com.vahid.signinform.presentation

sealed class RegistrationFormEvent {
    data class EmailChange(val email: String) : RegistrationFormEvent()
    data class PasswordChange(val password: String) : RegistrationFormEvent()
    data class RepeatedPasswordChange( val repeatedPassword: String) :
        RegistrationFormEvent()

    data class AcceptTerms(val isAccepted: Boolean) : RegistrationFormEvent()
    object Submit : RegistrationFormEvent()
}
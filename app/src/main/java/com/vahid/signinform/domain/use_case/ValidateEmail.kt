package com.vahid.signinform.domain.use_case

import android.util.Patterns
import java.util.regex.Pattern

class ValidateEmail {
    fun execute(email: String): ValidationResult {
        if (email.isBlank()) {
            return ValidationResult(
                successful = false,
                message = "the email can not be blank"
            )
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return ValidationResult(
                successful = false,
                message = "thats not valid email"
            )
        }
        return ValidationResult(
            successful = true
        )
    }
}
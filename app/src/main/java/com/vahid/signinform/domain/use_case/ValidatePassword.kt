package com.vahid.signinform.domain.use_case

import android.util.Patterns
import java.util.regex.Pattern

class ValidatePassword {
    fun execute(password: String): ValidationResult {
        if (password.length < 8) {
            return ValidationResult(
                successful = false,
                message = "the password needs to consist of at least 8 characters"
            )
        }
        val containsLetterAndDigits =
            password.any { it.isDigit() } && password.any { it.isLetter() }
        if (!containsLetterAndDigits) {
            return ValidationResult(
                successful = false,
                message = "the password need to contain at least one letter and one digit"
            )
        }
        return ValidationResult(
            successful = true
        )
    }
}
package com.vahid.signinform.domain.use_case

import android.util.Patterns
import java.util.regex.Pattern

class ValidateRepeatedPassword {
    fun execute(password: String, repeatedPassword: String): ValidationResult {
        if (password != repeatedPassword) {
            return ValidationResult(
                successful = false,
                message = "the passwords dont match"
            )
        }
        return ValidationResult(
            successful = true
        )
    }
}
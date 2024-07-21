package com.vahid.signinform.domain.use_case

import android.util.Patterns
import java.util.regex.Pattern

class ValidateTerms {
    fun execute(acceptedTerms: Boolean): ValidationResult {
        if (!acceptedTerms) {
            return ValidationResult(
                successful = false,
                message = "please accept the terms"
            )
        }
        return ValidationResult(
            successful = true
        )
    }
}
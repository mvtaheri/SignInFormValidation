package com.vahid.signinform.domain.use_case

data class ValidationResult(
    val successful: Boolean,
    val message: String? = ""
)

package com.example.tasks.service.listener

class ValidationListener(errorMessage: String = "") {
    //usando uma classe para englobar os atributos que precisam ser pessados pela activity
    private var mStatus: Boolean = true
    private var mValidationMessage: String = ""

    init {
        if (errorMessage != "") {
            mStatus = false
            mValidationMessage = errorMessage
        }
    }

    fun success() = mStatus
    fun failure() = mValidationMessage

}
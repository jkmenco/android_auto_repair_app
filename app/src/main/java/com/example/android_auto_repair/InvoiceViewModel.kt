package com.example.android_auto_repair

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class InvoiceViewModel : ViewModel() {

    var customer by mutableStateOf("")
        private set

    var make by mutableStateOf("")
        private set

    var year by mutableStateOf("")
        private set

    var model by mutableStateOf("")
        private set

    var damage by mutableStateOf("")
        private set

    fun updateCustomer(value: String) {
        customer = value
    }

    fun updateMake(value: String) {
        make = value
    }

    fun updateYear(value: String) {
        year = value
    }

    fun updateModel(value: String) {
        model = value
    }

    fun updateDamage(value: String) {
        damage = value
    }

    fun clearInvoice() {
        customer = ""
        make = ""
        year = ""
        model = ""
        damage = ""
    }
}
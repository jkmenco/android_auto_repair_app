package com.example.android_auto_repair.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun InvoiceFormScreen(

    customer: String,
    make: String,
    year: String,
    model: String,
    damage: String,

    onCustomerChange: (String) -> Unit,
    onMakeChange: (String) -> Unit,
    onYearChange: (String) -> Unit,
    onModelChange: (String) -> Unit,
    onDamageChange: (String) -> Unit,

    onCreateInvoice: () -> Unit

) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(24.dp),

        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        Text(
            text = "INVOICE DETAILS"
        )

        OutlinedTextField(
            value = customer,

            onValueChange = onCustomerChange,

            label = {
                Text("Customer")
            },

            placeholder = {
                Text("Enter customer name")
            },

            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = make,

            onValueChange = onMakeChange,

            label = {
                Text("Make")
            },

            placeholder = {
                Text("Enter car make")
            },

            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = year,

            onValueChange = onYearChange,

            label = {
                Text("Year")
            },

            placeholder = {
                Text("Enter car year")
            },

            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = model,

            onValueChange = onModelChange,

            label = {
                Text("Model")
            },

            placeholder = {
                Text("Enter car model")
            },

            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = damage,

            onValueChange = onDamageChange,

            label = {
                Text("Damage Description")
            },

            placeholder = {
                Text("Describe the damage")
            },

            modifier = Modifier.fillMaxWidth(),

            minLines = 4
        )

        Button(
            onClick = onCreateInvoice,

            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp)
        ) {

            Text(
                text = "CREATE INVOICE"
            )
        }
    }
}
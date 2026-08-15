package com.example.android_auto_repair.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun InvoiceResultScreen(

    customer: String,
    make: String,
    year: String,
    model: String,
    damage: String,

    onFinish: () -> Unit

) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),

        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        Text(
            text = "INVOICE"
        )

        Text(
            text = "Customer: $customer"
        )

        Text(
            text = "Make: $make"
        )

        Text(
            text = "Year: $year"
        )

        Text(
            text = "Model: $model"
        )

        Text(
            text = "Damage Description:\n$damage"
        )

        Text(
            text = "INVOICE CREATED"
        )

        Button(
            onClick = onFinish,

            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {

            Text(
                text = "FINISH"
            )
        }
    }
}
package com.example.android_auto_repair.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
            text = "INVOICE",
            color = Color.White,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Customer: $customer",
            color = Color.White,
            fontSize = 18.sp
        )

        Text(
            text = "Make: $make",
            color = Color.White,
            fontSize = 18.sp
        )

        Text(
            text = "Year: $year",
            color = Color.White,
            fontSize = 18.sp
        )

        Text(
            text = "Model: $model",
            color = Color.White,
            fontSize = 18.sp
        )

        Text(
            text = "Damage Description:\n$damage",
            color = Color.LightGray,
            fontSize = 17.sp
        )

        Text(
            text = "INVOICE CREATED",
            color = Color(0xFFD32F2F),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 16.dp)
        )

        Button(
            onClick = onFinish,

            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),

            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFD32F2F),
                contentColor = Color.White
            )
        ) {

            Text(
                text = "FINISH",
                fontWeight = FontWeight.Bold
            )
        }
    }
}
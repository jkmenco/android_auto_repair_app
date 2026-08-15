package com.example.android_auto_repair.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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

        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {

        Text(
            text = "INVOICE DETAILS",
            color = Color.White,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Enter the vehicle and customer information",
            color = Color.LightGray,
            fontSize = 14.sp
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

            modifier = Modifier.fillMaxWidth(),

            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFFD32F2F),
                unfocusedBorderColor = Color(0xFFD32F2F),
                focusedLabelColor = Color(0xFFD32F2F),
                unfocusedLabelColor = Color.LightGray,
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.White,
                cursorColor = Color(0xFFD32F2F)
            )
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

            modifier = Modifier.fillMaxWidth(),

            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFFD32F2F),
                unfocusedBorderColor = Color(0xFFD32F2F),
                focusedLabelColor = Color(0xFFD32F2F),
                unfocusedLabelColor = Color.LightGray,
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.White,
                cursorColor = Color(0xFFD32F2F)
            )
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

            modifier = Modifier.fillMaxWidth(),

            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFFD32F2F),
                unfocusedBorderColor = Color(0xFFD32F2F),
                focusedLabelColor = Color(0xFFD32F2F),
                unfocusedLabelColor = Color.LightGray,
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.White,
                cursorColor = Color(0xFFD32F2F)
            )
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

            modifier = Modifier.fillMaxWidth(),

            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFFD32F2F),
                unfocusedBorderColor = Color(0xFFD32F2F),
                focusedLabelColor = Color(0xFFD32F2F),
                unfocusedLabelColor = Color.LightGray,
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.White,
                cursorColor = Color(0xFFD32F2F)
            )
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

            minLines = 4,

            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFFD32F2F),
                unfocusedBorderColor = Color(0xFF9A0007),

                focusedLabelColor = Color(0xFFD32F2F),
                unfocusedLabelColor = Color(0xFFBDBDBD),

                focusedTextColor = Color.White,
                unfocusedTextColor = Color.White,

                focusedContainerColor = Color(0xFF151515),
                unfocusedContainerColor = Color(0xFF151515),

                cursorColor = Color(0xFFD32F2F)
            )
        )

        Button(
            onClick = onCreateInvoice,

            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),

            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFD32F2F),
                contentColor = Color.White
            )
        ) {

            Text(
                text = "CREATE INVOICE",
                fontWeight = FontWeight.Bold
            )
        }
    }
}
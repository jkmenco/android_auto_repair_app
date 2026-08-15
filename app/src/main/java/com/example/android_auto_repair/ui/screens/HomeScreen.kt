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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(
    onGenerateInvoice: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),

        horizontalAlignment = Alignment.CenterHorizontally,

        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "TALLER APP",
            color = Color.White,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "AUTO REPAIR INVOICE",
            color = Color.LightGray,
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 8.dp)
        )

        Button(
            onClick = onGenerateInvoice,

            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp),

            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFD32F2F),
                contentColor = Color.White
            )
        ) {

            Text(
                text = "GENERATE INVOICE",
                fontWeight = FontWeight.Bold
            )
        }
    }
}
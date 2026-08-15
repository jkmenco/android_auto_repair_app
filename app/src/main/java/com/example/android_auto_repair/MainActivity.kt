package com.example.android_auto_repair

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.android_auto_repair.ui.theme.Android_auto_repairTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Android_auto_repairTheme {
                TallerApp()
            }
        }
    }
}

@Composable
fun TallerApp() {

    var currentScreen by remember {
        mutableStateOf("home")
    }

    var customer by remember {
        mutableStateOf("")
    }

    var make by remember {
        mutableStateOf("")
    }

    var year by remember {
        mutableStateOf("")
    }

    var model by remember {
        mutableStateOf("")
    }

    var damage by remember {
        mutableStateOf("")
    }

    when (currentScreen) {

        "home" -> {

            HomeScreen(
                onGenerateInvoice = {
                    currentScreen = "form"
                }
            )
        }

        "form" -> {

            InvoiceFormScreen(
                customer = customer,
                make = make,
                year = year,
                model = model,
                damage = damage,

                onCustomerChange = {
                    customer = it
                },

                onMakeChange = {
                    make = it
                },

                onYearChange = {
                    year = it
                },

                onModelChange = {
                    model = it
                },

                onDamageChange = {
                    damage = it
                },

                onCreateInvoice = {
                    currentScreen = "result"
                }
            )
        }

        "result" -> {

            InvoiceResultScreen(
                customer = customer,
                make = make,
                year = year,
                model = model,
                damage = damage,

                onFinish = {

                    currentScreen = "home"

                    customer = ""
                    make = ""
                    year = ""
                    model = ""
                    damage = ""
                }
            )
        }
    }
}


/*
 * Main screen
 */
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
            text = "TALLER APP"
        )

        Button(
            onClick = onGenerateInvoice,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 32.dp)
        ) {

            Text(
                text = "GENERATE INVOICE"
            )
        }
    }
}


/*
 * Invoice form screen
 */
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


/*
 * Invoice result screen
 */
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
            .verticalScroll(rememberScrollState())
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
package com.example.android_auto_repair

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.android_auto_repair.ui.screens.HomeScreen
import com.example.android_auto_repair.ui.screens.InvoiceFormScreen
import com.example.android_auto_repair.ui.screens.InvoiceResultScreen
import com.example.android_auto_repair.ui.theme.Android_auto_repairTheme

class MainActivity : ComponentActivity() {

    private val invoiceViewModel: InvoiceViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Android_auto_repairTheme {

                androidx.compose.foundation.layout.Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFF080808))
                ) {
                    TallerApp(invoiceViewModel)
                }
            }
        }
    }
}

@Composable
fun TallerApp(
    viewModel: InvoiceViewModel
) {

    var currentScreen by remember {
        mutableStateOf("home")
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

                customer = viewModel.customer,
                make = viewModel.make,
                year = viewModel.year,
                model = viewModel.model,
                damage = viewModel.damage,

                onCustomerChange = {
                    viewModel.updateCustomer(it)
                },

                onMakeChange = {
                    viewModel.updateMake(it)
                },

                onYearChange = {
                    viewModel.updateYear(it)
                },

                onModelChange = {
                    viewModel.updateModel(it)
                },

                onDamageChange = {
                    viewModel.updateDamage(it)
                },

                onCreateInvoice = {
                    currentScreen = "result"
                }
            )
        }

        "result" -> {

            InvoiceResultScreen(

                customer = viewModel.customer,
                make = viewModel.make,
                year = viewModel.year,
                model = viewModel.model,
                damage = viewModel.damage,

                onFinish = {

                    viewModel.clearInvoice()
                    currentScreen = "home"
                }
            )
        }
    }
}
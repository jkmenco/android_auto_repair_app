# Android Auto Repair

Android Auto Repair is a simple Android application developed as a mobile module for an automotive repair workshop project.

The application represents a simplified invoice generation process. It allows the user to enter customer and vehicle information and then display the information as a generated invoice.

This project was developed as an Android implementation based on one of the processes of the main auto repair workshop project.

---

## Project Purpose

The purpose of this application is to demonstrate the development of a mobile module under the Android platform using the requirements and processes related to the auto repair workshop project.

The implemented module focuses specifically on the invoice generation flow.

The application does not attempt to reproduce the complete workshop system. Instead, it provides a small functional module that represents part of the invoice process.

---

## Features

- Invoice generation flow.
- Customer information input.
- Vehicle make input.
- Vehicle year input.
- Vehicle model input.
- Damage description input.
- Invoice result visualization.
- Temporary invoice data management.
- Simple three-screen navigation.
- Dark automotive-style user interface.

---

## Application Flow

The application consists of three main screens:

### 1. Home Screen

The initial screen allows the user to start the invoice process.

```text
TALLER APP

AUTO REPAIR INVOICE

[ GENERATE INVOICE ]

2. Invoice Details

The user enters the information required for the invoice.

Customer
Make
Year
Model
Damage Description


[ CREATE INVOICE ]
3. Invoice Result

The application displays the information entered by the user as a generated invoice.

INVOICE


Customer
Make
Year
Model
Damage Description


INVOICE CREATED


[ FINISH ]
Architecture

The project uses a simplified MVVM architecture.

MainActivity
     |
     +-----------------------+
     |                       |
     v                       v
Compose Screens        InvoiceViewModel
     |                       |
     |                       |
     +----------> State <----+
MainActivity

MainActivity is responsible for initializing the application and loading the Compose interface.

It also coordinates the main screen flow.

InvoiceViewModel

InvoiceViewModel manages the temporary state of the invoice.

It contains:

Customer
Make
Year
Model
Damage Description

It also provides functions for updating and clearing the invoice information.

UI Screens

The user interface is divided into three independent Compose screens:

ui/screens/


HomeScreen.kt
InvoiceFormScreen.kt
InvoiceResultScreen.kt

Each screen has a specific responsibility.

Technologies
Programming Language
Kotlin
Development Environment
Android Studio
UI Framework
Jetpack Compose
Material 3
Architecture
MVVM
Android ViewModel
Platform
Android
User Interface

The application uses a dark visual style inspired by an automotive repair environment.

The main visual characteristics are:

Dark black background.
Red primary color.
Red input borders.
White main text.
Gray secondary text.
Red action buttons.

The interface and application content are entirely in English.

Data Management

This version of the application uses temporary in-memory data.

The invoice information is maintained by InvoiceViewModel while the application flow is active.

No external database is required.

No backend service is required.

No API connection is required.

No authentication system is implemented.

The purpose of this implementation is to demonstrate the mobile module and its user flow.

Project Structure
Android Auto Repair
│
├── app
│   │
│   ├── manifests
│   │   └── AndroidManifest.xml
│   │
│   ├── kotlin+java
│   │   └── com.example.android_auto_repair
│   │       │
│   │       ├── MainActivity.kt
│   │       ├── InvoiceViewModel.kt
│   │       │
│   │       ├── ui
│   │       │   ├── screens
│   │       │   │   ├── HomeScreen.kt
│   │       │   │   ├── InvoiceFormScreen.kt
│   │       │   │   └── InvoiceResultScreen.kt
│   │       │   │
│   │       │   └── theme
│   │       │       ├── Color.kt
│   │       │       ├── Theme.kt
│   │       │       └── Type.kt
│   │       │
│   │       └── ...
│   │
│   └── res
│       ├── drawable
│       ├── mipmap
│       └── values
│
└── README.md
Main Components
MainActivity.kt

Initializes the Android application and Compose environment.

InvoiceViewModel.kt

Controls invoice state and provides methods for modifying and clearing the information.

HomeScreen.kt

Displays the application home screen and invoice generation button.

InvoiceFormScreen.kt

Provides the form used to enter customer and vehicle information.

InvoiceResultScreen.kt

Displays the generated invoice information.

Theme.kt

Defines the Material 3 theme used by the application.

Color.kt

Defines the main colors used by the application interface.

Example

The following information can be used to test the application:

Customer:
John Smith


Make:
Toyota


Year:
2020


Model:
Corolla


Damage Description:
Front bumper damaged and requires repair.

After selecting CREATE INVOICE, the information is displayed on the invoice result screen.

Testing the Application

To test the application:

Open the project in Android Studio.
Build the project.
Start an Android emulator or connect an Android device.
Run the application.
Select GENERATE INVOICE.
Enter customer and vehicle information.
Enter a damage description.
Select CREATE INVOICE.
Verify the information displayed on the invoice screen.
Select FINISH to return to the main screen.
Scope

This implementation is intentionally limited to the invoice generation interface and its basic application flow.

The following components are outside the scope of this version:

Backend integration.
REST API integration.
Database persistence.
Authentication.
Real invoice calculation.
PDF generation.
Email delivery.
Payment processing.
Complete workshop management.

These components can be integrated in a larger implementation of the complete workshop system.

Development Objective

The application demonstrates the implementation of a mobile Android module based on a process from the auto repair workshop project.

The main objective is to demonstrate:

Android mobile development.
Kotlin programming.
Jetpack Compose UI development.
MVVM organization.
State management with ViewModel.
Separation of interface and application state.
Basic mobile application navigation.
Implementation of a functional invoice workflow.
License

This project was developed for academic purposes.



### Una recomendación para el video


No leas el README. El video debe demostrar **trabajo real**:


1. **Presentas el objetivo.**
2. **Muestras la arquitectura.**
3. **Ejecutas la app.**
4. **Llenas el formulario.**
5. **Generas la factura.**
6. **Muestras el resultado.**
7. **Abres `InvoiceViewModel.kt`.**
8. **Abres las tres pantallas.**
9. **Explicas la separación de responsabilidades.**
10. **Cierras.**

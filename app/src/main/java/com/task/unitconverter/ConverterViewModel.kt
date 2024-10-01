package com.task.unitconverter

import androidx.lifecycle.ViewModel

class ConverterViewModel : ViewModel() {

    fun getConversions() = listOf(
        Conversion(1, "Pounds to Kilograms", "lbs", "kgs", 0.453592),
        Conversion(2, "Kilograms to Pounds", "kgs", "lbs", 2.20462),
        Conversion(3, "Yards to Metres", "yd", "m", 0.9144),
        Conversion(4, "Meters to Yards", "m", "yd", 1.09361),
        Conversion(5, "Kms to Miles", "km", "mi", 0.621371),
        Conversion(6, "Miles to Kms", "mi", "km", 1.60934)
    )
}
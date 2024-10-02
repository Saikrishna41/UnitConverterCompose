package com.task.unitconverter

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun TopScreen(modifier: Modifier = Modifier, list: List<Conversion>) {
    ConversionMenu(list = list, modifier)
}
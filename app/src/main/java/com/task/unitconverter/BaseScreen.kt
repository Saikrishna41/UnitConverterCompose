package com.task.unitconverter

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

//naver pass viewmodel as parameter to composable

@Composable
fun BaseScreen(
    modifier: Modifier = Modifier,
    converterViewModel: ConverterViewModel = viewModel()
) {
    val conversionsList = converterViewModel.getConversions()
    TopScreen(list = conversionsList)
    Spacer(
        modifier = Modifier
            .fillMaxWidth()
            .height(20.dp)
    )
    HistoryScreen()
}
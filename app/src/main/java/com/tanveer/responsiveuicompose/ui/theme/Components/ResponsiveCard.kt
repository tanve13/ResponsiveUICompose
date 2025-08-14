package com.tanveer.responsiveuicompose.ui.theme.Components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MonotonicFrameClock
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp

@Composable
fun ResponsiveCard(content: @Composable () -> Unit ) {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp
    val cardModifier = when {
        screenWidth < 600 -> Modifier.fillMaxWidth()    //phone
        screenWidth < 840 -> Modifier.width(500.dp)     //small and medium tablets
        else -> Modifier.width(700.dp)
    }
    Card(
        modifier = Modifier.padding(16.dp),
        shape = MaterialTheme.shapes.medium
    ) {
        Box(modifier = Modifier.padding(24.dp)) {
            content()
        }
    }
}
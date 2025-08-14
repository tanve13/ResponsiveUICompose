package com.tanveer.responsiveuicompose.ui.theme.Components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.sp

@Composable
fun ResponsiveText(text:String){
    val screenWidth = LocalConfiguration.current.screenWidthDp
    val fontSize = when{
        screenWidth<600 -> 16.sp
        screenWidth<840 -> 20.sp
        else ->24.sp
    }
    Text(text = text,fontSize = fontSize,color = MaterialTheme.colorScheme.onBackground)
}
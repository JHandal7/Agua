package com.example.agua

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WellnessScreen (){
  //  WaterCounter1(modifier)
    Column {
        StatefulCounter()
        WellnessTasksList()
    }



}

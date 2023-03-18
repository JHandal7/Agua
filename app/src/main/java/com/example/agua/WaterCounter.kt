package com.example.agua
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun  WaterCounter(modifier: Modifier=Modifier) {
    Column(modifier = modifier.padding(16.dp) ){
        

    //var count=0
  //  val count: MutableState<Int> =remember{ mutableStateOf(0)}
    var count by rememberSaveable { mutableStateOf(0)}
        if(count>0) {
            // This text is present if the button has been clicked
            // at least once; absent otherwise
            Text("You have has $count glasses")
           // modifier=modifier.padding(16.dp)

        }
    Button(onClick = { count++ },Modifier.padding(top = 8.dp),enabled = count < 10) {
        Text("Agregale uno mas")
    }

}   }

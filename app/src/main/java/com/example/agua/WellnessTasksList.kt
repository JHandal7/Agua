package com.example.agua

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }

@Composable
fun WellnessTasksList(modifier: Modifier = Modifier,
                                list: List<WellnessTask> = remember { getWellnessTasks() })

{

    LazyColumn(
        modifier = modifier
    ) {
        items(list) { task ->
            WellnessTaskItem(taskName = task.label)
        }
    }

}


//@Composable
//fun WellnessTaskItem(taskName: String, modifier: Modifier = Modifier) {
//    var checkedState by remember { mutableStateOf(false) }
//    WellnessTaskItem(
//        taskName = taskName,
//        checked = checkedState,
//        onCheckedChange = { newValue -> checkedState = newValue },
//        onClose = {}, // we will implement this later!
//        modifier = modifier,
//    )

//data class WellnessTask(val id: Int, val label: String)


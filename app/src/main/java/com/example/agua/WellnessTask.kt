package com.example.agua



data class WellnessTask(val id: Int, val label: String)

 private  fun getWellnessTasks()= List(30){i->WellnessTask(i,"Task #$i")}
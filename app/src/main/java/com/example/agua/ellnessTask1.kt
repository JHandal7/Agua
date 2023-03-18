package com.example.agua


data class WellnessTask1(val id: Int, val label: String,var checked:Boolean=false)

private  fun getWellnessTasks()= List(30){i->WellnessTask(i,"Task #$i")}
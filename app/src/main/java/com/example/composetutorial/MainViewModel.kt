package com.example.composetutorial

import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val tempSensor: MeasurableSensor,
): ViewModel() {

    var isHot by mutableStateOf(false)

    init {
        tempSensor.startListening()
        tempSensor.setOnSensorValuesChangedListener { values ->
            val temp = values[0]
            isHot = temp > 45f
        }
    }
}
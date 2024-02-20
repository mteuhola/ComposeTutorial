package com.example.composetutorial

import android.content.Context
import android.content.pm.PackageManager
import android.hardware.Sensor

class TempSensor(
    context: Context
): AndroidSensor(
    context = context,
    sensorFeature = PackageManager.FEATURE_SENSOR_AMBIENT_TEMPERATURE,
    sensorType = Sensor.TYPE_AMBIENT_TEMPERATURE
)
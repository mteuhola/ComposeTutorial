package com.example.composetutorial

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import androidx.annotation.RequiresApi
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class SensorApp : Application() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate() {
        super.onCreate()
        initializeNotificationChannel()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun initializeNotificationChannel() {
        val notificationChannel = NotificationChannel(
            "temp_notification",
            "Temperature Notifications",
            NotificationManager.IMPORTANCE_HIGH
        )

        notificationChannel.description = "Temp Notification System"

        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(notificationChannel)
    }
}
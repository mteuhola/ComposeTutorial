package com.example.composetutorial

import android.net.Uri
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class UserInfo(
    @PrimaryKey val id: Int,
    @ColumnInfo (name = "username") val userName: String?,
    @ColumnInfo (name = "profile_picture") val profilePicture: Uri?
)

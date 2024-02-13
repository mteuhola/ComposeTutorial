package com.example.composetutorial

import androidx.room.Query
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert

@Dao
interface UserInfoDao {
    @Query("SELECT * FROM user_table")
    fun getAll(): List<UserInfo>

    @Query("SELECT * FROM user_table WHERE id IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<UserInfo>

    @Query("SELECT * FROM user_table WHERE username LIKE :first LIMIT 1")
    fun findByName(first: String, last: String): UserInfo

    @Insert
    fun insertAll(vararg users: UserInfo)

    @Delete
    fun delete(user: UserInfo)
}
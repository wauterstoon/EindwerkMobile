package com.example.eindwerkmobile.local

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.*

@Dao
interface TrashCollectorDataAcessObject {

    @Transaction
    @Query("select * from parkings")
    fun getAllTrashCollector():LiveData<List<TrashCollectorAndFields>>

    @Transaction
    @Query("select *  from TrashCollector where recordid=:id")
    fun  getTrashCollector(id: String)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(list:List<TrashCollectorEntity>)



}
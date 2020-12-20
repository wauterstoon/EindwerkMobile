package com.example.eindwerkmobile.local

import androidx.room.Insert
import androidx.room.OnConflictStrategy


interface TrashCollectorFieldsDataAcessObject {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(list: List<TrashCollectorFieldsEntity>)


}
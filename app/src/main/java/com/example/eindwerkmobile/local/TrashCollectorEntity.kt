package com.example.eindwerkmobile.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TrashCollector")
 class TrashCollectorEntity (
    @PrimaryKey
    val recordid:String

)
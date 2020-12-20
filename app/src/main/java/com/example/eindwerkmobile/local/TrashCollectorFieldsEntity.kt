package com.example.eindwerkmobile.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey


@Entity(tableName = "TrashCollector",foreignKeys = arrayOf(ForeignKey(entity = TrashCollectorEntity::class,parentColumns = arrayOf("recordid"),
    childColumns = arrayOf("TrashCollectorid"),onDelete = ForeignKey.CASCADE)))
class TrashCollectorFieldsEntity (
val name:String,
    val address:String,
    val contactinfo:String,
    val open:String,
    val avilablecapacity:Int,
    val totalcapacity:Int,
@ColumnInfo(name="TrashCollector",index = true)
var TrashCollectorid:String?

)
{
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0

}
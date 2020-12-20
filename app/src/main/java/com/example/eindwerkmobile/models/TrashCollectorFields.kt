package com.example.eindwerkmobile.models

import android.os.Parcelable
import com.example.eindwerkmobile.local.TrashCollectorFieldsEntity
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TrashCollectorFields(
    val name:String,
    val address:String,
    val contactinfo:String,
    val open:String,
    val avilablecapacity:Int,
    val totalcapacity:Int
):Parcelable{
    fun toDatabaseModel(TrashCollectorId:String):TrashCollectorFieldsEntity{
        return TrashCollectorFieldsEntity(name,address,contactinfo,open,avilablecapacity,totalcapacity,TrashCollectorId)
    }
}
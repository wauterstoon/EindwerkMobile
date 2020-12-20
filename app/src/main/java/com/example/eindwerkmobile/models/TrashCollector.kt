package com.example.eindwerkmobile.models

import android.os.Parcelable
import com.example.eindwerkmobile.local.TrashCollectorEntity
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TrashCollector(
    val recordid:String,
    val fields:TrashCollectorFields
):Parcelable {
    fun toDatabaseModel():TrashCollectorEntity{

        return TrashCollectorEntity(recordid)
    }
}
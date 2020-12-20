package com.example.eindwerkmobile.local

import androidx.room.Embedded
import androidx.room.Relation

class TrashCollectorAndFields (
@Embedded
val trashcollector : TrashCollectorEntity,

@Relation(parentColumn = "TrashCollectorid", entityColumn = "TrashCollectorId")
val fields: TrashCollectorEntity
)
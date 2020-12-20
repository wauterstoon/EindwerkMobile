package com.example.eindwerkmobile.local

import com.example.eindwerkmobile.models.TrashCollector

class TrashCollectorLocalDataSource(private val trashCollectorDao:TrashCollectorDataAcessObject, private val trashCollectorFieldsDao: TrashCollectorFieldsDataAcessObject) {


    fun getTrashCollector() = trashCollectorDao.getAllTrashCollector()

    fun getTrashCollector(id:String) = trashCollectorDao.getTrashCollector(id)

    fun saveTrashCollector(list: List<TrashCollector>){

        val TrashCollectorList = ArrayList<TrashCollectorEntity>()
        list.forEach{ TrashCollector -> TrashCollectorList.add(TrashCollector.toDatabaseModel())}
        trashCollectorDao.insertAll(TrashCollectorList)


        val fieldList = ArrayList<TrashCollectorFieldsEntity>()
        list.forEach{TrashCollector -> fieldList.add(TrashCollector.fields.toDatabaseModel(TrashCollector.recordid))}
        trashCollectorFieldsDao.insertAll(fieldList)

    }



}
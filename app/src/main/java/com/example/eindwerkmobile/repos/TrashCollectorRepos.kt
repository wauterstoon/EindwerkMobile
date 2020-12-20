package com.example.eindwerkmobile.repos

import com.example.eindwerkmobile.local.TrashCollectorLocalDataSource
import com.example.eindwerkmobile.local.TrashCollectorRemoteDataSource

class TrashCollectorRepos(private val trashCollectorLocalDataSource: TrashCollectorLocalDataSource, private val trashCollectorRemoteDataSource: TrashCollectorRemoteDataSource) {

    fun getTrashCollector(id:String) = trashCollectorLocalDataSource.getTrashCollector(id)

    fun getTrashCollector() = perforGetOperation(
        databaseQuery = {trashCollectorLocalDataSource.getTrashCollector()}
    networkCall = { trashCollectorRemoteDataSource.getTrashCollector()}
    saveCallResult = {trashCollectorLocalDataSource.saveTrashCollector(it.record)}
    )
}
package com.example.eindwerkmobile.local

import android.util.Base64DataException
import com.example.eindwerkmobile.remote.GhentApiService

import com.example.eindwerkmobile.remote.BaseDataResource

class TrashCollectorRemoteDataSource(private val apiService: GhentApiService):BaseDataResource {

    suspend fun getTrashCollector() = getResult{apiService.getTrashCollector()}


}
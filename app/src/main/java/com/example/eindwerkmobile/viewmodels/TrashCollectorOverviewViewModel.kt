package com.example.eindwerkmobile.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.eindwerkmobile.models.TrashCollector
import com.example.eindwerkmobile.remote.GhentApiService
import kotlinx.coroutines.launch
import java.lang.Exception

class TrashCollectorOverviewViewModel(private val apiService: GhentApiService):ViewModel() {
    private var _TrashCollector = MutableLiveData<List<TrashCollector>>()
    val TrashCollector : LiveData<List<TrashCollector>>
    get()=_TrashCollector

    init {
        getTrashCollector()
    }
    private fun getTrashCollector(){
viewModelScope.launch {
    try {
        val response = apiService.getTrashCollector()
        _TrashCollector.value = response.records
    }catch (e: Exception){
        Log.e("Error api", e.message,e)
    }
}
    }
}


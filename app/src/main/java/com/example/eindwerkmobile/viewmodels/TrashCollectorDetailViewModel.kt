package com.example.eindwerkmobile.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.eindwerkmobile.models.TrashCollector

class TrashCollectorDetailViewModel:ViewModel() {

    private var _TrashCollector = MutableLiveData<TrashCollector>()
    val trashCollector : LiveData<TrashCollector>
        get()=_TrashCollector
    fun updateTrashCollector(trashCollector: TrashCollector){
        _TrashCollector.value = trashCollector
    }

}
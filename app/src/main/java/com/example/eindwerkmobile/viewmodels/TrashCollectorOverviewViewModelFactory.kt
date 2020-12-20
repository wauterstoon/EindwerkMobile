package com.example.eindwerkmobile.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.eindwerkmobile.remote.GhentApiService
import java.lang.IllegalArgumentException

class TrashCollectorOverviewViewModelFactory(private val apiService: GhentApiService):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
   if (modelClass.isAssignableFrom(TrashCollectorOverviewViewModel::class.java)){
       return TrashCollectorOverviewViewModel(
           apiService
       ) as T
   }
        throw IllegalArgumentException("unknown Viewmodel class")
    }
}
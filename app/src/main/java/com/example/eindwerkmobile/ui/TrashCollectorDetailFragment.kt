package com.example.eindwerkmobile.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.example.eindwerkmobile.ParkingDetailFragmentArgs
import com.example.eindwerkmobile.databinding.FragmentParkingDetailBinding
import com.example.eindwerkmobile.viewmodels.TrashCollectorDetailViewModel

class TrashCollectorDetailFragment:Fragment() {

    val arguments: ParkingDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            val binding = FragmentParkingDetailBinding.inflate(inflater,container,false )
        val viewModel = ViewModelProvider(this).get(TrashCollectorDetailViewModel::class.java)
viewModel.trashCollector.observe(viewLifecycleOwner,Observer{binding.parking = it })
        viewModel.updateTrashCollector(arguments.trashCollector)

        return binding.root
    }
}
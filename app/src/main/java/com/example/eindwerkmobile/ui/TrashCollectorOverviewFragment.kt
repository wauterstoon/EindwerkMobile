package com.example.eindwerkmobile.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.eindwerkmobile.ParkingOverviewFragmentDirections
import com.example.eindwerkmobile.adapters.TrashCollectorClickListener
import com.example.eindwerkmobile.databinding.FragmentParkingOverviewBinding
import com.example.eindwerkmobile.remote.GhentApi
import com.example.eindwerkmobile.viewmodels.TrashCollectorOverviewViewModel
import com.example.eindwerkmobile.viewmodels.TrashCollectorOverviewViewModelFactory

class TrashCollectorOverviewFragment: Fragment(),TrashCollectorClickListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentParkingOverviewBinding.inflate(inflater,container,false)
        val factory =
            TrashCollectorOverviewViewModelFactory(
                GhentApi.apiService
            )
        val viewModel= ViewModelProvider(this,factory).get(TrashCollectorOverviewViewModel::class.java)

        binding.lifecycleOwner = viewLifecycleOwner

        val adapter = com.example.eindwerkmobile.adapters.TrashCollector(this)
        binding.adapter = adapter

        viewModel.TrashCollector.observe(viewLifecycleOwner, Observer { adapter.submitList(it) })

        return binding.root
    }

    override fun onTrashCollectorClicked(trashCollector: com.example.eindwerkmobile.models.TrashCollector) {
        val directions =
            TrashCollectorOverviewFragmentDirections.actionTrashCollectorOverviewFragmentToTrashCollectorDetailFragment(
                trashCollector
            )
        findNavController().navigate(directions)
    }

}
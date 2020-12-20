package com.example.eindwerkmobile.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.eindwerkmobile.databinding.ListItemParkingBinding
import com.example.eindwerkmobile.models.TrashCollector


class TrashCollector(private var trashCollectorClickListener: TrashCollectorClickListener): ListAdapter<TrashCollector, ParkingViewHolder>(ParkingDiffCallBack()){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParkingViewHolder {
        return ParkingViewHolder(ListItemParkingBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ParkingViewHolder, position: Int) {
        val parking = getItem(position)
        holder.bindData(parking)
        holder.itemView.setOnClickListener { trashCollectorClickListener.onParkingClicked(parking) }
    }

}
private class ParkingDiffCallBack: DiffUtil.ItemCallback<TrashCollector>(){
    override fun areItemsTheSame(oldItem: TrashCollector, newItem: TrashCollector): Boolean {
        return oldItem.recordid == newItem.recordid
    }

    override fun areContentsTheSame(oldItem: TrashCollector, newItem: TrashCollector): Boolean {
        return oldItem == newItem
    }

}

class ParkingViewHolder(val binding: ListItemParkingBinding):RecyclerView.ViewHolder(binding.root){
fun bindData(trashCollector: TrashCollector){
    binding.parking = trashCollector
}
}

interface TrashCollectorClickListener{
    fun onParkingClicked(trashCollector: TrashCollector)
}
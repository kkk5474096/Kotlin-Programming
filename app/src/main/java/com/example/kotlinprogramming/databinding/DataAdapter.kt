package com.example.kotlinprogramming.databinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DataAdapter(): RecyclerView.Adapter<DataAdapter.DataViewHolder>() {

    var data = mutableListOf<ProfileInfo>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): DataViewHolder {
        val binding = RcvListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DataViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.onBind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun setItems(newItems: List<ProfileInfo>) {
        data.clear()
        data.addAll(newItems)
        notifyDataSetChanged()
    }

    class DataViewHolder(
        private val binding: RcvListItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: ProfileInfo) {
            binding.activity = data
        }
    }
}
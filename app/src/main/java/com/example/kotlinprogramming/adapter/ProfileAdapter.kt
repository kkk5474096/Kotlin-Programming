package com.example.kotlinprogramming.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinprogramming.data.ProfileData
import com.example.kotlinprogramming.databinding.ItemRcvListBinding

class ProfileAdapter(): RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>() {

    var data = listOf<ProfileData>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): ProfileViewHolder {
        val binding = ItemRcvListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProfileViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        holder.onBind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class ProfileViewHolder(
        private val binding: ItemRcvListBinding
    ): RecyclerView.ViewHolder(binding.root) {
        fun onBind(data : ProfileData) {
            binding.user = data
        }
    }
}
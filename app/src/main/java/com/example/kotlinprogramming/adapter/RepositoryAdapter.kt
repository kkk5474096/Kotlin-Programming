package com.example.kotlinprogramming.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinprogramming.data.GithubRepo
import com.example.kotlinprogramming.databinding.ItemMainListBinding

class RepositoryAdapter: ListAdapter<GithubRepo, RepositoryAdapter.RepositoryViewHolder>(
    RepoDiffUtil
) {
    class RepositoryViewHolder(private val binding: ItemMainListBinding):
            RecyclerView.ViewHolder(binding.root) {
                fun onBind(githubRepo: GithubRepo) {
                    binding.githubRepo = githubRepo
                }
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoryViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding= ItemMainListBinding.inflate(layoutInflater, parent, false)
        return RepositoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RepositoryViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }


    object RepoDiffUtil: DiffUtil.ItemCallback<GithubRepo>() {
        override fun areItemsTheSame(oldItem: GithubRepo, newItem: GithubRepo): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }

        override fun areContentsTheSame(oldItem: GithubRepo, newItem: GithubRepo): Boolean {
            return oldItem == newItem
        }
    }
}
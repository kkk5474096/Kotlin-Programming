package com.example.kotlinprogramming.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinprogramming.data.GithubRepo
import com.example.kotlinprogramming.data.RepositoryDataSource
import com.example.kotlinprogramming.data.LocalRepositoryDataSource
import com.example.kotlinprogramming.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var githubDataSource: RepositoryDataSource
    private val repoListAdapter by lazy { RepositoryAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView(){
        binding.rvMainList.adapter = repoListAdapter
        binding.rvMainList.addItemDecoration(VerticalItemDecoration(20))
        repoListAdapter.submitList(fetchData())
    }

    private fun fetchData(): List<GithubRepo>{
        githubDataSource = LocalRepositoryDataSource()
        return githubDataSource.fetchRepoData()
    }
}
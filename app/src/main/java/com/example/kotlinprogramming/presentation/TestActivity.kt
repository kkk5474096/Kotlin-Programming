package com.example.kotlinprogramming.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinprogramming.R
import com.example.kotlinprogramming.adapter.ProfileAdapter
import com.example.kotlinprogramming.data.LocalRepositoryDataSource
import com.example.kotlinprogramming.data.ProfileData
import com.example.kotlinprogramming.data.RepositoryDataSource
import com.example.kotlinprogramming.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTestBinding
    private lateinit var profileData: RepositoryDataSource
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_test)
        binding.activity = this@TestActivity

        setRcv()
    }

    fun btnClick(view: View) {
        Toast.makeText(this, "Button Click", Toast.LENGTH_SHORT).show()
    }

    private fun setRcv(){
        val profileAdapter = ProfileAdapter()
        binding.mainRcv.layoutManager= LinearLayoutManager(this)
        binding.mainRcv.adapter = profileAdapter
        profileAdapter.data = fetchProfileData()
        profileAdapter.notifyDataSetChanged()
    }

    private fun fetchProfileData(): List<ProfileData> {
        profileData = LocalRepositoryDataSource()
        return profileData.fetchProfileData()
    }
}
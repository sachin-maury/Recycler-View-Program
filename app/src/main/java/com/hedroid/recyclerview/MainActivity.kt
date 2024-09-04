package com.hedroid.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.hedroid.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var rvAdapter: RvAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        rvAdapter = RvAdapter(Constant.getData(), this)
      //  binding.rv.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false) for Horizantal using
        binding.rv.layoutManager = LinearLayoutManager(this)
        binding.rv.adapter = rvAdapter
    }
}

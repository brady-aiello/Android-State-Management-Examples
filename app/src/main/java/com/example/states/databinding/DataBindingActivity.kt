package com.example.states.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.states.R

class DataBindingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityDatabindingBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_databinding)
        val model = ViewModelProviders.of(this) [DataBindingActivityViewModel::class.java]
        binding.viewmodel = model
        binding.lifecycleOwner = this
    }
}
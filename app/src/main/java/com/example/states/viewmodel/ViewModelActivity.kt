package com.example.states.viewmodel

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.states.R

class ViewModelActivity : AppCompatActivity() {
    lateinit var counterButton: Button
    lateinit var counterTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saved_instance)
        counterButton = findViewById<Button>(R.id.counter_button)
        counterTextView = findViewById(R.id.counter_textview)
        val viewModel = ViewModelProviders.of(this)[ClickCounterViewModel::class.java]

        viewModel.countLiveData.observe(this, Observer<Int> { count -> counterTextView.text = count.toString() })
        counterButton.setOnClickListener {
            viewModel.countLiveData.postValue(1 + (viewModel.countLiveData.value ?: 0))
        }
    }
}
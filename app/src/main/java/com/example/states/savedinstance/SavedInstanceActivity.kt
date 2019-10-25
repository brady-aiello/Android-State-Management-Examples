package com.example.states.savedinstance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.states.R

class SavedInstanceActivity : AppCompatActivity() {

    lateinit var counterButton: Button
    lateinit var counterTextView: TextView
    var count = 0

    private val countStateKey = "COUNT"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saved_instance)
        counterButton = findViewById(R.id.counter_button)
        counterTextView = findViewById(R.id.counter_textview)
        counterTextView.text = count.toString()
        counterButton.setOnClickListener {
            count++
            counterTextView.text = count.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(countStateKey, count)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        count = savedInstanceState?.getInt(countStateKey) ?: 0
        counterTextView.text = count.toString()
    }
}
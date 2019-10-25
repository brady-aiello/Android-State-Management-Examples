package com.example.states

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.states.databinding.DataBindingActivity
import com.example.states.savedinstance.SavedInstanceActivity
import com.example.states.viewmodel.ViewModelActivity

class MainActivity : AppCompatActivity() {

    lateinit var savedInstanceStateButton : Button
    lateinit var viewModelButton : Button
    lateinit var dataBindingButton: Button
    lateinit var jetpackComposeButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        savedInstanceStateButton = findViewById(R.id.onsaveinstancestate_activity_button)

        val savedInstanceActivityIntent = Intent(this, SavedInstanceActivity::class.java)
        val viewModelActivityIntent = Intent(this, ViewModelActivity::class.java)
        val dataBindingActivityIntent = Intent(this, DataBindingActivity::class.java)
        //val composeActivityIntent = Intent(this, ComposeActivity::class.java)


        savedInstanceStateButton.setOnClickListener { startActivity(savedInstanceActivityIntent) }
        viewModelButton = findViewById(R.id.viewmodel_activity_button)
        viewModelButton.setOnClickListener { startActivity( viewModelActivityIntent) }
        dataBindingButton = findViewById(R.id.databinding_activity_button)
        dataBindingButton.setOnClickListener { startActivity(dataBindingActivityIntent) }
        /*jetpackComposeButton = findViewById(R.id.jetpack_compose_activity_button)
        jetpackComposeButton.setOnClickListener { startActivity(composeActivityIntent) }*/
    }
}
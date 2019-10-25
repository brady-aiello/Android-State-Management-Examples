package com.example.states.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ClickCounterViewModel: ViewModel() {
    val countLiveData: MutableLiveData<Int> = MutableLiveData()
}
package com.example.states.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataBindingActivityViewModel: ViewModel() {
    val countLiveData = MutableLiveData<Int>()

    fun onLike() {
        countLiveData.postValue( (countLiveData.value ?: 0) + 1)
    }
}
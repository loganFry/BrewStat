package com.brewstat.ui.my_coffees

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyCoffeesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is my coffees Fragment"
    }
    val text: LiveData<String> = _text
}
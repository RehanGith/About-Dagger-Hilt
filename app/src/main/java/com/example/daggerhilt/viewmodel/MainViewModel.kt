package com.example.daggerhilt.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val myText : String

) : ViewModel() {
    val _name = MutableLiveData<String> ("")

    init {
        _name.value = myText
    }
}
package com.example.daggerhilt.viewmodel

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.daggerhilt.model.Engine
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject

class AssistateViewModel @AssistedInject constructor(
    private val engine: Engine,
    @Assisted val userId : String
) : ViewModel() {
    private var _user_id= MutableLiveData<String>()
    val user_id get() = _user_id

    init {
        _user_id.value = userId
    }
    @AssistedFactory
    interface AssistateViewModelFactory{
        fun create(userId : String) : AssistateViewModel
    }
}
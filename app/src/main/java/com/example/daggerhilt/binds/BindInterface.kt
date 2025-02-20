package com.example.daggerhilt.binds

import javax.inject.Inject

interface BindInterface {
    fun hello() : String
}

class BindInterfaceImpl @Inject constructor(): BindInterface {
    override fun hello(): String {
        return "Hello From BindsInterface"
    }

}
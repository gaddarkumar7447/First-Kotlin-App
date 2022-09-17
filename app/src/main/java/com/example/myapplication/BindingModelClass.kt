package com.example.myapplication

import androidx.lifecycle.ViewModel

class BindingModelClass : ViewModel() {
    var count = 0

    fun getCurrentCount(): Int {
        return count
    }

    fun updateCount(): Int {
        return count++
    }

}
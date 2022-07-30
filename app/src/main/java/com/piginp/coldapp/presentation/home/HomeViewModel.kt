package com.piginp.coldapp.presentation.home

import android.util.Log
import androidx.lifecycle.ViewModel

class HomeViewModel: ViewModel() {

    init {
        Log.e("***", "HomeVM created")
    }

    override fun onCleared() {
        super.onCleared()
        Log.e("***", "HomeVM cleared")
    }
}
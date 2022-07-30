package com.piginp.coldapp.presentation.details

import android.util.Log
import androidx.lifecycle.ViewModel

class DetailsViewModel: ViewModel() {

    init {
        Log.e("***", "DetailsVM created")
    }

    override fun onCleared() {
        super.onCleared()
        Log.e("***", "DetailsVM cleared")
    }
}
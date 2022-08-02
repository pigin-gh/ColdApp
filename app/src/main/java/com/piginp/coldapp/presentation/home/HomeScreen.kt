package com.piginp.coldapp.presentation.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.piginp.coldapp.R
import com.piginp.coldapp.domain.usecase.*

class HomeScreen : AppCompatActivity() {

    // TEST

    private val getDayEntryStatusUseCase = GetDayEntryStatusUseCase()
    private val getCurrentDayUseCase = GetCurrentDayUseCase()
    private val getListOfDaysEntriesUseCase = GetCurrentDayUseCase()
    private val addEntryToCurrentDayUseCase = AddEntryToCurrentDayUseCase()
    private val clearAllEntriesUseCase = ClearAllEntriesUseCase()
    private val showEntryDetailsUseCase = ShowEntryDetailsUseCase()

//    private lateinit var viewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

//        viewModel = ViewModelProvider(this, HomeViewModelFactory(this)).get(HomeViewModel::class.java)
    }
}
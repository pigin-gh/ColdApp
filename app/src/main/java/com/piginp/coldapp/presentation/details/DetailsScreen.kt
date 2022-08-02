package com.piginp.coldapp.presentation.details

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.piginp.coldapp.R
import com.piginp.coldapp.domain.usecase.AddSymptomUseCase
import com.piginp.coldapp.domain.usecase.DeleteSymptomUseCase
import com.piginp.coldapp.domain.usecase.GetListOfSymptomsUseCase
import com.piginp.coldapp.presentation.home.HomeViewModel
import com.piginp.coldapp.presentation.home.HomeViewModelFactory

class DetailsScreen : AppCompatActivity() {

    private val deleteSymptomUseCase = DeleteSymptomUseCase()
    private val getListOfSymptomsUseCase = GetListOfSymptomsUseCase()
    private val addSymptomUseCase = AddSymptomUseCase()

//    private lateinit var viewModel: DetailsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_screen)

//        viewModel = ViewModelProvider(this, DetailsViewModelFactory(this)).get(DetailsViewModel::class.java)
    }
}
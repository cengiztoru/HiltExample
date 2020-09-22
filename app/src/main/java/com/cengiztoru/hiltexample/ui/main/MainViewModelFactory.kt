package com.cengiztoru.hiltexample.ui.main


/**
 * Created by Cengiz TORU on 22/09/2020.
 * cengiz.toru@tsoft.com.tr
 */

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainViewModelFactory(
    private val repository: MainRepository,
) :
    ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(
            repository,
        ) as T
    }
}
package com.cengiztoru.hiltexample.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel


/**
 * Created by Cengiz TORU on 22/09/2020.
 * cengiz.toru@tsoft.com.tr
 */
class MainViewModel(private val repository: MainRepository) : ViewModel() {
    fun getUsers(): LiveData<List<User>> {
        return repository.getUsers()
    }

}
package com.cengiztoru.hiltexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel


/**
 * Created by Cengiz TORU on 22/09/2020.
 * cengiz.toru@tsoft.com.tr
 */
class MainViewModel : ViewModel() {
    fun getUsers(): LiveData<List<User>> {
        val repository = MainRepository()
        return repository.getUsers()
    }

}
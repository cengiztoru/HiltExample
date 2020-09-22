package com.cengiztoru.hiltexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData


/**
 * Created by Cengiz TORU on 22/09/2020.
 * cengiz.toru@tsoft.com.tr
 */
class MainRepository {
    fun getUsers(): LiveData<List<User>> {
        val users = ArrayList<User>()
        users.add(User(1, "Cengiz", "TORU", 22))
        users.add(User(2, "Cengiz", "TORU", 22))
        users.add(User(3, "Cengiz", "TORU", 22))
        users.add(User(4, "Cengiz", "TORU", 22))
        users.add(User(5, "Cengiz", "TORU", 22))
        users.add(User(6, "Cengiz", "TORU", 22))
        users.add(User(7, "Cengiz", "TORU", 22))
        users.add(User(8, "Cengiz", "TORU", 22))
        users.add(User(9, "Cengiz", "TORU", 22))
        users.add(User(10, "Cengiz", "TORU", 22))

        val liveData = MutableLiveData<List<User>>()
        liveData.postValue(users)
        return liveData
    }
}
package com.cengiztoru.hiltexample.ui.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.cengiztoru.hiltexample.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint                              //todo dont forget this 😊
class MainActivity : AppCompatActivity() {

//    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //By manual constructor injection all dependencies are gathered together
//        val repository = MainRepository()
//        val factory = MainViewModelFactory(repository)
//        viewModel = ViewModelProvider(this, factory).get(MainViewModel::class.java)
//

        //OF COURSE NOW WE CAN DELETE MAIN VIEW MODEL FACTORY

        val viewModel: MainViewModel by viewModels()
        viewModel.getUsers().observe(this, {
            tvMain.text = it.toString()
        })

    }
}
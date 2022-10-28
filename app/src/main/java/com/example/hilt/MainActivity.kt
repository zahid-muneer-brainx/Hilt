package com.example.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    @FirebaseAnnotation
    lateinit var userRepository: UserRepository
    @Inject
    lateinit var userRepository1: UserRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userRepository.oncreate("Zahid","12345678")
        userRepository1.oncreate("Zahid","12345678")

    }
}
package com.example.images

import android.os.Bundle
import android.os.StrictMode
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.images.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object {
        private const val ALLOW_NETWORK_ON_MAIN_TREAD = true
    }

    private val viewModel by viewModels<DataViewModel>()


    init {
        if (ALLOW_NETWORK_ON_MAIN_TREAD) {
            val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
            StrictMode.setThreadPolicy(policy)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.inflate<ActivityMainBinding>(layoutInflater, R.layout.activity_main, null, false)
        setContentView(binding.root)
    }
}
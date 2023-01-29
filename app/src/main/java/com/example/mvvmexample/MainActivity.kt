package com.example.mvvmexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mvvmexample.databinding.ActivityMainBinding
import kotlinx.coroutines.NonCancellable.start

class MainActivity : AppCompatActivity() {

    var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        init()
    }

    fun init(){
        binding?.button?.setOnClickListener {
            val movie =  Moovie(
                "La la land",
                "https://www.paslanmazkalem.com/wp-content/uploads/2017/02/la-la-land-paslanmaz-kalem-735x375@2x.jpg",
                5,
                false
            )

            val intent = Intent(applicationContext, MovieDetail::class.java)
            intent.putExtra("MOVIE", movie)
            startActivity(intent)
        }
    }
}
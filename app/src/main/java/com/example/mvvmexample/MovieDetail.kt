package com.example.mvvmexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import com.example.mvvmexample.databinding.ActivityMainBinding
import com.example.mvvmexample.databinding.ActivityMovieDetailBinding

class MovieDetail : AppCompatActivity() {

    private val vm by viewModels<MovieViewModel>()
    private var binding: ActivityMovieDetailBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        var movie: Moovie? = null
        movie = intent.extras?.getSerializable("MOVIE") as Moovie?


        binding = DataBindingUtil.setContentView(this, R.layout.activity_movie_detail)
        binding!!.viewmodel = vm
        binding!!.lifecycleOwner = this

        //Log.i("isim", movie!!.name)
        vm.setName(movie!!.name)
        vm.setLike(movie!!.like)


    }
}
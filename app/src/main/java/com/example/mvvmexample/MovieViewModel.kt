package com.example.mvvmexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MovieViewModel: ViewModel(){

    private var _name = MutableLiveData<String>()
    val name: LiveData<String> get() = _name

    private var _image = MutableLiveData<Boolean>()
    val image: LiveData<Boolean> get() = _image

    fun setName(name:String){
        _name.value = name
    }

    fun setLike(like: Int){
        if(like in 1..4){
            _image.value = false
        }
        if(like>=5){
            _image.value = true
        }
    }



}

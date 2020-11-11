package io.keiji.sample.hakusan_mapapp.ui.information

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InformationViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Information Fragment"
    }
    val text: LiveData<String> = _text
}
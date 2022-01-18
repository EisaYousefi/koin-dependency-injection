package ir.eisa.koincource.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ir.eisa.koincource.data.model.User
import ir.eisa.koincource.data.repository.MainRepository
import ir.eisa.koincource.demo.`interface`.Demo
import kotlinx.coroutines.launch

class MainViewModel(
    private val demo: Demo,
    private val mainRepository: MainRepository
) : ViewModel() {

    fun getDemo() = demo.getDemo()
    fun getPost()=mainRepository.getPost()

    fun insert(user: User)=viewModelScope.launch {
        mainRepository.insert(user)
    }

    val getAllUser = mainRepository.getAllUser
}
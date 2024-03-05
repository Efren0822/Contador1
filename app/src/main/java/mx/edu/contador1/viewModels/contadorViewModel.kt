package mx.edu.contador1.viewModels

import androidx.compose.runtime.State
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf

class ContadorViewModel : ViewModel(){
    private val _contador = mutableStateOf(0)
    val contador : State<Int> = _contador

    fun Add(){
        _contador.value = _contador.value + 1
    }


}
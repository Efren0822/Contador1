package mx.edu.contador1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import mx.edu.contador1.Views.Contador
import mx.edu.contador1.Views.LoteriaView
import mx.edu.contador1.ui.theme.Contador1Theme
import mx.edu.contador1.viewModels.ContadorViewModel
import mx.edu.contador1.viewModels.LoteriaViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val viewModel: ContadorViewModel by viewModels()
        val ViewModel: LoteriaViewModel by viewModels()
        setContent {
            Contador1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    //Contador(viewModel = viewModel)
                    LoteriaView(viewModel = ViewModel)
                }
            }
        }
    }
}


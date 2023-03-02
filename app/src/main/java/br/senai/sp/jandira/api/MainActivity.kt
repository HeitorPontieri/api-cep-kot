package br.senai.sp.jandira.api

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import retrofit2.Callback
import br.senai.sp.jandira.api.model.CEP
import br.senai.sp.jandira.api.service.BuscarCep
//import br.senai.sp.jandira.api.service.BuscarCep
import br.senai.sp.jandira.api.service.RetrofitFactory
import br.senai.sp.jandira.api.ui.theme.ApiTheme
import retrofit2.Call
import retrofit2.Response

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ApiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {

    var cepState by remember {
        mutableStateOf("")
    }
    var resultState by remember {
        mutableStateOf("")
    }


    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {

        OutlinedTextField(value = cepState,
            onValueChange = {
                cepState = it
            },
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Digite o CEP")
            })

        Button(onClick = {

            resultState = BuscarCep(cepState){
                resultState = it
            }.toString()

        }) {

            Text(text = "Buscar")
        }
        Text(text = "Resultados encontrados no sistema com este CEP")
        Text(text = resultState)


    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    ApiTheme {
        Greeting("Android")
    }
}
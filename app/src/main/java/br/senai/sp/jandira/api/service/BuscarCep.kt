package br.senai.sp.jandira.api.service

import android.util.Log
import br.senai.sp.jandira.api.model.CEP
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

//class BuscarCep(cep:String, onComplete :(String) -> Unit) {
//
//    var logradouro = ""
//
//    val call = RetrofitFactory().retrofitService().getCEP(cep)
//
//
//    call.enqueue(object : Callback<CEP> {
//
//        override fun onResponse(call: Call<CEP>, response: Response<CEP>) {
//            logradouro = response.body()!!.logradouro ?: "Cep não encontrado"
//            onComplete.invoke(logradouro)
//
//        }
//
//        override fun onFailure(call: Call<CEP>, t: Throwable) {
//
//        }
//
//
//
//}
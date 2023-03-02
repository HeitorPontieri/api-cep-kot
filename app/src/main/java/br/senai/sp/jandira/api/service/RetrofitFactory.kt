package br.senai.sp.jandira.api.service

import br.senai.sp.jandira.api.model.CEP
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitFactory {
    val URL = "https://viacep.com.br/ws/"

    val retrofitFactory = Retrofit.Builder()
                                .baseUrl(URL)
                                .addConverterFactory(GsonConverterFactory.create())
                                .build()

    fun retrofitService():CepRetrofitService{
        return retrofitFactory.create(CepRetrofitService::class.java)
    }

}
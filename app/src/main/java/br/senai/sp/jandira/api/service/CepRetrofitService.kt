package br.senai.sp.jandira.api.service


import br.senai.sp.jandira.api.model.CEP
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CepRetrofitService {

    // https://viacep.com.br/ws/06636190/json/
    @GET("{cep}/json/")
    fun getCEP(@Path("cep") cep: String): Call<CEP>

    // https://viacep.com.br/ws/SP/Jandira/Altino/json/
    @GET("{uf}/{cidade}/{logradouro}/json/")
    fun getCeps(
        @Path("uf") uf: String,
        @Path("cidade") cidade: String,
        @Path("logradouro") logradouro: String): Call<List<CEP>>


    @GET("cidade?name={nome_cidade}&estado={estado}")
    fun getTeste(
        @Query("nome_cidade")  nomeCidade : String,
        @Query("estado") estado:String){

    }


}

package br.senai.sp.jandira.api.model

import com.google.gson.annotations.SerializedName

data class CEP (
     var cep : String,
     var logradouro : String,
     var complemento : String,
     @SerializedName("localidade") var cidade : String,
     @SerializedName("uf") var estado : String){


}
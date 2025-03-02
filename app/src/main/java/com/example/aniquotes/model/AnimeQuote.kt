package com.example.aniquotes.model

import com.google.gson.annotations.SerializedName


data class AnimeQuote (
    @SerializedName("status" ) var status : String? = null,
    @SerializedName("data"   ) var data   : Data?   = Data()
)

package com.example.aniquotes.model

import com.google.gson.annotations.SerializedName


data class AnimeQuoteList (
    @SerializedName("status" ) var status : String? = null,
    @SerializedName("data"   ) var data   : ArrayList<Data>   = arrayListOf()
)

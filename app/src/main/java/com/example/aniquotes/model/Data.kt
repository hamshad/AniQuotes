package com.example.aniquotes.model

import com.google.gson.annotations.SerializedName


data class Data (
    @SerializedName("content"   ) var content   : String?    = null,
    @SerializedName("anime"     ) var anime     : Anime?     = Anime(),
    @SerializedName("character" ) var character : Character? = Character()
)

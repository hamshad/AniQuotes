package com.example.aniquotes.model

import com.google.gson.annotations.SerializedName


data class Character (
    @SerializedName("id"   ) var id   : Int?    = null,
    @SerializedName("name" ) var name : String? = null
)

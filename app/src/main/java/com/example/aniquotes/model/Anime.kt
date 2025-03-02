package com.example.aniquotes.model

import com.google.gson.annotations.SerializedName


data class Anime (
    @SerializedName("id"      ) var id      : Int?    = null,
    @SerializedName("name"    ) var name    : String? = null,
    @SerializedName("altName" ) var altName : String? = null
)

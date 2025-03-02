package com.example.aniquotes.retrofit

interface Service {
    @GET('/api/v1/quotes')
    suspend fun getQuotes(): Response<AnimeQuote>
}
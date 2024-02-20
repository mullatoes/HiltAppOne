package com.example.hiltappone.remote

import com.example.hiltappone.model.Item
import retrofit2.http.GET

interface ApiService {
    @GET("items")
    suspend fun getItems(): List<Item>
}
package com.example.hiltappone.remote

import com.example.hiltappone.model.Item
import javax.inject.Inject

class ItemRepository @Inject constructor (
    private val apiService: ApiService
) {

    suspend fun getItems(): List<Item>{
        return apiService.getItems()
    }
}
package com.example.hiltappone.remote

import com.example.hiltappone.model.Cryptocurrency

interface CryptocurrencyRepository {
    fun getCryptoCurrency(): List<Cryptocurrency>
}
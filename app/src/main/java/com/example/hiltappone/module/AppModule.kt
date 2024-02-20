package com.example.hiltappone.module

import com.example.hiltappone.remote.CryptocurrencyRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideCryptoCurrencyRepository(): CryptocurrencyRepositoryImpl {
        return CryptocurrencyRepositoryImpl()
    }
}
package com.example.hiltappone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.hiltappone.viewmodel.CryptoCurrencyViewModel
import com.example.hiltappone.viewmodel.ItemViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: ItemViewModel
    private lateinit var cryptoCurrencyViewModel: CryptoCurrencyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(ItemViewModel::class.java)
        cryptoCurrencyViewModel = ViewModelProvider(this)[CryptoCurrencyViewModel::class.java]

       /* viewModel.items.observe(this, Observer { items ->

        })*/

        cryptoCurrencyViewModel.cryptoCurrency.observe(this, Observer {
            it.forEach {
                println("CRYPTO: ${it.name}")
            }
        })
    }
}
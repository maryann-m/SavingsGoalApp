package com.example.sample21.repo

import com.example.sample21.data.CryptoCurrency

interface CryptocurrencyRepository {

    fun getCryptoCurrency(): List<CryptoCurrency>

}
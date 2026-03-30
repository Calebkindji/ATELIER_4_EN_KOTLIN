package com.example.tp_affirmation.model

import androidx.annotation.DrawableRes

data class Country(
    val name: String,
    val capital: String,
    val code: String,
    @DrawableRes val flagResId: Int,
    val description: String
)

package com.example.tp_affirmation.data

import com.example.tp_affirmation.R
import com.example.tp_affirmation.model.Country

class DataSource {
    fun loadCountries(): List<Country> {
        return listOf(
            Country("Congo", "Brazzaville", "CG", R.drawable.imageTP1),
            Country("RDC", "Kinshasa", "CD", R.drawable.imageTP2),
            Country("USA", "Washington D.C.", "US", R.drawable.imageTP3),
            Country("Chine", "Pékin", "CN", R.drawable.imageTP4),
            Country("Brésil", "Brasilia", "BR", R.drawable.imageTP5),
            Country("Afrique du Sud", "Pretoria", "ZA", R.drawable.imageTP6),
            Country("Japon", "Tokyo", "JP", R.drawable.imageTP7),
            Country("Canada", "Ottawa", "CA", R.drawable.imageTP8),
            Country("Italie", "Rome", "IT", R.drawable.imageTP9),
            Country("Espagne", "Madrid", "ES", R.drawable.imageTP10)
        )
    }
}
package com.example.tp_affirmation.data

import com.example.tp_affirmation.R
import com.example.tp_affirmation.model.Country

class DataSource {
    fun loadCountries(): List<Country> {
        return listOf(
            Country("Congo", "Brazzaville", "CG", R.drawable.imagetp1),
            Country("RDC", "Kinshasa", "CD", R.drawable.imagetp2),
            Country("USA", "Washington D.C.", "US", R.drawable.imagetp3),
            Country("Chine", "Pékin", "CN", R.drawable.imagetp4),
            Country("Brésil", "Brasilia", "BR", R.drawable.imagetp5),
            Country("Afrique du Sud", "Pretoria", "ZA", R.drawable.imagetp6),
            Country("Japon", "Tokyo", "JP", R.drawable.imagetp7),
            Country("Canada", "Ottawa", "CA", R.drawable.imagetp8),
            Country("Italie", "Rome", "IT", R.drawable.imagetp9),
            Country("Espagne", "Madrid", "ES", R.drawable.imagetp10)
        )
    }
}

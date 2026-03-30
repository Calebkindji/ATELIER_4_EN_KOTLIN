package com.example.tp_affirmation.data

import com.example.tp_affirmation.R
import com.example.tp_affirmation.model.Country

class DataSource {
    fun loadCountries(): List<Country> {
        return listOf(
            Country("Congo", "Brazzaville", "CG", R.drawable.imagetp1, "Le Congo est connu pour sa forêt tropicale et son fleuve puissant."),
            Country("RDC", "Kinshasa", "CD", R.drawable.imagetp2, "La RDC est le plus grand pays d'Afrique subsaharienne, riche en ressources naturelles."),
            Country("USA", "Washington D.C.", "US", R.drawable.imagetp3, "Les États-Unis sont une puissance mondiale avec une grande diversité culturelle."),
            Country("Chine", "Pékin", "CN", R.drawable.imagetp4, "La Chine est le pays le plus peuplé au monde avec une histoire millénaire."),
            Country("Brésil", "Brasilia", "BR", R.drawable.imagetp5, "Le Brésil est célèbre pour son carnaval, le football et la forêt amazonienne."),
            Country("Afrique du Sud", "Pretoria", "ZA", R.drawable.imagetp6, "L'Afrique du Sud est la nation arc-en-ciel, connue pour son histoire et ses parcs nationaux."),
            Country("Japon", "Tokyo", "JP", R.drawable.imagetp7, "Le Japon allie traditions ancestrales et technologies de pointe."),
            Country("Canada", "Ottawa", "CA", R.drawable.imagetp8, "Le Canada est réputé pour ses paysages naturels vastes et sa convivialité."),
            Country("Italie", "Rome", "IT", R.drawable.imagetp9, "L'Italie est le berceau de la Renaissance, célèbre pour son art et sa gastronomie."),
            Country("Espagne", "Madrid", "ES", R.drawable.imagetp10, "L'Espagne est connue pour son climat ensoleillé, sa culture vibrante et ses tapas.")
        )
    }
}

package com.example.tp_affirmation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tp_affirmation.data.DataSource
import com.example.tp_affirmation.model.Country
import com.example.tp_affirmation.ui.theme.TP_AffirmationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TP_AffirmationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CountryApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun CountryCard(country: Country, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .padding(8.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        shape = MaterialTheme.shapes.medium
    ) {
        Column {
            Image(
                painter = painterResource(country.flagResId),
                contentDescription = country.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = country.name,
                    style = MaterialTheme.typography.headlineSmall
                )
                Text(
                    text = "Capitale: ${country.capital}",
                    style = MaterialTheme.typography.bodyMedium
                )
                Text(
                    text = "Code: ${country.code}",
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}

@Composable
fun CountryList(countryList: List<Country>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(countryList) { country ->
            CountryCard(country = country)
        }
    }
}

@Composable
fun CountryApp(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.fillMaxSize()
    ) {
        CountryList(
            countryList = DataSource().loadCountries()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CountryPreview() {
    TP_AffirmationTheme {
        CountryApp()
    }
}

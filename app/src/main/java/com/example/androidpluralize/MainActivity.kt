package com.example.androidpluralize

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androidpluralize.ui.theme.AndroidPluralizeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidPluralizeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PluralizeScreen(Modifier.padding(innerPadding).padding(16.dp))
                }
            }
        }
    }
}

@Composable
fun PluralizeScreen(modifier: Modifier = Modifier) {
    var word by remember { mutableStateOf("") }

    val isPlural = Pluralize.isPlural(word)
    val plural = Pluralize.plural(word)
    val singular = Pluralize.singular(word)

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = word,
            onValueChange = { word = it },
            label = { Text("Enter a word to pluralize") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )

        if (word.isNotBlank()) {
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "The word \"$word\" is ${if (isPlural) "plural" else "singular"}")
            Spacer(modifier = Modifier.height(12.dp))
            Text(text = "The plural of \"$word\" is \"$plural\"")
            Spacer(modifier = Modifier.height(12.dp))
            Text(text = "The singular of \"$word\" is \"$singular\"")
        }
    }
}


package com.bignerdranch.android.codapizza

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.bignerdranch.android.codapizza.ui.theme.CodaPizzaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CodaPizzaTheme {
                PizzaBuilderScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CodaPizzaAppPreview() {
    CodaPizzaTheme {
        PizzaBuilderScreen()
    }
}


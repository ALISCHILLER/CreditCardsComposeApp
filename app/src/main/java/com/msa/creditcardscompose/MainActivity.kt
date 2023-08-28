package com.msa.creditcardscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.msa.creditcardscompose.ui.theme.CreditCardsComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreditCardsComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    cardlistView()
                }
            }
        }
    }
}

@Composable
fun cardlistView(){
    var cards =listCards()
    
    LazyColumn(
        modifier = Modifier
            .fillMaxHeight()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ){
        items(cards){card -> 
            
           CreditCard(cardInfo = card)
        }
    }
}

fun listCards():List<CardInfo>{
    return listOf(
        CardInfo(
            "1111 1111 1111 111",
            "name",
            R.drawable.logo,
            R.drawable.card
            ),
        CardInfo(
            "2222 2222 2222 2222",
            "name2",
            R.drawable.logo,
            R.drawable.card
        ),
        CardInfo(
            "3333 3333 3333 3333",
            "name3",
            R.drawable.logo,
            R.drawable.card
        ),
        
    )
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CreditCardsComposeTheme {
        cardlistView()
    }
}
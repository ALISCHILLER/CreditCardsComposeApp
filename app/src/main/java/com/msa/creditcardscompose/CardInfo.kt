package com.msa.creditcardscompose

import androidx.annotation.DrawableRes

data class CardInfo(
    val cardNumber: String,
    val cardHolder: String,
    @DrawableRes val logoImage: Int,
    @DrawableRes val bankgroundImage: Int
)
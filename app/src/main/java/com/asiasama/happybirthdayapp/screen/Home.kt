package com.asiasama.happybirthdayapp.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.asiasama.happybirthdayapp.R
import com.asiasama.happybirthdayapp.composable.RectShape
import com.asiasama.happybirthdayapp.composable.image
import com.asiasama.happybirthdayapp.composable.textHeader

@Preview(showSystemUi = true)
@Composable
fun HomeScreen() {
    Column(
        Modifier
            .fillMaxSize()
            .background(color = Color.White),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        image(painter = painterResource(id = R.drawable.image))
        textHeader(
            title = stringResource(R.string.asia_sama),
            birthday = stringResource(R.string.birthday),
            description = stringResource(R.string.happy_birthday_to_me)
        )


        RectShape()

    }

}



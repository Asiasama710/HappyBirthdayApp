package com.asiasama.happybirthdayapp

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.asiasama.happybirthdayapp.screen.HomeScreen
import com.asiasama.happybirthdayapp.ui.theme.HappyBirthdayAppTheme

@Preview(showSystemUi = true)
@Composable
fun HappyBirthDayApp() {
    HappyBirthdayAppTheme {
        Scaffold()
        {
          HomeScreen( )
        }
    }

}
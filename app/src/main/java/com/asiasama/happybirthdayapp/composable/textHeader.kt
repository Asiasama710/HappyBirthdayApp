package com.asiasama.happybirthdayapp.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.asiasama.happybirthdayapp.ui.theme.secondry
import com.asiasama.happybirthdayapp.ui.theme.white

@Composable
fun textHeader(title:String, birthday:String, description: String){
    Column(
        Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = title,
            fontSize = 24.sp,
            color = secondry,
        )
        Text(
            text = birthday,
            fontSize = 14.sp,
            color = secondry,
        )

        Text(
            text = description,
            Modifier
                .padding(vertical = 16.dp, horizontal = 16.dp)
                .width(190.dp),
            textAlign = TextAlign.Center,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 24.sp,
            color = secondry,
        )

    }

}
@Composable
fun textAdv(title: String){
    Text(
        text = title,
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp),
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Medium,
        fontSize = 24.sp,
        color = white,
    )
}
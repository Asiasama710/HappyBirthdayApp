package com.asiasama.happybirthdayapp.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.asiasama.happybirthdayapp.R
import com.asiasama.happybirthdayapp.ui.theme.primary


@Composable
@Preview
fun RectShape() {
    Box(contentAlignment = Alignment.Center) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .shadow(
                    elevation = 12.dp,
                    ambientColor = colorResource(id = R.color.black),
                    spotColor = primary
                )
                .background(
                    color = primary,
                    shape = AbsoluteRoundedCornerShape(16.dp, 16.dp, 0.dp, 0.dp)
                )
        )
        textAdv(title = stringResource(id = R.string.advance))
    }
}


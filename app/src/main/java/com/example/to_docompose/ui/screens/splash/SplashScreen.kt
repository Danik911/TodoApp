package com.example.to_docompose.ui.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.to_docompose.R
import com.example.to_docompose.ui.theme.LOGO_SIZE
import com.example.to_docompose.ui.theme.ToDoComposeTheme
import com.example.to_docompose.ui.theme.splashScreenBackgroundColor

@Composable
fun SplashScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.splashScreenBackgroundColor),
        contentAlignment = Alignment.Center
    ){
        Image(
            modifier = Modifier.size(LOGO_SIZE),
            painter = painterResource(id = getLogo()),
            contentDescription = stringResource(id = R.string.splash_logo)

        )
    }
}
@Composable
fun getLogo(): Int{
    return if(isSystemInDarkTheme()){
        R.drawable.ic_logo_dark
    } else{
        R.drawable.ic_logo_light
    }
        
}
@Composable
@Preview
private fun SplashScreenPreview(){
    SplashScreen()
}
/*
@Composable
@Preview
private fun SplashScreenPreviewDark(){
    ToDoComposeTheme(darkTheme = true) {
        SplashScreen()
    }
}*/

package com.abdoali.lottiefile

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition

@Composable
fun LottieCompose(
    modifier: Modifier = Modifier
) {
    val animation by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.rating_app))
    val animationSata by animateLottieCompositionAsState(
        composition = animation ,
        iterations = Int.MAX_VALUE
    )
    Box {
        LottieAnimation(
            composition = animation ,
            progress = { animationSata } ,
            modifier = modifier)
    }
}

@Preview
@Composable
fun LottiePreview() {
    LottieCompose()
}
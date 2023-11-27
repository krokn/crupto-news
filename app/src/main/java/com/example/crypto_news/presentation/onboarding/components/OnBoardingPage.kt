package com.example.crypto_news.presentation.onboarding.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDirection.Companion.Content
import androidx.compose.ui.tooling.preview.Preview
import com.example.crypto_news.R
import com.example.crypto_news.presentation.Dimens.MediumPadding1
import com.example.crypto_news.presentation.Dimens.MediumPadding2
import com.example.crypto_news.presentation.Dimens.title
import com.example.crypto_news.presentation.Dimens.description
import com.example.crypto_news.presentation.onboarding.Page
import com.example.crypto_news.presentation.onboarding.pages
import com.example.crypto_news.ui.theme.CryptonewsTheme


@Composable
fun OnboardingPage(
    modifier: Modifier = Modifier,
    page: Page
) {
    Column(
        modifier = modifier
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(fraction = 0.6f),
            painter = painterResource(id = page.image),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(MediumPadding1))
        Text(
            text = page.title,
            modifier = Modifier.padding(horizontal = MediumPadding2),
            fontSize = title,
            color = colorResource(id = R.color.display_small)
        )
        Text(
            text = page.description,
            modifier = Modifier.padding(horizontal = MediumPadding2),
            fontSize = description,
            color = colorResource(id = R.color.text_medium)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun OnBoardingPagePreview () {
    CryptonewsTheme {
       OnboardingPage(
           page = pages[0]
       )
    }
}
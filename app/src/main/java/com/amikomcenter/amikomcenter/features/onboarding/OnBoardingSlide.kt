package com.amikomcenter.amikomcenter.features.onboarding

data class OnBoardingSlide(
    val description: CharSequence,
    val Image: Int,
    val btnText: String,
    val isLastPage: Boolean
)
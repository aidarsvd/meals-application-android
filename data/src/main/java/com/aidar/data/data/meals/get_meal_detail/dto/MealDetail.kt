package com.aidar.data.data.meals.get_meal_detail.dto

import com.google.gson.annotations.SerializedName

data class MealDetail(
    @SerializedName("strMeal") var strMeal: String? = null,
    @SerializedName("strInstructions") var strInstructions: String? = null,
    @SerializedName("strMealThumb") var strMealThumb: String? = null,
    @SerializedName("strYoutube") var strYoutube: String? = null

    )
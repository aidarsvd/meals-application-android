package com.aidar.data.data.meals.get_meal_category.api

import com.aidar.data.data.meals.get_meal_category.dto.MealList
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Query


interface MealCategoryApi {
    @GET("api/json/v1/1/filter.php?")
    fun getCategory(@Query("c") c: String): Observable<MealList>
}
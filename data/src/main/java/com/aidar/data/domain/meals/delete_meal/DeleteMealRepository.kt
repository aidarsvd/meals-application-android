package com.aidar.data.domain.meals.delete_meal

import com.aidar.data.base.model.Meal

interface DeleteMealRepository {
    suspend fun deleteMeal(meal: Meal)
}
package com.aidar.data.data.meals.add_meal

import com.aidar.data.common.database.meals.MealDataBase
import com.aidar.data.data.meals.add_meal.dao.AddMealDao
import com.aidar.data.data.meals.add_meal.repository.AddMealRepositoryImpl
import com.aidar.data.domain.meals.add_meal.AddMealRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object AddMealModule {
    @Provides
    fun provideAddMealDao(db: MealDataBase): AddMealDao {
        return db.addMeal()
    }

    @Provides
    fun provideAddMealRepository(addMealDao: AddMealDao): AddMealRepository {
        return AddMealRepositoryImpl(addMealDao = addMealDao)
    }
}
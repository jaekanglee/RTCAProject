package com.ppizil.data.di

import com.ppizil.data.AppDataBase
import com.ppizil.data.service.EventDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {


    @Provides
    fun provideEventDao(dataBase: AppDataBase): EventDao = dataBase.reserveDao()


}
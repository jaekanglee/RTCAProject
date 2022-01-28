package com.ppizil.data.di

import com.ppizil.data.datasource.EventSource
import com.ppizil.data.datasource.EventSourceImpl
import com.ppizil.data.service.EventDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {


    @Provides
    fun provideEventDataSource(eventDao: EventDao): EventSource = EventSourceImpl(eventDao)


}
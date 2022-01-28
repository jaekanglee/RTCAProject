package com.ppizil.data.di

import com.ppizil.data.datasource.EventSource
import com.ppizil.domain.repository.EventRepository
import com.ppizil.data.repository.EventRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {


    @Provides
    fun provideEventRepository(dataSource: EventSource): EventRepository =
        EventRepositoryImpl(dataSource)
}
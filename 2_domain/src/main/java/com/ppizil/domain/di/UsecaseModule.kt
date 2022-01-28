package com.ppizil.domain.di

import com.ppizil.domain.repository.EventRepository
import com.ppizil.domain.usecase.EventInsertUsecase
import com.ppizil.domain.usecase.EventInsertUsecaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UsecaseModule {

    @Provides
    fun provideEventInsertUsecase(repo: EventRepository): EventInsertUsecase =
        EventInsertUsecaseImpl(repo)
}
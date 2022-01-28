package com.ppizil.domain.di

import com.ppizil.domain.repository.EventRepository
import com.ppizil.domain.usecase.EventInsertUsecase
import com.ppizil.domain.usecase.EventInsertUsecaseImpl
import com.ppizil.domain.usecase.FetchEventsUsecase
import com.ppizil.domain.usecase.FetchEventsUsecaseImpl
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

    @Provides
    fun provideFetchEventUsecase(repo: EventRepository): FetchEventsUsecase =
        FetchEventsUsecaseImpl(repo)
}
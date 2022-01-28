package com.ppizil.data.di

import android.app.Application
import androidx.room.Room
import com.ppizil.data.AppDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {

    const val  DB_NAME = "RTCA_APP"

    @Provides
    fun provideDataBaseInstance(application : Application) : AppDataBase {
        return Room.databaseBuilder(
            application,
            AppDataBase::class.java, "RTCA_APP"
        ).apply {
            fallbackToDestructiveMigration()
        }.build()
    }
}
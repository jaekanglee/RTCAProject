package com.ppizil.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ppizil.data.model.EventDataModel
import com.ppizil.data.service.EventDao

@Database(entities = [EventDataModel::class], version = 1, exportSchema = false)
abstract class AppDataBase : RoomDatabase() {
    abstract fun reserveDao(): EventDao
}

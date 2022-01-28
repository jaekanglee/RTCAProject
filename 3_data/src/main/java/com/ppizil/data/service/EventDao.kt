package com.ppizil.data.service

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ppizil.data.model.EventDataModel
import kotlinx.coroutines.flow.Flow


@Dao
interface EventDao {
    @Query("SELECT * FROM eventModel")
    fun getEventList(): Flow<List<EventDataModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertEventItem(item: EventDataModel)

}
package com.breakapp.rev.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(RevEntity::class), version = 1)
abstract class RevDataBase: RoomDatabase() {
    abstract fun RevDao(): RevDao
}
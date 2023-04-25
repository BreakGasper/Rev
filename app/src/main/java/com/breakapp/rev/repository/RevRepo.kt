package com.breakapp.rev.repository

import com.breakapp.rev.room.RevEntity

interface RevRepo {
    suspend fun addRev(task: RevEntity)

}
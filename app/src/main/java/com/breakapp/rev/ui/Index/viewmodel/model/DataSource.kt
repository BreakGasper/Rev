package com.breakapp.rev.ui.Index.viewmodel.model

import com.breakapp.rev.room.RevDataBase
import com.breakapp.rev.room.RevEntity

class DataSource (private val appDataBase:RevDataBase){
    suspend fun InsertReview(revEntity: RevEntity){
        appDataBase.RevDao().addRevs(revEntity)

    }
}
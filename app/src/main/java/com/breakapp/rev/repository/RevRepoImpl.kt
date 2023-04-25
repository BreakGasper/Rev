package com.breakapp.rev.repository

import com.breakapp.rev.room.RevEntity
import com.breakapp.rev.ui.Index.viewmodel.model.DataSource

class RevRepoImpl(private val dataSource: DataSource):RevRepo
{
    override suspend fun addRev(rev: RevEntity) {
        dataSource.InsertReview(rev)
    }

}
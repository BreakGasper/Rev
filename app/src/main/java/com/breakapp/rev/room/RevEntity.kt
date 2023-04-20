package com.breakapp.rev.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "rev_entity")
data class RevEntity (
    @PrimaryKey(autoGenerate = true)
    var id:Int=0,
    var business_name: String ="",
    var name_full: String="",
    var date_brithday: String="",
    var gender: String="",
    var type_businnes: String="",
    var email: String="",
    var password: String="",
    var url_photo: String="",
    )
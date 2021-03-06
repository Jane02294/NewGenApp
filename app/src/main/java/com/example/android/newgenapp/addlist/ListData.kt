package com.example.android.newgenapp.addlist

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "listTable")
data class ListData (
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    @ColumnInfo(name = "Name",defaultValue = "unknown")
    var name:String,
    @ColumnInfo(name="email")
    var email:String
)
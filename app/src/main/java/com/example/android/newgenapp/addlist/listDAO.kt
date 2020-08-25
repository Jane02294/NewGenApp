package com.example.android.newgenapp.addlist

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

interface listDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(name:String,email:String)

    @Query("select * from listTable order by desc")
    fun getList():LiveData<List<ListDB>>
}
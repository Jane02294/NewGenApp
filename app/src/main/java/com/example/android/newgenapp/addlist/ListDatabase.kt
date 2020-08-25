package com.example.android.newgenapp.addlist

package com.example.android.newgenapp.addlist

//import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ListData::class],version = 1)
abstract class ListDatabase:RoomDatabase(){

    companion object {
        @Volatile
        private var model: ListDatabase?=null
        fun getDatabase(context: Context):ListDatabase? {
            synchronized(this) {
                var _model = model

                if (_model == null) {
                    model = Room.databaseBuilder(
                        context.applicationContext,
                        ListDatabase::class.java,
                        "contacts_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    model = _model
                }
                return _model
            }
        }
    }
    abstract val ListDAO:ListDAO
}

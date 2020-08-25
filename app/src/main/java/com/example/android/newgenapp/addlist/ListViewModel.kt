package com.example.android.newgenapp.addlist


import android.app.Application
import androidx.lifecycle.AndroidViewModel

class ListViewModel(val database: ListDatabase,
                    application: Application
) :AndroidViewModel(application) {
}
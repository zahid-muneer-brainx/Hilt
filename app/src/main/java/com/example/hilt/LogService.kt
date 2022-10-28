package com.example.hilt

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

class LogService @Inject constructor() {
    fun log(msg:String)
    {
        Log.d(TAG,msg)
    }
}
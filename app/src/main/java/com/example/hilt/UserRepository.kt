package com.example.hilt

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject
interface UserRepository
{
    fun oncreate(emial:String,password:String)
}
class SqlRepository @Inject constructor(var logService: LogService):UserRepository {
    override fun oncreate(emial:String, password:String)
    {
        logService.log("User is Created in MySQL")
    }
}
class FirebaseRepository @Inject constructor(var logService: LogService):UserRepository {
    override fun oncreate(emial:String, password:String)
    {
        logService.log("User is Created in Firebase")
    }
}
package com.example.spellbee2.sessopm

import android.app.Application
import com.example.spellbee2.persistence.AuthTokenDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SessionManager
@Inject
constructor(
    val authTokenDao: AuthTokenDao,
    val application: Application

)
{



}
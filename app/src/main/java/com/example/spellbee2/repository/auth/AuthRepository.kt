package com.example.spellbee2.repository.auth

import com.example.spellbee2.api.auth.OpenApiAuthService
import com.example.spellbee2.persistence.AccountPropertiesDao
import com.example.spellbee2.persistence.AuthTokenDao
import com.example.spellbee2.sessopm.SessionManager
import javax.inject.Inject


class AuthRepository
@Inject
constructor(
    val accountPropertiesDao: AccountPropertiesDao,
    val authTokenDao: AuthTokenDao,
    val openApiAuthService: OpenApiAuthService,
    val sessionManager: SessionManager
)
{
}
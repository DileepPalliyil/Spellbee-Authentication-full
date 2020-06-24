package com.example.spellbee2.di.auth

import com.example.spellbee2.api.auth.OpenApiAuthService
import com.example.spellbee2.persistence.AccountPropertiesDao
import com.example.spellbee2.persistence.AuthTokenDao
import com.example.spellbee2.repository.auth.AuthRepository
import com.example.spellbee2.sessopm.SessionManager
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class AuthModule {

    // TEMPORARY
    @AuthScope
    @Provides
    fun provideFakeApiService(): OpenApiAuthService {
        return Retrofit.Builder()
            .baseUrl("https://open-api.xyz")
            .build()
            .create(OpenApiAuthService::class.java)
    }

    @AuthScope
    @Provides
    fun provideAuthRepository(
        accountPropertiesDao: AccountPropertiesDao,
        authTokenDao: AuthTokenDao,
        openApiAuthService: OpenApiAuthService,
        sessionManager: SessionManager
    ): AuthRepository {
        return AuthRepository(
            accountPropertiesDao,
            authTokenDao,
            openApiAuthService,
            sessionManager
        )
    }

}
package com.example.spellbee2.di

import com.example.spellbee2.di.auth.AuthFragmentBuildersModule
import com.example.spellbee2.di.auth.AuthModule
import com.example.spellbee2.di.auth.AuthScope
import com.example.spellbee2.di.auth.AuthViewModelModule
import com.example.spellbee2.ui.auth.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
        modules = [AuthModule::class, AuthFragmentBuildersModule::class, AuthViewModelModule::class]
    )
    abstract fun contributeAuthActivity(): AuthActivity

}
package com.example.spellbee2.di.auth

import com.example.spellbee2.ui.auth.ForgotPasswordFragment
import com.example.spellbee2.ui.auth.LauncherFragment
import com.example.spellbee2.ui.auth.LoginFragment
import com.example.spellbee2.ui.auth.RegisterFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AuthFragmentBuildersModule {

    @ContributesAndroidInjector()
    abstract fun contributeLauncherFragment(): LauncherFragment

    @ContributesAndroidInjector()
    abstract fun contributeLoginFragment(): LoginFragment

    @ContributesAndroidInjector()
    abstract fun contributeRegisterFragment(): RegisterFragment

    @ContributesAndroidInjector()
    abstract fun contributeForgotPasswordFragment(): ForgotPasswordFragment

}
package com.example.spellbee2.di.auth

import androidx.lifecycle.ViewModel
import com.example.spellbee2.di.ViewModelKey
import com.example.spellbee2.ui.auth.AuthViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AuthViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    abstract fun bindAuthViewModel(authViewModel: AuthViewModel): ViewModel

}
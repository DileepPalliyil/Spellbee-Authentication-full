package com.example.spellbee2.ui.auth

import androidx.lifecycle.ViewModel
import com.example.spellbee2.repository.auth.AuthRepository
import javax.inject.Inject

class AuthViewModel
@Inject
constructor(val authRepository: AuthRepository
): ViewModel()
{
}
package com.example.my_mobile_exercise

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val name: String,
    val email: String,
    var phone: String? = null
): Parcelable

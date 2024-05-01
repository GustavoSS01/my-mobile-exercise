package com.example.my_mobile_exercise

import android.content.Intent
import android.os.Build
import android.os.Build.VERSION_CODES.TIRAMISU
import android.os.Parcelable

inline fun <reified T : Parcelable?> Intent.getExtra(name: String) =
    if (Build.VERSION.SDK_INT >= TIRAMISU) {
        this.extras?.getParcelable(name, T::class.java)
    } else {
        this.extras?.getParcelable<T>(name)
    }
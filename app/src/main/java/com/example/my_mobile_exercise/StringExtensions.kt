package com.example.my_mobile_exercise

fun String?.isFieldValid(regex: Regex): Boolean {
    return this?.contains(regex) ?: run { false }
}

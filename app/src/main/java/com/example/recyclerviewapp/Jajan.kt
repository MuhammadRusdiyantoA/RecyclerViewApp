package com.example.recyclerviewapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Jajan(
    val imgJajan: Int,
    val namaJajan: String,
    val descJajan: String
) : Parcelable

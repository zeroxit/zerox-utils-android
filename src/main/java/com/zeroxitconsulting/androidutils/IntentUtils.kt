package com.zeroxitconsulting.androidutils

import android.app.Activity
import android.content.Context
import android.content.Intent

fun Context.openActivity(a: Activity) {
    val intent = Intent(this, a::class.java)
    startActivity(intent)
}
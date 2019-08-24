package com.zeroxitconsulting.androidutils

import android.app.Activity
import androidx.core.app.ActivityCompat

fun Activity.requestPermission(
    permissionType: String,
    requestCode: Int
) {
    ActivityCompat.requestPermissions(
        this,
        arrayOf(permissionType), requestCode
    )
}
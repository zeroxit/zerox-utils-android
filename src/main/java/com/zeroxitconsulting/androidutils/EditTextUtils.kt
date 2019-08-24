package com.zeroxitconsulting.androidutils

import android.widget.EditText

fun EditText.isEmpty(): Boolean {
    return !this.text.toString().trim().isNotEmpty() ||
            !this.text.toString().trim().isNotBlank()
}

fun EditText.getString(): String {
    return this.text.toString()
}

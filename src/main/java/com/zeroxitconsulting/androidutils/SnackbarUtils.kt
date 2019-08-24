package com.zeroxitconsulting.androidutils

import android.support.design.widget.Snackbar
import android.view.View

fun showMessage(view: View, message: String) {
    Snackbar.make(view, message, Snackbar.LENGTH_INDEFINITE).setAction("Action", null).show()
}
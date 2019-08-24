package com.zeroxitconsulting.androidutils

import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.graphics.PorterDuff
import android.os.Build
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import androidx.annotation.ColorRes

fun View.hide() {
    visibility = View.GONE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

fun View.show() {
    visibility = View.VISIBLE
}

fun ImageView.tintIcon(@ColorRes icon: Int) {
    val LOLLIPOP = 21 // Build.VERSION_CODES.LOLLIPOP no compile :S

    if (Build.VERSION.SDK_INT >= LOLLIPOP) setColorFilter(
        context.resources.getColor(icon),
        PorterDuff.Mode.SRC_IN
    )
}

fun Fragment.hideKeyboard() {
    view?.let { activity.hideKeyboard(it) }
}

fun Activity.hideKeyboard() {
    if (currentFocus == null) View(this) else currentFocus?.let { hideKeyboard(it) }
}

fun Context.hideKeyboard(view: View) {
    val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
}
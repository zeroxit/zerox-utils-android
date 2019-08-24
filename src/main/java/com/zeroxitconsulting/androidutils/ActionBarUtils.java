package com.zeroxitconsulting.androidutils;

import android.app.ActionBar;
import android.graphics.drawable.Drawable;

public class ActionBarUtils {

    public static void changeTitle(ActionBar actionBar, String title) {
        actionBar.setTitle(title);
    }

    public static void enableBackButton(ActionBar actionBar) {
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    public static void setLogo(ActionBar actionBar, Drawable drawable) {
        actionBar.setLogo(drawable);
    }
}

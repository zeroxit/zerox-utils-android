package com.zeroxitconsulting.androidutils;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

import uk.co.chrisjenx.calligraphy.TypefaceUtils;

public class FontUtils {

    private static String FONT_REGULAR = "montserratregular.ttf";
    private static String FONT_BOLD = "montserratbold.ttf";
    private static String FONT_SEMI_BOLD = "montserratsemibold.ttf";
    private static String FONT_BLACK_ITALIC = "montserratblackitalic.ttf";

    public static void applyFontRegular(Context context, TextView... views) {
        Typeface font = TypefaceUtils.load(context.getAssets(), "fonts/" + FONT_REGULAR);

        for (TextView t : views) {
            t.setTypeface(font);
        }
    }

    public static void applyFontBold(Context context, TextView... views) {
        Typeface font = TypefaceUtils.load(context.getAssets(), "fonts/" + FONT_BOLD);

        for (TextView t : views) {
            t.setTypeface(font);
        }
    }

    public static void applyFontSemiBold(Context context, TextView... views) {
        Typeface font = TypefaceUtils.load(context.getAssets(), "fonts/" + FONT_SEMI_BOLD);

        for (TextView t : views) {
            t.setTypeface(font);
        }
    }

    public static void applyFontBlackItalic(Context context, TextView... views) {
        Typeface font = TypefaceUtils.load(context.getAssets(), "fonts/" + FONT_BLACK_ITALIC);

        for (TextView t : views) {
            t.setTypeface(font);
        }
    }


    public static Typeface typefaceUtils(Context context, String font) {
        return TypefaceUtils.load(context.getAssets(), "fonts/" + font);
    }

    public static Typeface typefaceUtilsRegular(Context context) {
        return TypefaceUtils.load(context.getAssets(), "fonts/" + FONT_REGULAR);
    }

    public static Typeface typefaceUtilsBold(Context context) {
        return TypefaceUtils.load(context.getAssets(), "fonts/" + FONT_BOLD);
    }

    public static Typeface typefaceUtilsSemiBold(Context context) {
        return TypefaceUtils.load(context.getAssets(), "fonts/" + FONT_SEMI_BOLD);
    }

    public static Typeface typefaceUtilsBlackItalic(Context context) {
        return TypefaceUtils.load(context.getAssets(), "fonts/" + FONT_BLACK_ITALIC);
    }

    public static void initializeFontRegular(String font) {
        FONT_REGULAR = font;
    }

    public static void initializeFontBold(String font) {
        FONT_BOLD = font;
    }

    public static void initializeFontSemiBold(String font) {
        FONT_SEMI_BOLD = font;
    }

    public static void initializeFontBlackItalic(String font) {
        FONT_BLACK_ITALIC = font;
    }

    public static String getFontRegularName() {
        return FONT_REGULAR;
    }

    public static String getFontBold() {
        return FONT_BOLD;
    }

    public static String getFontSemiBold() {
        return FONT_SEMI_BOLD;
    }

    public static String getFontBlackItalic() {
        return FONT_BLACK_ITALIC;
    }
}

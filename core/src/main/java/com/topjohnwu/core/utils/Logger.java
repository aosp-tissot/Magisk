package com.topjohnwu.core.utils;

import android.util.Log;

import com.topjohnwu.core.BuildConfig;
import com.topjohnwu.core.Const;

public class Logger {

    public static void debug(String line) {
        if (BuildConfig.DEBUG)
            Log.d(Const.DEBUG_TAG, "DEBUG: " + line);
    }

    public static void debug(String fmt, Object... args) {
        debug(Utils.fmt(fmt, args));
    }

    public static void error(String line) {
        Log.e(Const.DEBUG_TAG, "ERROR: " + line);
    }

    public static void error(String fmt, Object... args) {
        error(Utils.fmt(fmt, args));
    }
}

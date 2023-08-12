package com.github.zaileitv.osc.util;

import android.util.Log;

/**
 * @author pj567
 * @date :2020/12/18
 * @description:
 */
public class LOG {
    private static String TAG = "ZaiLeiTV";

    public static void e(String msg) {
        Log.e(TAG, "" + msg);
    }

    public static void i(String msg) {
        Log.i(TAG, "" + msg);
    }
}
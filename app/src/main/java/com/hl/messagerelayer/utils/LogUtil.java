package com.hl.messagerelayer.utils;

import android.util.Log;

/**
 * Created by Edward on 2018-01-27.
 */

public class LogUtil {
    public static boolean isDebug=true;

    public static void e(String string) {
        if (isDebug) {
            Log.e("hltag", string);
        }
    }
}

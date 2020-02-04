package com.example.myapplication;

import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;

import static android.content.ContentValues.TAG;

public class ConfirmLockPattern {

    void ShowSetLockPatternActivity() {
        Log.i(TAG, "Show Set Lock Pattern Activity");
        Intent intent = new Intent(Intent.ACTION_RUN);
        intent.setComponent(new ComponentName("com.android.settings",
                "com.android.settings.ConfirmLockPattern"));
       // startActivityForResult(intent, mRequestCode);
    } /* ShowSetLockPatternActivity() */
}

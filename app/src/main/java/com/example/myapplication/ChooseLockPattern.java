package com.example.myapplication;

import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;

import static android.content.ContentValues.TAG;
import static androidx.core.app.ActivityCompat.startActivityForResult;

public class ChooseLockPattern {

    void ShowSetLockPINActivity() {
        Log.i(TAG, "Show Set Lock PIN Activity");
        Intent intent = new Intent(Intent.ACTION_RUN);
        intent.setComponent(new ComponentName("com.android.settings",
                "com.android.settings.ChooseLockPassword"));
      //  startActivityForResult(intent);
    } /* ShowSetLockPINActivity() */
}

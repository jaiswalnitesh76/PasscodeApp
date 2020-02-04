package com.example.myapplication;

import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.textclassifier.TextLinks;

import static android.content.ContentValues.TAG;
import static androidx.core.app.ActivityCompat.startActivityForResult;
import static androidx.core.content.ContextCompat.getSystemService;

public class ConfirmLockPassword {
    public void ShowConfirmLockPINActivity() {
        Log.i(TAG, "Show Confirm Lock PIN Activity");
        Intent intent = new Intent(Intent.ACTION_RUN);
        intent.setComponent(new ComponentName("com.android.settings",
                "com.android.settings.ConfirmLockPassword"));
        //startActivityForResult(intent,Intent.makeRestartActivityTask());
    }
}

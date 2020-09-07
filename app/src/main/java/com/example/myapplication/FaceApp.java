package com.example.myapplication;
import android.app.Application;
import android.content.ContentProvider;
import android.os.Build;

import com.google.firebase.FirebaseApp;

public class FaceApp extends  Application{
    public static final String RESULT_TEXT="RESULT_TEXT";
    public static final String RESULT_DIALOG="RESULT_DIALOG";

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}

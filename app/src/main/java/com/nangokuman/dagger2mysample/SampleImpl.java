package com.nangokuman.dagger2mysample;

import android.util.Log;

public class SampleImpl implements Sample {

    private static final String TAG = SampleImpl.class.getSimpleName();

    @Override
    public void greeting() {
        Log.d(TAG, "Hello!");
    }
}
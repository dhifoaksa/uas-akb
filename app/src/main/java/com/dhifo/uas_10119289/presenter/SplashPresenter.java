package com.dhifo.uas_10119289.presenter;

import android.content.Context;
import android.content.Intent;

import com.dhifo.uas_10119289.activities.SlideActivity;
import com.dhifo.uas_10119289.activities.SplashActivity;

public class SplashPresenter {
    Context context;

    public SplashPresenter(SplashActivity splashActivity) {
    }

    Intent getSlide = new Intent();

    public Intent setSlide() {
        Intent intent = new Intent(context, SlideActivity.class);
        return intent;
    }
}

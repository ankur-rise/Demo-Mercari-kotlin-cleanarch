package com.mercari.mercaritest;
import android.app.Application;
import com.facebook.drawee.backends.pipeline.Fresco;

public    class MercariApplication extends Application   {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);


    }



}

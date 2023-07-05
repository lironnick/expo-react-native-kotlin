package com.lironnick.testeskdv2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class HelloJModule extends ReactContextBaseJavaModule {

    public HelloJModule(@Nullable ReactApplicationContext reactContext) {
        super(reactContext);
    }

    // add to CalendarModule.java
    @NonNull
    @Override
    public String getName() {
        return "HelloJava";
    }

    @ReactMethod
    public void sayHello(String name, Callback callback){
        try {
            String message = "Hello Galo: " + name;
            callback.invoke(null, message);
        } catch (Exception e) {
            callback.invoke(e, null);
        }
    }
}

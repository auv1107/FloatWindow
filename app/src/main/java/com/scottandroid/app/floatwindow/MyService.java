package com.scottandroid.app.floatwindow;

import android.content.Intent;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;

public class MyService extends FloatWindowHostService {
    private LayoutInflater mInflater = null;

    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInflater = LayoutInflater.from(getApplicationContext());
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return super.onTouch(v, event);
    }

    @Override
    protected View getView() {
        View v = mInflater.inflate(R.layout.layout_float, null);

        return v;
    }

}

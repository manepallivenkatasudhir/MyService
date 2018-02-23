package com.example.manep.myservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by manep on 2/22/2018.
 */

public class MyService extends Service {

    MediaPlayer mediaPlayer;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        mediaPlayer = MediaPlayer.create(this,R.raw.sun);
    }

    @Override
    public void onStart(Intent intent, int startId) {
        mediaPlayer.start();
    }

    @Override
    public void onDestroy() {
        mediaPlayer.stop();
    }
}

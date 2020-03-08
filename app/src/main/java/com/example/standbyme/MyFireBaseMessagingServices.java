package com.example.standbyme;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyFireBaseMessagingServices extends Service {
    public MyFireBaseMessagingServices() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

package com.example.root.firebasetest;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessaging;

/**
 * Created by Pasha Laptiev on 26.07.16.
 */
public class FirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static String TAG = "FirebaseInstanceIDService";
    private static final String FRIENDLY_ENGAGE_TOPIC = "friendly_engage";

    @Override
    public void onTokenRefresh() {

        String token = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "FCM token" + token);
        FirebaseMessaging.getInstance().subscribeToTopic(FRIENDLY_ENGAGE_TOPIC);

    }
}
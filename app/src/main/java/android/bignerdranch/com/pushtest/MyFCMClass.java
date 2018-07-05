package android.bignerdranch.com.pushtest;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;


public class MyFCMClass extends FirebaseMessagingService {

    private final String TAG = "JSA-FCM";


    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        if (remoteMessage.getNotification() != null) {
            Log.e(TAG, "Title: " + remoteMessage.getNotification().getTitle());
            Log.e(TAG, "Body: " + remoteMessage.getNotification().getBody());

            // do with Notification payload...
            // remoteMessage.getNotification().getBody()
        }

        if (remoteMessage.getData().size() > 0) {
            Log.e(TAG, "Data: " + remoteMessage.getData());
            // do with Data payload...
            // remoteMessage.getData()
        }
    }
}
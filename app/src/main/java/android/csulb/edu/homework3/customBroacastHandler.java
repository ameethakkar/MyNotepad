package android.csulb.edu.homework3;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.support.v4.app.NotificationCompat;

/**
 * Created by Amee on 3/18/2017.
 */

public class customBroacastHandler extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction().equals(Intent.ACTION_USER_PRESENT)){
            NotificationCompat.Builder mBuilder =   new NotificationCompat.Builder(context)
                    .setSmallIcon(android.R.drawable.stat_notify_error) // notification icon
                    .setContentTitle("Notification!") // title for notification
                    .setContentText("Hello word") // message for notification
                    .setAutoCancel(true); // clear notification after click
            //Intent intent1 = new Intent(this, MainActivity.class);
            PendingIntent pi = PendingIntent.getActivity(context,0,new Intent(context,MainActivity.class),0);
            mBuilder.setContentIntent(pi);


            NotificationManager mNotificationManager =
                    (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
            mNotificationManager.notify(0, mBuilder.build());


        }
        /*Device is shutting down. This is broadcast when the device
         * is being shut down (completely turned off, not sleeping)
         * */
        else if (intent.getAction().equals(Intent.ACTION_SHUTDOWN)) {

        }
    }
}

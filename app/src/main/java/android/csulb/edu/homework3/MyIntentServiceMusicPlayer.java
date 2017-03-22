package android.csulb.edu.homework3;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.util.Log;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class MyIntentServiceMusicPlayer extends IntentService {

    public MyIntentServiceMusicPlayer() {

        super("My Music Player Starting");
        Log.e("<<Music Starting>>","Music Starting");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("<<Music Ending>>","Music Ending");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        synchronized (this)
        {
            final MediaPlayer player = MediaPlayer.create(this,R.raw.eraser);
            player.start();
        }

    }
}

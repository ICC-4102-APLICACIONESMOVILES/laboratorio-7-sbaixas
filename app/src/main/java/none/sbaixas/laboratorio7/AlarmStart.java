package none.sbaixas.laboratorio7;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Sebastian on 22-05-18.
 */

public class AlarmStart extends BroadcastReceiver {
    public void onReceive(Context context, Intent arg1)
    {
        //Toast.makeText(context, "ALARMA", Toast.LENGTH_LONG).show();
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context, "channelID")
                .setSmallIcon(R.drawable.ic_android_black_24dp)
                .setContentTitle("Notificacion")
                .setContentText("Notificacion de alarma")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);
        NotificationManager nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        nm.notify(463434, mBuilder.build());
    }
}

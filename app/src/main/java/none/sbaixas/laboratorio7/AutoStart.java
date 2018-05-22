package none.sbaixas.laboratorio7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Sebastian on 22-05-18.
 */

public class AutoStart extends BroadcastReceiver {
    public void onReceive(Context context, Intent arg1)
    {
        Intent intent = new Intent(context, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
        Log.i("AutoStart", "started");
    }
}

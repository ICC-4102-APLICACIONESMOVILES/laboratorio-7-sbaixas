package none.sbaixas.laboratorio7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Sebastian on 22-05-18.
 */

public class AlarmStart extends BroadcastReceiver {
    public void onReceive(Context context, Intent arg1)
    {
        Toast.makeText(context, "ALARMA", Toast.LENGTH_LONG).show();
    }
}

package celsius.a360.com.bulishtrade.reciver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import celsius.a360.com.bulishtrade.MainActivity;
import celsius.a360.com.bulishtrade.service.DataPullServiceConsts;

public class BroadCastReciver extends BroadcastReceiver {


    private static BroadCastReciver _instance;


    private BroadCastReciver() {

    }

    public static BroadCastReciver getInstance()
    {
        if (_instance == null)
        {
            _instance = new BroadCastReciver();
        }
        return _instance;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getStringExtra(DataPullServiceConsts.DATA_TYPE_KEY).equalsIgnoreCase(DataPullServiceConsts.GET_MOST_ACTIVE_FROM_SPLASH_KEY)) {

            Intent intentone = new Intent(context.getApplicationContext(), MainActivity.class);
            intentone.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentone);
        }
    }
}

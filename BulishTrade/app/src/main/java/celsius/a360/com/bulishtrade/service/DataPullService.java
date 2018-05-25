package celsius.a360.com.bulishtrade.service;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

import celsius.a360.com.bulishtrade.network.NetworkHTTPRequests;


public class DataPullService extends IntentService {

    public static final String GET_QOUTES_DATA = "GET_DATA";
    private static NetworkHTTPRequests networkHTTPRequests;

    @Override
    public void onCreate() {
        super.onCreate();
        networkHTTPRequests = new NetworkHTTPRequests(getApplicationContext());

    }

    public DataPullService() {
        super("DataPullService");
    }


    public DataPullService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        if (intent.getStringExtra(DataPullServiceConsts.DATA_TYPE_KEY).equalsIgnoreCase(DataPullServiceConsts.GET_TOP_MARKETS_KEY)) {
            try{
                networkHTTPRequests.getTopMArketsApiURL();


                Intent broadcastIntent = new Intent();
                broadcastIntent.setAction(GET_QOUTES_DATA);
                broadcastIntent.putExtra(DataPullServiceConsts.DATA_TYPE_KEY, DataPullServiceConsts.GET_TOP_MARKETS_KEY);
                sendBroadcast(broadcastIntent);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

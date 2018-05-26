package celsius.a360.com.bulishtrade.service;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

import celsius.a360.com.bulishtrade.BaseActivity;
import celsius.a360.com.bulishtrade.datamodels.DataMotelTopMarkets;
import celsius.a360.com.bulishtrade.datamodels.DataModelMostActive;
import celsius.a360.com.bulishtrade.dbhelper.DatabaseHelper;
import celsius.a360.com.bulishtrade.jasonparser.JsonParser;
import celsius.a360.com.bulishtrade.network.NetworkHTTPRequests;


public class DataPullService extends IntentService {

    public static final String GET_QOUTES_DATA = "GET_DATA";
    private static NetworkHTTPRequests networkHTTPRequests;
    private static JsonParser jSONparser;
    private DatabaseHelper helper;

    @Override
    public void onCreate() {
        super.onCreate();
        networkHTTPRequests = new NetworkHTTPRequests(getApplicationContext());
        jSONparser = new JsonParser();
        helper = BaseActivity.helper;
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
            try {
                String topMarketsDataResponce = null;
                topMarketsDataResponce = networkHTTPRequests.getTopMArketsApiUrlResponce();
                DataMotelTopMarkets dataMotelTopMarkets = jSONparser.getTopMarketsDataModelFromJson(topMarketsDataResponce);


            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (intent.getStringExtra(DataPullServiceConsts.DATA_TYPE_KEY).equalsIgnoreCase(DataPullServiceConsts.GET_MOST_ACTIVE_KEY)) {

            String topActiveDataResponce = null;
            topActiveDataResponce = networkHTTPRequests.getMosActiveMArketsApiURLResponce();
            DataModelMostActive dataModelMostActive = jSONparser.getMostActiveDataModelFromJson(topActiveDataResponce);



            Intent broadcastIntent = new Intent();
            broadcastIntent.setAction(GET_QOUTES_DATA);
            broadcastIntent.putExtra(DataPullServiceConsts.DATA_TYPE_KEY, DataPullServiceConsts.GET_MOST_ACTIVE_KEY);
            sendBroadcast(broadcastIntent);
        }
    }
}

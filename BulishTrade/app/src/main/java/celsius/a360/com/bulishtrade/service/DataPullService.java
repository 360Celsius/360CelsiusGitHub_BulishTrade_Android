package celsius.a360.com.bulishtrade.service;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

import java.util.ArrayList;

import celsius.a360.com.bulishtrade.BaseActivity;
import celsius.a360.com.bulishtrade.datamodels.QuoteDataModel;
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
        if (intent.getStringExtra(DataPullServiceConsts.DATA_TYPE_KEY).equalsIgnoreCase(DataPullServiceConsts.GET_MOST_ACTIVE_FROM_SPLASH_KEY)) {

            String mostActiveDataResponce = null;
            mostActiveDataResponce = networkHTTPRequests.getMosActiveMArketsApiURLResponce();
            ArrayList<QuoteDataModel> dataModelMostActive = jSONparser.getMostActiveDataModelFromJson(mostActiveDataResponce);
            helper.bulkInsertDataToMostActiveDataTable(dataModelMostActive);

            Intent broadcastIntent = new Intent();
            broadcastIntent.setAction(GET_QOUTES_DATA);
            broadcastIntent.putExtra(DataPullServiceConsts.DATA_TYPE_KEY, DataPullServiceConsts.GET_MOST_ACTIVE_FROM_SPLASH_KEY);
            sendBroadcast(broadcastIntent);


        } else if (intent.getStringExtra(DataPullServiceConsts.DATA_TYPE_KEY).equalsIgnoreCase(DataPullServiceConsts.GET_MOST_ACTIVE_KEY)) {

            String mostActiveDataResponce = null;
            mostActiveDataResponce = networkHTTPRequests.getMosActiveMArketsApiURLResponce();
            ArrayList<QuoteDataModel> dataModelMostActive = jSONparser.getMostActiveDataModelFromJson(mostActiveDataResponce);
            helper.bulkInsertDataToMostActiveDataTable(dataModelMostActive);

            Intent broadcastIntent = new Intent();
            broadcastIntent.setAction(GET_QOUTES_DATA);
            broadcastIntent.putExtra(DataPullServiceConsts.DATA_TYPE_KEY, DataPullServiceConsts.GET_MOST_ACTIVE_KEY);
            sendBroadcast(broadcastIntent);
        }else if (intent.getStringExtra(DataPullServiceConsts.DATA_TYPE_KEY).equalsIgnoreCase(DataPullServiceConsts.GET_TOP_MARKETS_KEY)) {

            String topsDataResponce = null;
            topsDataResponce = networkHTTPRequests.getTopMArketsApiUrlResponce();
            ArrayList<QuoteDataModel> dataModelTops = jSONparser.getTopsDataModelFromJson(topsDataResponce);
            helper.bulkInsertDataToTopsDataTable(dataModelTops);

            Intent broadcastIntent = new Intent();
            broadcastIntent.setAction(GET_QOUTES_DATA);
            broadcastIntent.putExtra(DataPullServiceConsts.DATA_TYPE_KEY, DataPullServiceConsts.GET_TOP_MARKETS_KEY);
            sendBroadcast(broadcastIntent);
        }else if (intent.getStringExtra(DataPullServiceConsts.DATA_TYPE_KEY).equalsIgnoreCase(DataPullServiceConsts.GET_GAINERS_MARKETS_KEY)) {

            String gainersDataResponce = null;
            gainersDataResponce = networkHTTPRequests.getGainersMArketsApiURLResponce();
            ArrayList<QuoteDataModel> quoteDataModelGainers = jSONparser.getGainersDataModelFromJson(gainersDataResponce);
            helper.bulkInsertDataToGainersDataTable(quoteDataModelGainers);

            Intent broadcastIntent = new Intent();
            broadcastIntent.setAction(GET_QOUTES_DATA);
            broadcastIntent.putExtra(DataPullServiceConsts.DATA_TYPE_KEY, DataPullServiceConsts.GET_GAINERS_MARKETS_KEY);
            sendBroadcast(broadcastIntent);
        }else if (intent.getStringExtra(DataPullServiceConsts.DATA_TYPE_KEY).equalsIgnoreCase(DataPullServiceConsts.GET_LOSSERS_MARKETS_KEY)) {

            String losersDataResponce = null;
            losersDataResponce = networkHTTPRequests.getLosersMArketsApiURLResponce();
            ArrayList<QuoteDataModel> dataModelLosers = jSONparser.getLosersDataModelFromJson(losersDataResponce);
            helper.bulkInsertDataToLosersDataTable(dataModelLosers);

            Intent broadcastIntent = new Intent();
            broadcastIntent.setAction(GET_QOUTES_DATA);
            broadcastIntent.putExtra(DataPullServiceConsts.DATA_TYPE_KEY, DataPullServiceConsts.GET_LOSSERS_MARKETS_KEY);
            sendBroadcast(broadcastIntent);
        }else if (intent.getStringExtra(DataPullServiceConsts.DATA_TYPE_KEY).equalsIgnoreCase(DataPullServiceConsts.GET_PORTFOLIO_KEY)) {


            Intent broadcastIntent = new Intent();
            broadcastIntent.setAction(GET_QOUTES_DATA);
            broadcastIntent.putExtra(DataPullServiceConsts.DATA_TYPE_KEY, DataPullServiceConsts.GET_PORTFOLIO_KEY);
            sendBroadcast(broadcastIntent);
        }
    }
}

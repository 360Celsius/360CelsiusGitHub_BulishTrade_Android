package celsius.a360.com.bulishtrade.network;

import android.content.Context;

public class NetworkHTTPRequests {

    private static NetworkHTTPConnection networkHTTPConnection;
    private static NetworkHttpAPIurlConst networkHttpAPIurlConst;
    private Context ctx;

    public NetworkHTTPRequests(Context ctx) {
        this.networkHTTPConnection = NetworkHTTPConnection.getInstance();
        this.networkHttpAPIurlConst = NetworkHttpAPIurlConst.getInstance();
        this.ctx = ctx;
    }


    public String getTopMArketsApiUrlResponce(){
        String responce = null;
        String url = networkHttpAPIurlConst.getBasicApiUrl()+networkHttpAPIurlConst.getTopMarketsApiUrl();
        responce = networkHTTPConnection.getHttp(url);
        return responce;
    }

    public String getMosActiveMArketsApiURLResponce(){
        String responce = null;
        String url = networkHttpAPIurlConst.getBasicApiUrl()+networkHttpAPIurlConst.getMostActiveApiUrl();
        responce = networkHTTPConnection.getHttp(url);
        return responce;    }

    public String getGainersMArketsApiURLResponce(){
        String responce = null;
        String url = networkHttpAPIurlConst.getBasicApiUrl()+networkHttpAPIurlConst.getGainersMarketsApiUrl();
        responce = networkHTTPConnection.getHttp(url);
        return responce;    }

    public String getLosersMArketsApiURLResponce(){
        String responce = null;
        String url = networkHttpAPIurlConst.getBasicApiUrl()+networkHttpAPIurlConst.getLossersMarketsApiUrl();
        responce = networkHTTPConnection.getHttp(url);
        return responce;    }
}

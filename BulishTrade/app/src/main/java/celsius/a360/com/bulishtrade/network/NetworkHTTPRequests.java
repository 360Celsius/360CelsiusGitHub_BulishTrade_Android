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


    public String getTopMArketsApiURL(){
        String responce = null;
        String url = networkHttpAPIurlConst.getBasicApiUrl()+networkHttpAPIurlConst.getTopMarketsApiUrl();
        responce = networkHTTPConnection.getHttp(url);
        return responce;
    }

    public String getMosActiveMArketsApiURL(){
        String responce = null;
        String url = networkHttpAPIurlConst.getBasicApiUrl()+networkHttpAPIurlConst.getMostActiveApiUrl();
        responce = networkHTTPConnection.getHttp(url);
        return networkHttpAPIurlConst.getBasicApiUrl()+networkHttpAPIurlConst.getMostActiveApiUrl();
    }

    public String getGainersMArketsApiURL(){
        String responce = null;
        String url = networkHttpAPIurlConst.getBasicApiUrl()+networkHttpAPIurlConst.getGainersMarketsApiUrl();
        responce = networkHTTPConnection.getHttp(url);
        return networkHttpAPIurlConst.getBasicApiUrl()+networkHttpAPIurlConst.getGainersMarketsApiUrl();
    }

    public String getLosersMArketsApiURL(){
        String responce = null;
        String url = networkHttpAPIurlConst.getBasicApiUrl()+networkHttpAPIurlConst.getLossersMarketsApiUrl();
        responce = networkHTTPConnection.getHttp(url);
        return networkHttpAPIurlConst.getBasicApiUrl()+networkHttpAPIurlConst.getLossersMarketsApiUrl();
    }
}

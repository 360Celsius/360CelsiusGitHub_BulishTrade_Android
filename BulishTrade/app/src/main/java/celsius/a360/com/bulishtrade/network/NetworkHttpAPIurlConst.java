package celsius.a360.com.bulishtrade.network;

public class NetworkHttpAPIurlConst {

    private static String BASIC_API_URL = "https://ws-api.iextrading.com/1.0";

    private static String TOP_MARKETS_API_URL = "/tops";
    private static String MOST_ACTIVE_API_URL = "/stock/market/list/mostactive";
    private static String GAINERS_MARKETS_API_URL = "/stock/market/list/gainers";
    private static String LOSSERS_MARKETS_API_URL = "/stock/market/list/losers";

    private static NetworkHttpAPIurlConst _instance;


    private NetworkHttpAPIurlConst()
    {

    }

    public static NetworkHttpAPIurlConst getInstance()
    {
        if (_instance == null)
        {
            _instance = new NetworkHttpAPIurlConst();
        }
        return _instance;
    }

    public static String getBasicApiUrl() {
        return BASIC_API_URL;
    }

    public static String getTopMarketsApiUrl() {
        return TOP_MARKETS_API_URL;
    }

    public static String getMostActiveApiUrl() {
        return MOST_ACTIVE_API_URL;
    }

    public static String getGainersMarketsApiUrl() {
        return GAINERS_MARKETS_API_URL;
    }

    public static String getLossersMarketsApiUrl() {
        return LOSSERS_MARKETS_API_URL;
    }
}

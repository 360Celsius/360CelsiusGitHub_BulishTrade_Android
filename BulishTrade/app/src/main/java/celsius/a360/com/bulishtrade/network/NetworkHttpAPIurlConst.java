package celsius.a360.com.bulishtrade.network;

public class NetworkHttpAPIurlConst {

    private static String BASIC_API_URL = "https://bulishtrading.000webhostapp.com/Api/api.php?requestType=";

    private static String TOP_MARKETS_API_URL = "getTops";
    private static String MOST_ACTIVE_API_URL = "getMostActive";
    private static String GAINERS_MARKETS_API_URL = "getGainers";
    private static String LOSSERS_MARKETS_API_URL = "getLossers";

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

package celsius.a360.com.bulishtrade.dbhelper;

import android.net.Uri;
import android.provider.BaseColumns;

import java.util.Locale;

public class DatabaseHelperContract {

    public static final String packageName = "celsius.a360.com.bulishtrade";
    public static final String AUTHORITY = packageName + ".provider";
    public static final String CONTENT_BASE = "content://"+AUTHORITY+"/%s";

    private DatabaseHelperContract() {}

    //=============================TopMarketsDataTable========================================
    /* Inner class that defines the table contents */
    public static class TopMarketsDataTable implements BaseColumns {

        public static final String URI_SUFFIX = "tops_data";
        public static final Uri CONTENT_URI = Uri.parse(String.format(Locale.US,CONTENT_BASE, URI_SUFFIX));

        public static final String TABLE_NAME = "tops_data";

        public static final String COLUMN_NAME_SYMBOL = "symbol";
        public static final String COLUMN_NAME_COMPANY_NAME = "companyName";
        public static final String COLUMN_NAME_PRIMARY_EXCAHNE = "primaryExchange";
        public static final String COLUMN_NAME_SECTOR = "sector";
        public static final String COLUMN_NAME_CALCULATION_PRICE = "calculationPrice";
        public static final String COLUMN_NAME_OPEN = "open";
        public static final String COLUMN_NAME_OPEN_TIME = "openTime";
        public static final String COLUMN_NAME_CLOSE = "close";
        public static final String COLUMN_NAME_CLOSE_TIME = "closeTime";
        public static final String COLUMN_NAME_HIGH = "high";
        public static final String COLUMN_NAME_LOW = "low";
        public static final String COLUMN_NAME_LAST_PRICE = "latestPrice";
        public static final String COLUMN_NAME_LAST_SOURCE = "latestSource";
        public static final String COLUMN_NAME_LAST_TIME = "latestTime";
        public static final String COLUMN_NAME_LATEST_UPDATE = "latestUpdate";
        public static final String COLUMN_NAME_LATEST_VOLUME = "latestVolume";
        public static final String COLUMN_NAME_IEX_REAL_TIME_PRICE = "iexRealtimePrice";
        public static final String COLUMN_NAME_IEX_REAL_TIME_SIZE = "iexRealtimeSize";
        public static final String COLUMN_NAME_IEX_LAST_UPDATED = "iexLastUpdated";
        public static final String COLUMN_NAME_DAYLY_PRICE = "delayedPrice";
        public static final String COLUMN_NAME_DAILY_PRICE_TIME = "delayedPriceTime";
        public static final String COLUMN_NAME_EXTENDED_PRICE = "extendedPrice";
        public static final String COLUMN_NAME_EXTENDED_CHANGE = "extendedChange";
        public static final String COLUMN_NAME_EXTENDED_CHANGE_PERCENT = "extendedChangePercent";
        public static final String COLUMN_NAME_EXTENDED_PRICE_TIME = "extendedPriceTime";
        public static final String COLUMN_NAME_EXTENDED_CLOSE = "previousClose";
        public static final String COLUMN_NAME_CHANGE = "change";
        public static final String COLUMN_NAME_CHANGE_PERCENT = "changePercent";
        public static final String COLUMN_NAME_IEX_MARKET_PERCENT = "iexMarketPercent";
        public static final String COLUMN_NAME_IEX_VOLUME = "iexVolume";
        public static final String COLUMN_NAME_AVG_TOTAL_VOLUME = "avgTotalVolume";
        public static final String COLUMN_NAME_IEX_BID_PRICE = "iexBidPrice";
        public static final String COLUMN_NAME_IEX_BID_SIZE = "iexBidSize";
        public static final String COLUMN_NAME_IEX_ASK_PRICE = "iexAskPrice";
        public static final String COLUMN_NAME_IEX_ASK_SIZE = "iexAskSize";
        public static final String COLUMN_NAME_MARKE_TCUP = "marketCap";
        public static final String COLUMN_NAME_PE_RRATIO = "peRatio";
        public static final String COLUMN_NAME_WEEK_52_HIGH = "week52High";
        public static final String COLUMN_NAME_WEEK_52_LOW = "week52Low";
        public static final String COLUMN_NAME_YTD_CHANGE = "ytdChange";
    }

    public static final String SQL_CREATE_TOPS_DATA_TABLE =
            "CREATE TABLE " + TopMarketsDataTable.TABLE_NAME + " (" +
                    TopMarketsDataTable._ID + " INTEGER PRIMARY KEY," +
                    TopMarketsDataTable.COLUMN_NAME_SYMBOL + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_COMPANY_NAME + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_PRIMARY_EXCAHNE + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_SECTOR + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_CALCULATION_PRICE + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_OPEN + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_OPEN_TIME + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_CLOSE + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_CLOSE_TIME + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_HIGH + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_LOW + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_LAST_PRICE + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_LAST_SOURCE + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_LAST_TIME + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_LATEST_UPDATE + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_LATEST_VOLUME + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_IEX_REAL_TIME_PRICE + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_IEX_REAL_TIME_SIZE + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_IEX_LAST_UPDATED + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_DAYLY_PRICE + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_DAILY_PRICE_TIME + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_EXTENDED_PRICE + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_EXTENDED_CHANGE + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_EXTENDED_CHANGE_PERCENT + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_EXTENDED_PRICE_TIME + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_EXTENDED_CLOSE + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_CHANGE + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_CHANGE_PERCENT + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_IEX_MARKET_PERCENT + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_IEX_VOLUME + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_AVG_TOTAL_VOLUME + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_IEX_BID_PRICE + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_IEX_BID_SIZE + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_IEX_ASK_PRICE + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_IEX_ASK_SIZE + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_MARKE_TCUP + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_PE_RRATIO + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_WEEK_52_HIGH + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_WEEK_52_LOW + " TEXT," +
                    TopMarketsDataTable.COLUMN_NAME_YTD_CHANGE + " TEXT)";

    public static final String SQL_DELETE_TOPS_DATA_TABLE =
            "DROP TABLE IF EXISTS " + TopMarketsDataTable.TABLE_NAME;

    public static final String SQL_SELECT_TOPS_DATA_TABLE =
            "SELECT  * FROM " + TopMarketsDataTable.TABLE_NAME + " WHERE "+ TopMarketsDataTable._ID;


    //=============================MostActiveDataTable========================================
    /* Inner class that defines the table contents */
    public static class MostActiveDataTable implements BaseColumns {

        public static final String URI_SUFFIX = "most_active_data";
        public static final Uri CONTENT_URI = Uri.parse(String.format(Locale.US,CONTENT_BASE, URI_SUFFIX));

        public static final String TABLE_NAME = "most_active_data";

        public static final String COLUMN_NAME_SYMBOL = "symbol";
        public static final String COLUMN_NAME_COMPANY_NAME = "companyName";
        public static final String COLUMN_NAME_PRIMARY_EXCAHNE = "primaryExchange";
        public static final String COLUMN_NAME_SECTOR = "sector";
        public static final String COLUMN_NAME_CALCULATION_PRICE = "calculationPrice";
        public static final String COLUMN_NAME_OPEN = "open";
        public static final String COLUMN_NAME_OPEN_TIME = "openTime";
        public static final String COLUMN_NAME_CLOSE = "close";
        public static final String COLUMN_NAME_CLOSE_TIME = "closeTime";
        public static final String COLUMN_NAME_HIGH = "high";
        public static final String COLUMN_NAME_LOW = "low";
        public static final String COLUMN_NAME_LAST_PRICE = "latestPrice";
        public static final String COLUMN_NAME_LAST_SOURCE = "latestSource";
        public static final String COLUMN_NAME_LAST_TIME = "latestTime";
        public static final String COLUMN_NAME_LATEST_UPDATE = "latestUpdate";
        public static final String COLUMN_NAME_LATEST_VOLUME = "latestVolume";
        public static final String COLUMN_NAME_IEX_REAL_TIME_PRICE = "iexRealtimePrice";
        public static final String COLUMN_NAME_IEX_REAL_TIME_SIZE = "iexRealtimeSize";
        public static final String COLUMN_NAME_IEX_LAST_UPDATED = "iexLastUpdated";
        public static final String COLUMN_NAME_DAYLY_PRICE = "delayedPrice";
        public static final String COLUMN_NAME_DAILY_PRICE_TIME = "delayedPriceTime";
        public static final String COLUMN_NAME_EXTENDED_PRICE = "extendedPrice";
        public static final String COLUMN_NAME_EXTENDED_CHANGE = "extendedChange";
        public static final String COLUMN_NAME_EXTENDED_CHANGE_PERCENT = "extendedChangePercent";
        public static final String COLUMN_NAME_EXTENDED_PRICE_TIME = "extendedPriceTime";
        public static final String COLUMN_NAME_EXTENDED_CLOSE = "previousClose";
        public static final String COLUMN_NAME_CHANGE = "change";
        public static final String COLUMN_NAME_CHANGE_PERCENT = "changePercent";
        public static final String COLUMN_NAME_IEX_MARKET_PERCENT = "iexMarketPercent";
        public static final String COLUMN_NAME_IEX_VOLUME = "iexVolume";
        public static final String COLUMN_NAME_AVG_TOTAL_VOLUME = "avgTotalVolume";
        public static final String COLUMN_NAME_IEX_BID_PRICE = "iexBidPrice";
        public static final String COLUMN_NAME_IEX_BID_SIZE = "iexBidSize";
        public static final String COLUMN_NAME_IEX_ASK_PRICE = "iexAskPrice";
        public static final String COLUMN_NAME_IEX_ASK_SIZE = "iexAskSize";
        public static final String COLUMN_NAME_MARKE_TCUP = "marketCap";
        public static final String COLUMN_NAME_PE_RRATIO = "peRatio";
        public static final String COLUMN_NAME_WEEK_52_HIGH = "week52High";
        public static final String COLUMN_NAME_WEEK_52_LOW = "week52Low";
        public static final String COLUMN_NAME_YTD_CHANGE = "ytdChange";

    }



    public static final String SQL_CREATE_MOST_ACTIVE_DATA_TABLE =
            "CREATE TABLE " + MostActiveDataTable.TABLE_NAME + " (" +
                    MostActiveDataTable._ID + " INTEGER PRIMARY KEY," +
                    MostActiveDataTable.COLUMN_NAME_SYMBOL + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_COMPANY_NAME + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_PRIMARY_EXCAHNE + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_SECTOR + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_CALCULATION_PRICE + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_OPEN + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_OPEN_TIME + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_CLOSE + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_CLOSE_TIME + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_HIGH + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_LOW + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_LAST_PRICE + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_LAST_SOURCE + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_LAST_TIME + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_LATEST_UPDATE + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_LATEST_VOLUME + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_IEX_REAL_TIME_PRICE + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_IEX_REAL_TIME_SIZE + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_IEX_LAST_UPDATED + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_DAYLY_PRICE + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_DAILY_PRICE_TIME + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_EXTENDED_PRICE + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_EXTENDED_CHANGE + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_EXTENDED_CHANGE_PERCENT + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_EXTENDED_PRICE_TIME + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_EXTENDED_CLOSE + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_CHANGE + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_CHANGE_PERCENT + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_IEX_MARKET_PERCENT + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_IEX_VOLUME + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_AVG_TOTAL_VOLUME + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_IEX_BID_PRICE + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_IEX_BID_SIZE + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_IEX_ASK_PRICE + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_IEX_ASK_SIZE + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_MARKE_TCUP + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_PE_RRATIO + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_WEEK_52_HIGH + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_WEEK_52_LOW + " TEXT," +
                    MostActiveDataTable.COLUMN_NAME_YTD_CHANGE + " TEXT)";

    public static final String SQL_DELETE_MOST_ACTIVE_DATA_TABLE =
            "DROP TABLE IF EXISTS " + MostActiveDataTable.TABLE_NAME;

    public static final String SQL_SELECT_MOST_ACTIVE_DATA_TABLE =
            "SELECT  * FROM " + MostActiveDataTable.TABLE_NAME + " WHERE "+ MostActiveDataTable._ID;

    public static final String SQL_SELECT_CATEGORIES_FROM_DATA_TABLE =
            "SELECT DISTINCT sector FROM " + MostActiveDataTable.TABLE_NAME;

    //=============================GainersDataTable========================================
    /* Inner class that defines the table contents */
    public static class GainersDataTable implements BaseColumns {

        public static final String URI_SUFFIX = "gainers_data";
        public static final Uri CONTENT_URI = Uri.parse(String.format(Locale.US,CONTENT_BASE, URI_SUFFIX));

        public static final String TABLE_NAME = "gainers_data";

        public static final String COLUMN_NAME_SYMBOL = "symbol";
        public static final String COLUMN_NAME_COMPANY_NAME = "companyName";
        public static final String COLUMN_NAME_PRIMARY_EXCAHNE = "primaryExchange";
        public static final String COLUMN_NAME_SECTOR = "sector";
        public static final String COLUMN_NAME_CALCULATION_PRICE = "calculationPrice";
        public static final String COLUMN_NAME_OPEN = "open";
        public static final String COLUMN_NAME_OPEN_TIME = "openTime";
        public static final String COLUMN_NAME_CLOSE = "close";
        public static final String COLUMN_NAME_CLOSE_TIME = "closeTime";
        public static final String COLUMN_NAME_HIGH = "high";
        public static final String COLUMN_NAME_LOW = "low";
        public static final String COLUMN_NAME_LAST_PRICE = "latestPrice";
        public static final String COLUMN_NAME_LAST_SOURCE = "latestSource";
        public static final String COLUMN_NAME_LAST_TIME = "latestTime";
        public static final String COLUMN_NAME_LATEST_UPDATE = "latestUpdate";
        public static final String COLUMN_NAME_LATEST_VOLUME = "latestVolume";
        public static final String COLUMN_NAME_IEX_REAL_TIME_PRICE = "iexRealtimePrice";
        public static final String COLUMN_NAME_IEX_REAL_TIME_SIZE = "iexRealtimeSize";
        public static final String COLUMN_NAME_IEX_LAST_UPDATED = "iexLastUpdated";
        public static final String COLUMN_NAME_DAYLY_PRICE = "delayedPrice";
        public static final String COLUMN_NAME_DAILY_PRICE_TIME = "delayedPriceTime";
        public static final String COLUMN_NAME_EXTENDED_PRICE = "extendedPrice";
        public static final String COLUMN_NAME_EXTENDED_CHANGE = "extendedChange";
        public static final String COLUMN_NAME_EXTENDED_CHANGE_PERCENT = "extendedChangePercent";
        public static final String COLUMN_NAME_EXTENDED_PRICE_TIME = "extendedPriceTime";
        public static final String COLUMN_NAME_EXTENDED_CLOSE = "previousClose";
        public static final String COLUMN_NAME_CHANGE = "change";
        public static final String COLUMN_NAME_CHANGE_PERCENT = "changePercent";
        public static final String COLUMN_NAME_IEX_MARKET_PERCENT = "iexMarketPercent";
        public static final String COLUMN_NAME_IEX_VOLUME = "iexVolume";
        public static final String COLUMN_NAME_AVG_TOTAL_VOLUME = "avgTotalVolume";
        public static final String COLUMN_NAME_IEX_BID_PRICE = "iexBidPrice";
        public static final String COLUMN_NAME_IEX_BID_SIZE = "iexBidSize";
        public static final String COLUMN_NAME_IEX_ASK_PRICE = "iexAskPrice";
        public static final String COLUMN_NAME_IEX_ASK_SIZE = "iexAskSize";
        public static final String COLUMN_NAME_MARKE_TCUP = "marketCap";
        public static final String COLUMN_NAME_PE_RRATIO = "peRatio";
        public static final String COLUMN_NAME_WEEK_52_HIGH = "week52High";
        public static final String COLUMN_NAME_WEEK_52_LOW = "week52Low";
        public static final String COLUMN_NAME_YTD_CHANGE = "ytdChange";

    }



    public static final String SQL_CREATE_GAINERS_DATA_TABLE =
            "CREATE TABLE " + GainersDataTable.TABLE_NAME + " (" +
                    GainersDataTable._ID + " INTEGER PRIMARY KEY," +
                    GainersDataTable.COLUMN_NAME_SYMBOL + " TEXT," +
                    GainersDataTable.COLUMN_NAME_COMPANY_NAME + " TEXT," +
                    GainersDataTable.COLUMN_NAME_PRIMARY_EXCAHNE + " TEXT," +
                    GainersDataTable.COLUMN_NAME_SECTOR + " TEXT," +
                    GainersDataTable.COLUMN_NAME_CALCULATION_PRICE + " TEXT," +
                    GainersDataTable.COLUMN_NAME_OPEN + " TEXT," +
                    GainersDataTable.COLUMN_NAME_OPEN_TIME + " TEXT," +
                    GainersDataTable.COLUMN_NAME_CLOSE + " TEXT," +
                    GainersDataTable.COLUMN_NAME_CLOSE_TIME + " TEXT," +
                    GainersDataTable.COLUMN_NAME_HIGH + " TEXT," +
                    GainersDataTable.COLUMN_NAME_LOW + " TEXT," +
                    GainersDataTable.COLUMN_NAME_LAST_PRICE + " TEXT," +
                    GainersDataTable.COLUMN_NAME_LAST_SOURCE + " TEXT," +
                    GainersDataTable.COLUMN_NAME_LAST_TIME + " TEXT," +
                    GainersDataTable.COLUMN_NAME_LATEST_UPDATE + " TEXT," +
                    GainersDataTable.COLUMN_NAME_LATEST_VOLUME + " TEXT," +
                    GainersDataTable.COLUMN_NAME_IEX_REAL_TIME_PRICE + " TEXT," +
                    GainersDataTable.COLUMN_NAME_IEX_REAL_TIME_SIZE + " TEXT," +
                    GainersDataTable.COLUMN_NAME_IEX_LAST_UPDATED + " TEXT," +
                    GainersDataTable.COLUMN_NAME_DAYLY_PRICE + " TEXT," +
                    GainersDataTable.COLUMN_NAME_DAILY_PRICE_TIME + " TEXT," +
                    GainersDataTable.COLUMN_NAME_EXTENDED_PRICE + " TEXT," +
                    GainersDataTable.COLUMN_NAME_EXTENDED_CHANGE + " TEXT," +
                    GainersDataTable.COLUMN_NAME_EXTENDED_CHANGE_PERCENT + " TEXT," +
                    GainersDataTable.COLUMN_NAME_EXTENDED_PRICE_TIME + " TEXT," +
                    GainersDataTable.COLUMN_NAME_EXTENDED_CLOSE + " TEXT," +
                    GainersDataTable.COLUMN_NAME_CHANGE + " TEXT," +
                    GainersDataTable.COLUMN_NAME_CHANGE_PERCENT + " TEXT," +
                    GainersDataTable.COLUMN_NAME_IEX_MARKET_PERCENT + " TEXT," +
                    GainersDataTable.COLUMN_NAME_IEX_VOLUME + " TEXT," +
                    GainersDataTable.COLUMN_NAME_AVG_TOTAL_VOLUME + " TEXT," +
                    GainersDataTable.COLUMN_NAME_IEX_BID_PRICE + " TEXT," +
                    GainersDataTable.COLUMN_NAME_IEX_BID_SIZE + " TEXT," +
                    GainersDataTable.COLUMN_NAME_IEX_ASK_PRICE + " TEXT," +
                    GainersDataTable.COLUMN_NAME_IEX_ASK_SIZE + " TEXT," +
                    GainersDataTable.COLUMN_NAME_MARKE_TCUP + " TEXT," +
                    GainersDataTable.COLUMN_NAME_PE_RRATIO + " TEXT," +
                    GainersDataTable.COLUMN_NAME_WEEK_52_HIGH + " TEXT," +
                    GainersDataTable.COLUMN_NAME_WEEK_52_LOW + " TEXT," +
                    GainersDataTable.COLUMN_NAME_YTD_CHANGE + " TEXT)";

    public static final String SQL_DELETE_GAINERS_DATA_TABLE =
            "DROP TABLE IF EXISTS " + GainersDataTable.TABLE_NAME;

    public static final String SQL_SELECT_GAINERS_DATA_TABLE =
            "SELECT  * FROM " + GainersDataTable.TABLE_NAME + " WHERE "+ GainersDataTable._ID;


    //=============================LosersDataTable========================================
    /* Inner class that defines the table contents */
    public static class LosersDataTable implements BaseColumns {

        public static final String URI_SUFFIX = "losers_data";
        public static final Uri CONTENT_URI = Uri.parse(String.format(Locale.US,CONTENT_BASE, URI_SUFFIX));

        public static final String TABLE_NAME = "losers_data";

        public static final String COLUMN_NAME_SYMBOL = "symbol";
        public static final String COLUMN_NAME_COMPANY_NAME = "companyName";
        public static final String COLUMN_NAME_PRIMARY_EXCAHNE = "primaryExchange";
        public static final String COLUMN_NAME_SECTOR = "sector";
        public static final String COLUMN_NAME_CALCULATION_PRICE = "calculationPrice";
        public static final String COLUMN_NAME_OPEN = "open";
        public static final String COLUMN_NAME_OPEN_TIME = "openTime";
        public static final String COLUMN_NAME_CLOSE = "close";
        public static final String COLUMN_NAME_CLOSE_TIME = "closeTime";
        public static final String COLUMN_NAME_HIGH = "high";
        public static final String COLUMN_NAME_LOW = "low";
        public static final String COLUMN_NAME_LAST_PRICE = "latestPrice";
        public static final String COLUMN_NAME_LAST_SOURCE = "latestSource";
        public static final String COLUMN_NAME_LAST_TIME = "latestTime";
        public static final String COLUMN_NAME_LATEST_UPDATE = "latestUpdate";
        public static final String COLUMN_NAME_LATEST_VOLUME = "latestVolume";
        public static final String COLUMN_NAME_IEX_REAL_TIME_PRICE = "iexRealtimePrice";
        public static final String COLUMN_NAME_IEX_REAL_TIME_SIZE = "iexRealtimeSize";
        public static final String COLUMN_NAME_IEX_LAST_UPDATED = "iexLastUpdated";
        public static final String COLUMN_NAME_DAYLY_PRICE = "delayedPrice";
        public static final String COLUMN_NAME_DAILY_PRICE_TIME = "delayedPriceTime";
        public static final String COLUMN_NAME_EXTENDED_PRICE = "extendedPrice";
        public static final String COLUMN_NAME_EXTENDED_CHANGE = "extendedChange";
        public static final String COLUMN_NAME_EXTENDED_CHANGE_PERCENT = "extendedChangePercent";
        public static final String COLUMN_NAME_EXTENDED_PRICE_TIME = "extendedPriceTime";
        public static final String COLUMN_NAME_EXTENDED_CLOSE = "previousClose";
        public static final String COLUMN_NAME_CHANGE = "change";
        public static final String COLUMN_NAME_CHANGE_PERCENT = "changePercent";
        public static final String COLUMN_NAME_IEX_MARKET_PERCENT = "iexMarketPercent";
        public static final String COLUMN_NAME_IEX_VOLUME = "iexVolume";
        public static final String COLUMN_NAME_AVG_TOTAL_VOLUME = "avgTotalVolume";
        public static final String COLUMN_NAME_IEX_BID_PRICE = "iexBidPrice";
        public static final String COLUMN_NAME_IEX_BID_SIZE = "iexBidSize";
        public static final String COLUMN_NAME_IEX_ASK_PRICE = "iexAskPrice";
        public static final String COLUMN_NAME_IEX_ASK_SIZE = "iexAskSize";
        public static final String COLUMN_NAME_MARKE_TCUP = "marketCap";
        public static final String COLUMN_NAME_PE_RRATIO = "peRatio";
        public static final String COLUMN_NAME_WEEK_52_HIGH = "week52High";
        public static final String COLUMN_NAME_WEEK_52_LOW = "week52Low";
        public static final String COLUMN_NAME_YTD_CHANGE = "ytdChange";

    }



    public static final String SQL_CREATE_LOSERS_DATA_TABLE =
            "CREATE TABLE " + LosersDataTable.TABLE_NAME + " (" +
                    LosersDataTable._ID + " INTEGER PRIMARY KEY," +
                    LosersDataTable.COLUMN_NAME_SYMBOL + " TEXT," +
                    LosersDataTable.COLUMN_NAME_COMPANY_NAME + " TEXT," +
                    LosersDataTable.COLUMN_NAME_PRIMARY_EXCAHNE + " TEXT," +
                    LosersDataTable.COLUMN_NAME_SECTOR + " TEXT," +
                    LosersDataTable.COLUMN_NAME_CALCULATION_PRICE + " TEXT," +
                    LosersDataTable.COLUMN_NAME_OPEN + " TEXT," +
                    LosersDataTable.COLUMN_NAME_OPEN_TIME + " TEXT," +
                    LosersDataTable.COLUMN_NAME_CLOSE + " TEXT," +
                    LosersDataTable.COLUMN_NAME_CLOSE_TIME + " TEXT," +
                    LosersDataTable.COLUMN_NAME_HIGH + " TEXT," +
                    LosersDataTable.COLUMN_NAME_LOW + " TEXT," +
                    LosersDataTable.COLUMN_NAME_LAST_PRICE + " TEXT," +
                    LosersDataTable.COLUMN_NAME_LAST_SOURCE + " TEXT," +
                    LosersDataTable.COLUMN_NAME_LAST_TIME + " TEXT," +
                    LosersDataTable.COLUMN_NAME_LATEST_UPDATE + " TEXT," +
                    LosersDataTable.COLUMN_NAME_LATEST_VOLUME + " TEXT," +
                    LosersDataTable.COLUMN_NAME_IEX_REAL_TIME_PRICE + " TEXT," +
                    LosersDataTable.COLUMN_NAME_IEX_REAL_TIME_SIZE + " TEXT," +
                    LosersDataTable.COLUMN_NAME_IEX_LAST_UPDATED + " TEXT," +
                    LosersDataTable.COLUMN_NAME_DAYLY_PRICE + " TEXT," +
                    LosersDataTable.COLUMN_NAME_DAILY_PRICE_TIME + " TEXT," +
                    LosersDataTable.COLUMN_NAME_EXTENDED_PRICE + " TEXT," +
                    LosersDataTable.COLUMN_NAME_EXTENDED_CHANGE + " TEXT," +
                    LosersDataTable.COLUMN_NAME_EXTENDED_CHANGE_PERCENT + " TEXT," +
                    LosersDataTable.COLUMN_NAME_EXTENDED_PRICE_TIME + " TEXT," +
                    LosersDataTable.COLUMN_NAME_EXTENDED_CLOSE + " TEXT," +
                    LosersDataTable.COLUMN_NAME_CHANGE + " TEXT," +
                    LosersDataTable.COLUMN_NAME_CHANGE_PERCENT + " TEXT," +
                    LosersDataTable.COLUMN_NAME_IEX_MARKET_PERCENT + " TEXT," +
                    LosersDataTable.COLUMN_NAME_IEX_VOLUME + " TEXT," +
                    LosersDataTable.COLUMN_NAME_AVG_TOTAL_VOLUME + " TEXT," +
                    LosersDataTable.COLUMN_NAME_IEX_BID_PRICE + " TEXT," +
                    LosersDataTable.COLUMN_NAME_IEX_BID_SIZE + " TEXT," +
                    LosersDataTable.COLUMN_NAME_IEX_ASK_PRICE + " TEXT," +
                    LosersDataTable.COLUMN_NAME_IEX_ASK_SIZE + " TEXT," +
                    LosersDataTable.COLUMN_NAME_MARKE_TCUP + " TEXT," +
                    LosersDataTable.COLUMN_NAME_PE_RRATIO + " TEXT," +
                    LosersDataTable.COLUMN_NAME_WEEK_52_HIGH + " TEXT," +
                    LosersDataTable.COLUMN_NAME_WEEK_52_LOW + " TEXT," +
                    LosersDataTable.COLUMN_NAME_YTD_CHANGE + " TEXT)";

    public static final String SQL_DELETE_LOSERS_DATA_TABLE =
            "DROP TABLE IF EXISTS " + LosersDataTable.TABLE_NAME;

    public static final String SQL_SELECT_LOSERS_DATA_TABLE =
            "SELECT  * FROM " + LosersDataTable.TABLE_NAME + " WHERE "+ LosersDataTable._ID;



    //=============================PortfolioDataTable========================================
    /* Inner class that defines the table contents */
    public static class PortfolioDataTable implements BaseColumns {

        public static final String URI_SUFFIX = "portfolio_data";
        public static final Uri CONTENT_URI = Uri.parse(String.format(Locale.US,CONTENT_BASE, URI_SUFFIX));

        public static final String TABLE_NAME = "portfolio_data";

        public static final String COLUMN_NAME_SYMBOL = "symbol";
        public static final String COLUMN_NAME_COMPANY_NAME = "companyName";
        public static final String COLUMN_NAME_PRIMARY_EXCAHNE = "primaryExchange";
        public static final String COLUMN_NAME_SECTOR = "sector";
        public static final String COLUMN_NAME_CALCULATION_PRICE = "calculationPrice";
        public static final String COLUMN_NAME_OPEN = "open";
        public static final String COLUMN_NAME_OPEN_TIME = "openTime";
        public static final String COLUMN_NAME_CLOSE = "close";
        public static final String COLUMN_NAME_CLOSE_TIME = "closeTime";
        public static final String COLUMN_NAME_HIGH = "high";
        public static final String COLUMN_NAME_LOW = "low";
        public static final String COLUMN_NAME_LAST_PRICE = "latestPrice";
        public static final String COLUMN_NAME_LAST_SOURCE = "latestSource";
        public static final String COLUMN_NAME_LAST_TIME = "latestTime";
        public static final String COLUMN_NAME_LATEST_UPDATE = "latestUpdate";
        public static final String COLUMN_NAME_LATEST_VOLUME = "latestVolume";
        public static final String COLUMN_NAME_IEX_REAL_TIME_PRICE = "iexRealtimePrice";
        public static final String COLUMN_NAME_IEX_REAL_TIME_SIZE = "iexRealtimeSize";
        public static final String COLUMN_NAME_IEX_LAST_UPDATED = "iexLastUpdated";
        public static final String COLUMN_NAME_DAYLY_PRICE = "delayedPrice";
        public static final String COLUMN_NAME_DAILY_PRICE_TIME = "delayedPriceTime";
        public static final String COLUMN_NAME_EXTENDED_PRICE = "extendedPrice";
        public static final String COLUMN_NAME_EXTENDED_CHANGE = "extendedChange";
        public static final String COLUMN_NAME_EXTENDED_CHANGE_PERCENT = "extendedChangePercent";
        public static final String COLUMN_NAME_EXTENDED_PRICE_TIME = "extendedPriceTime";
        public static final String COLUMN_NAME_EXTENDED_CLOSE = "previousClose";
        public static final String COLUMN_NAME_CHANGE = "change";
        public static final String COLUMN_NAME_CHANGE_PERCENT = "changePercent";
        public static final String COLUMN_NAME_IEX_MARKET_PERCENT = "iexMarketPercent";
        public static final String COLUMN_NAME_IEX_VOLUME = "iexVolume";
        public static final String COLUMN_NAME_AVG_TOTAL_VOLUME = "avgTotalVolume";
        public static final String COLUMN_NAME_IEX_BID_PRICE = "iexBidPrice";
        public static final String COLUMN_NAME_IEX_BID_SIZE = "iexBidSize";
        public static final String COLUMN_NAME_IEX_ASK_PRICE = "iexAskPrice";
        public static final String COLUMN_NAME_IEX_ASK_SIZE = "iexAskSize";
        public static final String COLUMN_NAME_MARKE_TCUP = "marketCap";
        public static final String COLUMN_NAME_PE_RRATIO = "peRatio";
        public static final String COLUMN_NAME_WEEK_52_HIGH = "week52High";
        public static final String COLUMN_NAME_WEEK_52_LOW = "week52Low";
        public static final String COLUMN_NAME_YTD_CHANGE = "ytdChange";

    }



    public static final String SQL_CREATE_PORTFOLIO_DATA_TABLE =
            "CREATE TABLE " + PortfolioDataTable.TABLE_NAME + " (" +
                    PortfolioDataTable._ID + " INTEGER PRIMARY KEY," +
                    PortfolioDataTable.COLUMN_NAME_SYMBOL + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_COMPANY_NAME + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_PRIMARY_EXCAHNE + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_SECTOR + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_CALCULATION_PRICE + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_OPEN + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_OPEN_TIME + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_CLOSE + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_CLOSE_TIME + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_HIGH + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_LOW + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_LAST_PRICE + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_LAST_SOURCE + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_LAST_TIME + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_LATEST_UPDATE + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_LATEST_VOLUME + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_IEX_REAL_TIME_PRICE + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_IEX_REAL_TIME_SIZE + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_IEX_LAST_UPDATED + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_DAYLY_PRICE + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_DAILY_PRICE_TIME + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_EXTENDED_PRICE + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_EXTENDED_CHANGE + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_EXTENDED_CHANGE_PERCENT + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_EXTENDED_PRICE_TIME + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_EXTENDED_CLOSE + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_CHANGE + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_CHANGE_PERCENT + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_IEX_MARKET_PERCENT + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_IEX_VOLUME + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_AVG_TOTAL_VOLUME + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_IEX_BID_PRICE + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_IEX_BID_SIZE + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_IEX_ASK_PRICE + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_IEX_ASK_SIZE + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_MARKE_TCUP + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_PE_RRATIO + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_WEEK_52_HIGH + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_WEEK_52_LOW + " TEXT," +
                    PortfolioDataTable.COLUMN_NAME_YTD_CHANGE + " TEXT)";

    public static final String SQL_DELETE_PORTFOLIO_DATA_TABLE =
            "DROP TABLE IF EXISTS " + PortfolioDataTable.TABLE_NAME;

    public static final String SQL_SELECT_PORTFOLIO_DATA_TABLE =
            "SELECT  * FROM " + PortfolioDataTable.TABLE_NAME + " WHERE "+ PortfolioDataTable._ID;

}



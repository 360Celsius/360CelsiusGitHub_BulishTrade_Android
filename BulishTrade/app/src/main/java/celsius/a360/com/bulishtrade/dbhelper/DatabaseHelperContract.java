package celsius.a360.com.bulishtrade.dbhelper;

import android.net.Uri;
import android.provider.BaseColumns;

import java.util.Locale;

public class DatabaseHelperContract {

    public static final String packageName = "com.a360.celsius.stocksalmanac";
    public static final String AUTHORITY = packageName + ".provider";
    public static final String CONTENT_BASE = "content://"+AUTHORITY+"/%s";

    private DatabaseHelperContract() {}

    //=============================MATERIALS========================================
    /* Inner class that defines the table contents */
    public static class MaterialsQuotesDataTableContents implements BaseColumns {

        public static final String URI_SUFFIX = "materials_qoutes_data";
        public static final Uri CONTENT_URI = Uri.parse(String.format(Locale.US,CONTENT_BASE, URI_SUFFIX));

        public static final String TABLE_NAME = "materials_qoutes_data";
        public static final String COLUMN_NAME_SYMBOL = "symbol";
        public static final String COLUMN_NAME_EXCHANGE = "exchange";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_DAYCODE = "dayCode";
        public static final String COLUMN_NAME_SERVERTIMESTAMP = "serverTimestamp";
        public static final String COLUMN_NAME_MODE = "mode";
        public static final String COLUMN_NAME_LASTPRICE = "lastPrice";
        public static final String COLUMN_NAME_TRADETIMESTAMP = "tradeTimestamp";
        public static final String COLUMN_NAME_NETCHANGE = "netChange";
        public static final String COLUMN_NAME_PERSENTCHANGE = "percentChange";
        public static final String COLUMN_NAME_UNITCODE = "unitCode";
        public static final String COLUMN_NAME_OPEN = "open";
        public static final String COLUMN_NAME_HIGH = "high";
        public static final String COLUMN_NAME_LOW = "low";
        public static final String COLUMN_NAME_CLOSE = "close";
        public static final String COLUMN_NAME_FLAG = "flag";
        public static final String COLUMN_NAME_VOLUME = "volume";
    }



    public static final String SQL_CREATE_MATERIALS_QUOTES_DATA_TABLE =
            "CREATE TABLE " + MaterialsQuotesDataTableContents.TABLE_NAME + " (" +
                    MaterialsQuotesDataTableContents._ID + " INTEGER PRIMARY KEY," +
                    MaterialsQuotesDataTableContents.COLUMN_NAME_SYMBOL + " TEXT," +
                    MaterialsQuotesDataTableContents.COLUMN_NAME_EXCHANGE + " TEXT," +
                    MaterialsQuotesDataTableContents.COLUMN_NAME_NAME + " TEXT," +
                    MaterialsQuotesDataTableContents.COLUMN_NAME_DAYCODE + " TEXT," +
                    MaterialsQuotesDataTableContents.COLUMN_NAME_SERVERTIMESTAMP + " TEXT," +
                    MaterialsQuotesDataTableContents.COLUMN_NAME_MODE + " TEXT," +
                    MaterialsQuotesDataTableContents.COLUMN_NAME_LASTPRICE + " TEXT," +
                    MaterialsQuotesDataTableContents.COLUMN_NAME_TRADETIMESTAMP + " TEXT," +
                    MaterialsQuotesDataTableContents.COLUMN_NAME_NETCHANGE + " TEXT," +
                    MaterialsQuotesDataTableContents.COLUMN_NAME_PERSENTCHANGE + " TEXT," +
                    MaterialsQuotesDataTableContents.COLUMN_NAME_UNITCODE + " TEXT," +
                    MaterialsQuotesDataTableContents.COLUMN_NAME_OPEN + " TEXT," +
                    MaterialsQuotesDataTableContents.COLUMN_NAME_HIGH + " TEXT," +
                    MaterialsQuotesDataTableContents.COLUMN_NAME_LOW + " TEXT," +
                    MaterialsQuotesDataTableContents.COLUMN_NAME_CLOSE + " TEXT," +
                    MaterialsQuotesDataTableContents.COLUMN_NAME_FLAG + " TEXT," +
                    MaterialsQuotesDataTableContents.COLUMN_NAME_VOLUME + " TEXT)";

    public static final String SQL_DELETE_MATERIALS_QUOTES_DATA_TABLE =
            "DROP TABLE IF EXISTS " + MaterialsQuotesDataTableContents.TABLE_NAME;

    public static final String SQL_SELECT_MATERIALS_QUOTES_DATA_TABLE =
            "SELECT  * FROM " + MaterialsQuotesDataTableContents.TABLE_NAME + " WHERE "+ MaterialsQuotesDataTableContents._ID;

}

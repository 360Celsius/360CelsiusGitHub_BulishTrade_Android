package celsius.a360.com.bulishtrade.dbhelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

import celsius.a360.com.bulishtrade.datamodels.DataModelMostActive;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static DatabaseHelper sInstance;
    // Database Info
    private static final String DATABASE_NAME = "bulishTradeDatabase";
    private static final int DATABASE_VERSION = 2;
    private Context context;


    public static synchronized DatabaseHelper getInstance(Context context) {
        // Use the application context, which will ensure that you
        // don't accidentally leak an Activity's context.
        if (sInstance == null) {
            sInstance = new DatabaseHelper(context.getApplicationContext());
        }
        return sInstance;
    }

    /**
     * Constructor should be private to prevent direct instantiation.
     * Make a call to the static method "getInstance()" instead.
     */
    private DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(DatabaseHelperContract.SQL_CREATE_TOP_MARKETS_DATA_TABLE);
        sqLiteDatabase.execSQL(DatabaseHelperContract.SQL_CREATE_MOST_ACTIVE_DATA_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(DatabaseHelperContract.SQL_DELETE_TOP_MARKETS_DATA_TABLE);
        sqLiteDatabase.execSQL(DatabaseHelperContract.SQL_DELETE_MOST_ACTIVE_DATA_TABLE);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        super.onDowngrade(db, oldVersion, newVersion);
    }


    //=============================MostActiveDataTable========================================

    public void bulkInsertDataToTopMarketsDataTable(ArrayList<DataModelMostActive> dataMotelTopMarkets){
        try {
            deleteMostActiveDataTable();
            ContentValues[] contentsArr = new ContentValues[dataMotelTopMarkets.size()];
            for (int i = 0; i < dataMotelTopMarkets.size(); i++) {
                ContentValues values = new ContentValues();
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_SYMBOL, dataMotelTopMarkets.get(i).getSymbol());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_COMPANY_NAME, dataMotelTopMarkets.get(i).getCompanyName());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_PRIMARY_EXCAHNE, dataMotelTopMarkets.get(i).getPrimaryExchange());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_SECTOR, dataMotelTopMarkets.get(i).getSector());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_CALCULATION_PRICE, dataMotelTopMarkets.get(i).getCalculationPrice());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_OPEN, dataMotelTopMarkets.get(i).getOpen());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_OPEN_TIME, dataMotelTopMarkets.get(i).getOpenTime());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_CLOSE, dataMotelTopMarkets.get(i).getClose());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_CLOSE_TIME, dataMotelTopMarkets.get(i).getCloseTime());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_HIGH, dataMotelTopMarkets.get(i).getHigh());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_LOW, dataMotelTopMarkets.get(i).getLow());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_LAST_PRICE, dataMotelTopMarkets.get(i).getLatestPrice());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_LAST_SOURCE, dataMotelTopMarkets.get(i).getLatestSource());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_LAST_TIME, dataMotelTopMarkets.get(i).getLatestTime());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_LATEST_UPDATE, dataMotelTopMarkets.get(i).getLatestUpdate());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_LATEST_VOLUME, dataMotelTopMarkets.get(i).getLatestVolume());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_IEX_REAL_TIME_PRICE, dataMotelTopMarkets.get(i).getIexRealtimePrice());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_IEX_REAL_TIME_SIZE, dataMotelTopMarkets.get(i).getIexRealtimeSize());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_IEX_LAST_UPDATED, dataMotelTopMarkets.get(i).getIexLastUpdated());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_DAYLY_PRICE, dataMotelTopMarkets.get(i).getDelayedPrice());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_DAILY_PRICE_TIME, dataMotelTopMarkets.get(i).getDelayedPriceTime());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_EXTENDED_PRICE, dataMotelTopMarkets.get(i).getExtendedPrice());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_EXTENDED_CHANGE, dataMotelTopMarkets.get(i).getExtendedChange());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_EXTENDED_CHANGE_PERCENT, dataMotelTopMarkets.get(i).getExtendedChangePercent());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_EXTENDED_PRICE_TIME, dataMotelTopMarkets.get(i).getExtendedPriceTime());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_EXTENDED_CLOSE, dataMotelTopMarkets.get(i).getPreviousClose());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_CHANGE, dataMotelTopMarkets.get(i).getChange());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_CHANGE_PERCENT, dataMotelTopMarkets.get(i).getChangePercent());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_IEX_MARKET_PERCENT, dataMotelTopMarkets.get(i).getIexMarketPercent());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_IEX_VOLUME, dataMotelTopMarkets.get(i).getIexVolume());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_AVG_TOTAL_VOLUME, dataMotelTopMarkets.get(i).getAvgTotalVolume());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_IEX_BID_PRICE, dataMotelTopMarkets.get(i).getIexBidPrice());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_IEX_BID_SIZE, dataMotelTopMarkets.get(i).getIexBidSize());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_IEX_ASK_PRICE, dataMotelTopMarkets.get(i).getIexAskPrice());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_IEX_ASK_SIZE, dataMotelTopMarkets.get(i).getIexAskSize());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_MARKE_TCUP, dataMotelTopMarkets.get(i).getMarketCap());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_PE_RRATIO, dataMotelTopMarkets.get(i).getPeRatio());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_WEEK_52_HIGH, dataMotelTopMarkets.get(i).getWeek52High());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_WEEK_52_LOW, dataMotelTopMarkets.get(i).getWeek52Low());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_YTD_CHANGE, dataMotelTopMarkets.get(i).getYtdChange());


                contentsArr[i] = values;
            }
            context.getContentResolver().bulkInsert(DatabaseHelperContract.MostActiveDataTable.CONTENT_URI, contentsArr);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void deleteMostActiveDataTable() {
        SQLiteDatabase db = getWritableDatabase();
        db.beginTransaction();
        try {
            db.delete(DatabaseHelperContract.MostActiveDataTable.TABLE_NAME, null, null);
            db.setTransactionSuccessful();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.endTransaction();
        }
    }

}

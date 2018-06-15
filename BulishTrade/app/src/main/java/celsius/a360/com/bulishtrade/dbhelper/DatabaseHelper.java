package celsius.a360.com.bulishtrade.dbhelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

import celsius.a360.com.bulishtrade.datamodels.DataModelGainers;
import celsius.a360.com.bulishtrade.datamodels.DataModelMostActive;
import celsius.a360.com.bulishtrade.datamodels.DataMotelTops;

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
        sqLiteDatabase.execSQL(DatabaseHelperContract.SQL_CREATE_TOPS_DATA_TABLE);
        sqLiteDatabase.execSQL(DatabaseHelperContract.SQL_CREATE_MOST_ACTIVE_DATA_TABLE);
        sqLiteDatabase.execSQL(DatabaseHelperContract.SQL_CREATE_GAINERS_DATA_TABLE);
        sqLiteDatabase.execSQL(DatabaseHelperContract.SQL_CREATE_LOSERS_DATA_TABLE);
        sqLiteDatabase.execSQL(DatabaseHelperContract.SQL_CREATE_PORTFOLIO_DATA_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(DatabaseHelperContract.SQL_DELETE_TOPS_DATA_TABLE);
        sqLiteDatabase.execSQL(DatabaseHelperContract.SQL_DELETE_MOST_ACTIVE_DATA_TABLE);
        sqLiteDatabase.execSQL(DatabaseHelperContract.SQL_DELETE_GAINERS_DATA_TABLE);
        sqLiteDatabase.execSQL(DatabaseHelperContract.SQL_DELETE_LOSERS_DATA_TABLE);
        sqLiteDatabase.execSQL(DatabaseHelperContract.SQL_DELETE_PORTFOLIO_DATA_TABLE);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        super.onDowngrade(db, oldVersion, newVersion);
    }


    //=============================MostActiveDataTable========================================

    public void bulkInsertDataToTopMarketsDataTable(ArrayList<DataModelMostActive> dataMotelMostActive){
        try {
            deleteMostActiveDataTable();
            ContentValues[] contentsArr = new ContentValues[dataMotelMostActive.size()];
            for (int i = 0; i < dataMotelMostActive.size(); i++) {
                ContentValues values = new ContentValues();
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_SYMBOL, dataMotelMostActive.get(i).getSymbol());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_COMPANY_NAME, dataMotelMostActive.get(i).getCompanyName());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_PRIMARY_EXCAHNE, dataMotelMostActive.get(i).getPrimaryExchange());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_SECTOR, dataMotelMostActive.get(i).getSector());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_CALCULATION_PRICE, dataMotelMostActive.get(i).getCalculationPrice());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_OPEN, dataMotelMostActive.get(i).getOpen());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_OPEN_TIME, dataMotelMostActive.get(i).getOpenTime());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_CLOSE, dataMotelMostActive.get(i).getClose());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_CLOSE_TIME, dataMotelMostActive.get(i).getCloseTime());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_HIGH, dataMotelMostActive.get(i).getHigh());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_LOW, dataMotelMostActive.get(i).getLow());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_LAST_PRICE, dataMotelMostActive.get(i).getLatestPrice());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_LAST_SOURCE, dataMotelMostActive.get(i).getLatestSource());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_LAST_TIME, dataMotelMostActive.get(i).getLatestTime());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_LATEST_UPDATE, dataMotelMostActive.get(i).getLatestUpdate());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_LATEST_VOLUME, dataMotelMostActive.get(i).getLatestVolume());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_IEX_REAL_TIME_PRICE, dataMotelMostActive.get(i).getIexRealtimePrice());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_IEX_REAL_TIME_SIZE, dataMotelMostActive.get(i).getIexRealtimeSize());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_IEX_LAST_UPDATED, dataMotelMostActive.get(i).getIexLastUpdated());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_DAYLY_PRICE, dataMotelMostActive.get(i).getDelayedPrice());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_DAILY_PRICE_TIME, dataMotelMostActive.get(i).getDelayedPriceTime());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_EXTENDED_PRICE, dataMotelMostActive.get(i).getExtendedPrice());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_EXTENDED_CHANGE, dataMotelMostActive.get(i).getExtendedChange());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_EXTENDED_CHANGE_PERCENT, dataMotelMostActive.get(i).getExtendedChangePercent());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_EXTENDED_PRICE_TIME, dataMotelMostActive.get(i).getExtendedPriceTime());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_EXTENDED_CLOSE, dataMotelMostActive.get(i).getPreviousClose());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_CHANGE, dataMotelMostActive.get(i).getChange());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_CHANGE_PERCENT, dataMotelMostActive.get(i).getChangePercent());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_IEX_MARKET_PERCENT, dataMotelMostActive.get(i).getIexMarketPercent());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_IEX_VOLUME, dataMotelMostActive.get(i).getIexVolume());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_AVG_TOTAL_VOLUME, dataMotelMostActive.get(i).getAvgTotalVolume());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_IEX_BID_PRICE, dataMotelMostActive.get(i).getIexBidPrice());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_IEX_BID_SIZE, dataMotelMostActive.get(i).getIexBidSize());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_IEX_ASK_PRICE, dataMotelMostActive.get(i).getIexAskPrice());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_IEX_ASK_SIZE, dataMotelMostActive.get(i).getIexAskSize());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_MARKE_TCUP, dataMotelMostActive.get(i).getMarketCap());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_PE_RRATIO, dataMotelMostActive.get(i).getPeRatio());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_WEEK_52_HIGH, dataMotelMostActive.get(i).getWeek52High());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_WEEK_52_LOW, dataMotelMostActive.get(i).getWeek52Low());
                values.put(DatabaseHelperContract.MostActiveDataTable.COLUMN_NAME_YTD_CHANGE, dataMotelMostActive.get(i).getYtdChange());


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


    //=============================TopsDataTable========================================

    public void bulkInsertDataToTopsDataTable(ArrayList<DataMotelTops> dataMotelTopMarkets){
        try {
            deleteTopsDataTable();
            ContentValues[] contentsArr = new ContentValues[dataMotelTopMarkets.size()];
            for (int i = 0; i < dataMotelTopMarkets.size(); i++) {
                ContentValues values = new ContentValues();
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_SYMBOL, dataMotelTopMarkets.get(i).getSymbol());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_COMPANY_NAME, dataMotelTopMarkets.get(i).getCompanyName());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_PRIMARY_EXCAHNE, dataMotelTopMarkets.get(i).getPrimaryExchange());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_SECTOR, dataMotelTopMarkets.get(i).getSector());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_CALCULATION_PRICE, dataMotelTopMarkets.get(i).getCalculationPrice());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_OPEN, dataMotelTopMarkets.get(i).getOpen());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_OPEN_TIME, dataMotelTopMarkets.get(i).getOpenTime());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_CLOSE, dataMotelTopMarkets.get(i).getClose());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_CLOSE_TIME, dataMotelTopMarkets.get(i).getCloseTime());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_HIGH, dataMotelTopMarkets.get(i).getHigh());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_LOW, dataMotelTopMarkets.get(i).getLow());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_LAST_PRICE, dataMotelTopMarkets.get(i).getLatestPrice());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_LAST_SOURCE, dataMotelTopMarkets.get(i).getLatestSource());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_LAST_TIME, dataMotelTopMarkets.get(i).getLatestTime());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_LATEST_UPDATE, dataMotelTopMarkets.get(i).getLatestUpdate());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_LATEST_VOLUME, dataMotelTopMarkets.get(i).getLatestVolume());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_IEX_REAL_TIME_PRICE, dataMotelTopMarkets.get(i).getIexRealtimePrice());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_IEX_REAL_TIME_SIZE, dataMotelTopMarkets.get(i).getIexRealtimeSize());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_IEX_LAST_UPDATED, dataMotelTopMarkets.get(i).getIexLastUpdated());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_DAYLY_PRICE, dataMotelTopMarkets.get(i).getDelayedPrice());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_DAILY_PRICE_TIME, dataMotelTopMarkets.get(i).getDelayedPriceTime());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_EXTENDED_PRICE, dataMotelTopMarkets.get(i).getExtendedPrice());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_EXTENDED_CHANGE, dataMotelTopMarkets.get(i).getExtendedChange());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_EXTENDED_CHANGE_PERCENT, dataMotelTopMarkets.get(i).getExtendedChangePercent());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_EXTENDED_PRICE_TIME, dataMotelTopMarkets.get(i).getExtendedPriceTime());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_EXTENDED_CLOSE, dataMotelTopMarkets.get(i).getPreviousClose());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_CHANGE, dataMotelTopMarkets.get(i).getChange());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_CHANGE_PERCENT, dataMotelTopMarkets.get(i).getChangePercent());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_IEX_MARKET_PERCENT, dataMotelTopMarkets.get(i).getIexMarketPercent());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_IEX_VOLUME, dataMotelTopMarkets.get(i).getIexVolume());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_AVG_TOTAL_VOLUME, dataMotelTopMarkets.get(i).getAvgTotalVolume());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_IEX_BID_PRICE, dataMotelTopMarkets.get(i).getIexBidPrice());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_IEX_BID_SIZE, dataMotelTopMarkets.get(i).getIexBidSize());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_IEX_ASK_PRICE, dataMotelTopMarkets.get(i).getIexAskPrice());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_IEX_ASK_SIZE, dataMotelTopMarkets.get(i).getIexAskSize());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_MARKE_TCUP, dataMotelTopMarkets.get(i).getMarketCap());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_PE_RRATIO, dataMotelTopMarkets.get(i).getPeRatio());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_WEEK_52_HIGH, dataMotelTopMarkets.get(i).getWeek52High());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_WEEK_52_LOW, dataMotelTopMarkets.get(i).getWeek52Low());
                values.put(DatabaseHelperContract.TopMarketsDataTable.COLUMN_NAME_YTD_CHANGE, dataMotelTopMarkets.get(i).getYtdChange());


                contentsArr[i] = values;
            }
            context.getContentResolver().bulkInsert(DatabaseHelperContract.TopMarketsDataTable.CONTENT_URI, contentsArr);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void deleteTopsDataTable() {
        SQLiteDatabase db = getWritableDatabase();
        db.beginTransaction();
        try {
            db.delete(DatabaseHelperContract.TopMarketsDataTable.TABLE_NAME, null, null);
            db.setTransactionSuccessful();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.endTransaction();
        }
    }



    //=============================GainersDataTable========================================

    public void bulkInsertDataToGainersDataTable(ArrayList<DataModelGainers> dataMotelgainers){
        try {
            deleteGainersDataTable();
            ContentValues[] contentsArr = new ContentValues[dataMotelgainers.size()];
            for (int i = 0; i < dataMotelgainers.size(); i++) {
                ContentValues values = new ContentValues();
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_SYMBOL, dataMotelgainers.get(i).getSymbol());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_COMPANY_NAME, dataMotelgainers.get(i).getCompanyName());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_PRIMARY_EXCAHNE, dataMotelgainers.get(i).getPrimaryExchange());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_SECTOR, dataMotelgainers.get(i).getSector());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_CALCULATION_PRICE, dataMotelgainers.get(i).getCalculationPrice());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_OPEN, dataMotelgainers.get(i).getOpen());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_OPEN_TIME, dataMotelgainers.get(i).getOpenTime());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_CLOSE, dataMotelgainers.get(i).getClose());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_CLOSE_TIME, dataMotelgainers.get(i).getCloseTime());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_HIGH, dataMotelgainers.get(i).getHigh());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_LOW, dataMotelgainers.get(i).getLow());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_LAST_PRICE, dataMotelgainers.get(i).getLatestPrice());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_LAST_SOURCE, dataMotelgainers.get(i).getLatestSource());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_LAST_TIME, dataMotelgainers.get(i).getLatestTime());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_LATEST_UPDATE, dataMotelgainers.get(i).getLatestUpdate());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_LATEST_VOLUME, dataMotelgainers.get(i).getLatestVolume());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_IEX_REAL_TIME_PRICE, dataMotelgainers.get(i).getIexRealtimePrice());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_IEX_REAL_TIME_SIZE, dataMotelgainers.get(i).getIexRealtimeSize());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_IEX_LAST_UPDATED, dataMotelgainers.get(i).getIexLastUpdated());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_DAYLY_PRICE, dataMotelgainers.get(i).getDelayedPrice());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_DAILY_PRICE_TIME, dataMotelgainers.get(i).getDelayedPriceTime());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_EXTENDED_PRICE, dataMotelgainers.get(i).getExtendedPrice());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_EXTENDED_CHANGE, dataMotelgainers.get(i).getExtendedChange());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_EXTENDED_CHANGE_PERCENT, dataMotelgainers.get(i).getExtendedChangePercent());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_EXTENDED_PRICE_TIME, dataMotelgainers.get(i).getExtendedPriceTime());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_EXTENDED_CLOSE, dataMotelgainers.get(i).getPreviousClose());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_CHANGE, dataMotelgainers.get(i).getChange());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_CHANGE_PERCENT, dataMotelgainers.get(i).getChangePercent());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_IEX_MARKET_PERCENT, dataMotelgainers.get(i).getIexMarketPercent());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_IEX_VOLUME, dataMotelgainers.get(i).getIexVolume());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_AVG_TOTAL_VOLUME, dataMotelgainers.get(i).getAvgTotalVolume());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_IEX_BID_PRICE, dataMotelgainers.get(i).getIexBidPrice());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_IEX_BID_SIZE, dataMotelgainers.get(i).getIexBidSize());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_IEX_ASK_PRICE, dataMotelgainers.get(i).getIexAskPrice());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_IEX_ASK_SIZE, dataMotelgainers.get(i).getIexAskSize());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_MARKE_TCUP, dataMotelgainers.get(i).getMarketCap());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_PE_RRATIO, dataMotelgainers.get(i).getPeRatio());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_WEEK_52_HIGH, dataMotelgainers.get(i).getWeek52High());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_WEEK_52_LOW, dataMotelgainers.get(i).getWeek52Low());
                values.put(DatabaseHelperContract.GainersDataTable.COLUMN_NAME_YTD_CHANGE, dataMotelgainers.get(i).getYtdChange());


                contentsArr[i] = values;
            }
            context.getContentResolver().bulkInsert(DatabaseHelperContract.GainersDataTable.CONTENT_URI, contentsArr);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void deleteGainersDataTable() {
        SQLiteDatabase db = getWritableDatabase();
        db.beginTransaction();
        try {
            db.delete(DatabaseHelperContract.GainersDataTable.TABLE_NAME, null, null);
            db.setTransactionSuccessful();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.endTransaction();
        }
    }


    //=============================LosersDataTable========================================

    public void bulkInsertDataToLosersDataTable(ArrayList<DataModelGainers> dataMotelLosers){
        try {
            deleteLosersDataTable();
            ContentValues[] contentsArr = new ContentValues[dataMotelLosers.size()];
            for (int i = 0; i < dataMotelLosers.size(); i++) {
                ContentValues values = new ContentValues();
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_SYMBOL, dataMotelLosers.get(i).getSymbol());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_COMPANY_NAME, dataMotelLosers.get(i).getCompanyName());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_PRIMARY_EXCAHNE, dataMotelLosers.get(i).getPrimaryExchange());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_SECTOR, dataMotelLosers.get(i).getSector());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_CALCULATION_PRICE, dataMotelLosers.get(i).getCalculationPrice());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_OPEN, dataMotelLosers.get(i).getOpen());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_OPEN_TIME, dataMotelLosers.get(i).getOpenTime());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_CLOSE, dataMotelLosers.get(i).getClose());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_CLOSE_TIME, dataMotelLosers.get(i).getCloseTime());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_HIGH, dataMotelLosers.get(i).getHigh());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_LOW, dataMotelLosers.get(i).getLow());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_LAST_PRICE, dataMotelLosers.get(i).getLatestPrice());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_LAST_SOURCE, dataMotelLosers.get(i).getLatestSource());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_LAST_TIME, dataMotelLosers.get(i).getLatestTime());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_LATEST_UPDATE, dataMotelLosers.get(i).getLatestUpdate());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_LATEST_VOLUME, dataMotelLosers.get(i).getLatestVolume());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_IEX_REAL_TIME_PRICE, dataMotelLosers.get(i).getIexRealtimePrice());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_IEX_REAL_TIME_SIZE, dataMotelLosers.get(i).getIexRealtimeSize());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_IEX_LAST_UPDATED, dataMotelLosers.get(i).getIexLastUpdated());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_DAYLY_PRICE, dataMotelLosers.get(i).getDelayedPrice());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_DAILY_PRICE_TIME, dataMotelLosers.get(i).getDelayedPriceTime());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_EXTENDED_PRICE, dataMotelLosers.get(i).getExtendedPrice());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_EXTENDED_CHANGE, dataMotelLosers.get(i).getExtendedChange());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_EXTENDED_CHANGE_PERCENT, dataMotelLosers.get(i).getExtendedChangePercent());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_EXTENDED_PRICE_TIME, dataMotelLosers.get(i).getExtendedPriceTime());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_EXTENDED_CLOSE, dataMotelLosers.get(i).getPreviousClose());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_CHANGE, dataMotelLosers.get(i).getChange());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_CHANGE_PERCENT, dataMotelLosers.get(i).getChangePercent());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_IEX_MARKET_PERCENT, dataMotelLosers.get(i).getIexMarketPercent());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_IEX_VOLUME, dataMotelLosers.get(i).getIexVolume());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_AVG_TOTAL_VOLUME, dataMotelLosers.get(i).getAvgTotalVolume());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_IEX_BID_PRICE, dataMotelLosers.get(i).getIexBidPrice());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_IEX_BID_SIZE, dataMotelLosers.get(i).getIexBidSize());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_IEX_ASK_PRICE, dataMotelLosers.get(i).getIexAskPrice());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_IEX_ASK_SIZE, dataMotelLosers.get(i).getIexAskSize());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_MARKE_TCUP, dataMotelLosers.get(i).getMarketCap());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_PE_RRATIO, dataMotelLosers.get(i).getPeRatio());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_WEEK_52_HIGH, dataMotelLosers.get(i).getWeek52High());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_WEEK_52_LOW, dataMotelLosers.get(i).getWeek52Low());
                values.put(DatabaseHelperContract.LosersDataTable.COLUMN_NAME_YTD_CHANGE, dataMotelLosers.get(i).getYtdChange());


                contentsArr[i] = values;
            }
            context.getContentResolver().bulkInsert(DatabaseHelperContract.LosersDataTable.CONTENT_URI, contentsArr);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void deleteLosersDataTable() {
        SQLiteDatabase db = getWritableDatabase();
        db.beginTransaction();
        try {
            db.delete(DatabaseHelperContract.LosersDataTable.TABLE_NAME, null, null);
            db.setTransactionSuccessful();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.endTransaction();
        }
    }



    //=============================PortfolioDataTable========================================

    public void bulkInsertDataToPortfolioDataTable(ArrayList<DataModelGainers> dataMotelPortfolio){
        try {
            deletePortfolioDataTable();
            ContentValues[] contentsArr = new ContentValues[dataMotelPortfolio.size()];
            for (int i = 0; i < dataMotelPortfolio.size(); i++) {
                ContentValues values = new ContentValues();
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_SYMBOL, dataMotelPortfolio.get(i).getSymbol());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_COMPANY_NAME, dataMotelPortfolio.get(i).getCompanyName());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_PRIMARY_EXCAHNE, dataMotelPortfolio.get(i).getPrimaryExchange());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_SECTOR, dataMotelPortfolio.get(i).getSector());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_CALCULATION_PRICE, dataMotelPortfolio.get(i).getCalculationPrice());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_OPEN, dataMotelPortfolio.get(i).getOpen());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_OPEN_TIME, dataMotelPortfolio.get(i).getOpenTime());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_CLOSE, dataMotelPortfolio.get(i).getClose());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_CLOSE_TIME, dataMotelPortfolio.get(i).getCloseTime());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_HIGH, dataMotelPortfolio.get(i).getHigh());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_LOW, dataMotelPortfolio.get(i).getLow());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_LAST_PRICE, dataMotelPortfolio.get(i).getLatestPrice());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_LAST_SOURCE, dataMotelPortfolio.get(i).getLatestSource());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_LAST_TIME, dataMotelPortfolio.get(i).getLatestTime());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_LATEST_UPDATE, dataMotelPortfolio.get(i).getLatestUpdate());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_LATEST_VOLUME, dataMotelPortfolio.get(i).getLatestVolume());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_IEX_REAL_TIME_PRICE, dataMotelPortfolio.get(i).getIexRealtimePrice());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_IEX_REAL_TIME_SIZE, dataMotelPortfolio.get(i).getIexRealtimeSize());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_IEX_LAST_UPDATED, dataMotelPortfolio.get(i).getIexLastUpdated());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_DAYLY_PRICE, dataMotelPortfolio.get(i).getDelayedPrice());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_DAILY_PRICE_TIME, dataMotelPortfolio.get(i).getDelayedPriceTime());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_EXTENDED_PRICE, dataMotelPortfolio.get(i).getExtendedPrice());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_EXTENDED_CHANGE, dataMotelPortfolio.get(i).getExtendedChange());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_EXTENDED_CHANGE_PERCENT, dataMotelPortfolio.get(i).getExtendedChangePercent());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_EXTENDED_PRICE_TIME, dataMotelPortfolio.get(i).getExtendedPriceTime());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_EXTENDED_CLOSE, dataMotelPortfolio.get(i).getPreviousClose());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_CHANGE, dataMotelPortfolio.get(i).getChange());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_CHANGE_PERCENT, dataMotelPortfolio.get(i).getChangePercent());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_IEX_MARKET_PERCENT, dataMotelPortfolio.get(i).getIexMarketPercent());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_IEX_VOLUME, dataMotelPortfolio.get(i).getIexVolume());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_AVG_TOTAL_VOLUME, dataMotelPortfolio.get(i).getAvgTotalVolume());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_IEX_BID_PRICE, dataMotelPortfolio.get(i).getIexBidPrice());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_IEX_BID_SIZE, dataMotelPortfolio.get(i).getIexBidSize());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_IEX_ASK_PRICE, dataMotelPortfolio.get(i).getIexAskPrice());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_IEX_ASK_SIZE, dataMotelPortfolio.get(i).getIexAskSize());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_MARKE_TCUP, dataMotelPortfolio.get(i).getMarketCap());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_PE_RRATIO, dataMotelPortfolio.get(i).getPeRatio());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_WEEK_52_HIGH, dataMotelPortfolio.get(i).getWeek52High());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_WEEK_52_LOW, dataMotelPortfolio.get(i).getWeek52Low());
                values.put(DatabaseHelperContract.PortfolioDataTable.COLUMN_NAME_YTD_CHANGE, dataMotelPortfolio.get(i).getYtdChange());


                contentsArr[i] = values;
            }
            context.getContentResolver().bulkInsert(DatabaseHelperContract.PortfolioDataTable.CONTENT_URI, contentsArr);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void deletePortfolioDataTable() {
        SQLiteDatabase db = getWritableDatabase();
        db.beginTransaction();
        try {
            db.delete(DatabaseHelperContract.PortfolioDataTable.TABLE_NAME, null, null);
            db.setTransactionSuccessful();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.endTransaction();
        }
    }
}

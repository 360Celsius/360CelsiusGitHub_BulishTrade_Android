package celsius.a360.com.bulishtrade.dbhelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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
}

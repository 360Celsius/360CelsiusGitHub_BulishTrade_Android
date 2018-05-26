package celsius.a360.com.bulishtrade.dbhelper;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class BulishTradeProvider extends ContentProvider {

    public static DatabaseHelper helper = null;

    private static final int TOP_MARKETS = 1;
    private static final int MOST_ACTIVE = 2;

    private static final UriMatcher mMatcher = new UriMatcher(UriMatcher.NO_MATCH);

    static {
        mMatcher.addURI(DatabaseHelperContract.AUTHORITY, DatabaseHelperContract.TopMarketsDataTable.URI_SUFFIX, TOP_MARKETS);
        mMatcher.addURI(DatabaseHelperContract.AUTHORITY, DatabaseHelperContract.MostActiveDataTable.URI_SUFFIX, MOST_ACTIVE);

    }


    @Override
    public boolean onCreate() {
        helper  = DatabaseHelper.getInstance(getContext());
        return true;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] strings, @Nullable String s, @Nullable String[] strings1, @Nullable String s1) {
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        SQLiteDatabase db = helper.getWritableDatabase();
        String nullColumnHack = null;
        long id = db.insert(getTableName(uri), nullColumnHack, contentValues);

        if(id > -1){
            Uri insertedId = ContentUris.withAppendedId(getContentUriName(uri), id);
            getContext().getContentResolver().notifyChange(insertedId, null);
            return insertedId;
        }
        else
            return null;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }

    public static String getTableName(Uri uri) {
        String tableName = null;

        switch (mMatcher.match(uri)) {
            case TOP_MARKETS:
                tableName = DatabaseHelperContract.TopMarketsDataTable.TABLE_NAME;
                break;
            case MOST_ACTIVE:
                tableName = DatabaseHelperContract.MostActiveDataTable.TABLE_NAME;
                break;
        }

        return tableName;
    }

    public Uri getContentUriName(Uri uri) {
        Uri contentUriName = null;

        switch (mMatcher.match(uri)) {
            case TOP_MARKETS:
                contentUriName = DatabaseHelperContract.TopMarketsDataTable.CONTENT_URI;
                break;
            case MOST_ACTIVE:
                contentUriName = DatabaseHelperContract.MostActiveDataTable.CONTENT_URI;
                break;
        }

        return contentUriName;
    }
}

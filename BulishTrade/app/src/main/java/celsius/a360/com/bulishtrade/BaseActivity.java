package celsius.a360.com.bulishtrade;

import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import com.example.dennisshar.bulishtrade.R;

import celsius.a360.com.bulishtrade.dbhelper.DatabaseHelper;
import celsius.a360.com.bulishtrade.reciver.BroadCastReciver;
import celsius.a360.com.bulishtrade.service.DataPullService;

public class BaseActivity extends AppCompatActivity {

    private BroadCastReciver receiver = null;
    public static DatabaseHelper helper = null;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Window window = getWindow();

        // clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        // add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

        // finally change the color
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.status_bar_color));
        }

        // In any activity just pass the context and use the singleton method
        helper = DatabaseHelper.getInstance(getApplicationContext());
    }

    @Override
    protected void onResume() {
        super.onResume();

        IntentFilter filter = new IntentFilter(DataPullService.GET_QOUTES_DATA);
        receiver =  BroadCastReciver.getInstance();
        registerReceiver(receiver, filter);
    }

    @Override
    protected void onStop() {
        unregisterReceiver(receiver);
        super.onStop();
    }
}



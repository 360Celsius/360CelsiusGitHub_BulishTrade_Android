package celsius.a360.com.bulishtrade;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.dennisshar.bulishtrade.R;

import celsius.a360.com.bulishtrade.service.DataPullService;
import celsius.a360.com.bulishtrade.service.DataPullServiceConsts;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Intent msgIntent = new Intent(getApplicationContext(), DataPullService.class);
        msgIntent.putExtra(DataPullServiceConsts.DATA_TYPE_KEY, DataPullServiceConsts.GET_MOST_ACTIVE_FROM_SPLASH_KEY);
        startService(msgIntent);

    }
}

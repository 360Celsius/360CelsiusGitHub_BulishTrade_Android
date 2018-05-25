package celsius.a360.com.bulishtrade;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import celsius.a360.com.bulishtrade.service.DataPullService;
import celsius.a360.com.bulishtrade.service.DataPullServiceConsts;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Intent msgIntent = new Intent(getApplicationContext(), DataPullService.class);
        msgIntent.putExtra(DataPullServiceConsts.DATA_TYPE_KEY, DataPullServiceConsts.GET_TOP_MARKETS_KEY);
        startService(msgIntent);

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent i = new Intent(SplashActivity.this, MainActivity.class);
//                startActivity(i);
//                finish();
//            }
//        }, 8000);

    }
}

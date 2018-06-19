package celsius.a360.com.bulishtrade;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import com.example.dennisshar.bulishtrade.R;

import celsius.a360.com.bulishtrade.service.DataPullService;
import celsius.a360.com.bulishtrade.service.DataPullServiceConsts;
import celsius.a360.com.bulishtrade.viewhelper.BottomNavigationViewHelper;

public class MainActivity extends BaseActivity {

    private RelativeLayout mainView;
    private BottomNavigationView bottomNavigationView;
    private BottomNavigationViewHelper bottomNavigationViewHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mainView = (RelativeLayout) findViewById(R.id.main_view);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationViewHelper = new BottomNavigationViewHelper();

        //Buttom buttons navigation
        bottomNavigationViewHelper.removeShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                        Intent msgIntent = new Intent(getApplicationContext(), DataPullService.class);
                        switch (item.getItemId()) {
                            case R.id.action_item1:
                                msgIntent.putExtra(DataPullServiceConsts.DATA_TYPE_KEY, DataPullServiceConsts.GET_MOST_ACTIVE_KEY);
                                break;
                            case R.id.action_item2:
                                msgIntent.putExtra(DataPullServiceConsts.DATA_TYPE_KEY, DataPullServiceConsts.GET_TOP_MARKETS_KEY);
                                break;
                            case R.id.action_item3:
                                msgIntent.putExtra(DataPullServiceConsts.DATA_TYPE_KEY, DataPullServiceConsts.GET_GAINERS_MARKETS_KEY);
                                break;
                            case R.id.action_item4:
                                msgIntent.putExtra(DataPullServiceConsts.DATA_TYPE_KEY, DataPullServiceConsts.GET_LOSSERS_MARKETS_KEY);
                                break;
                            case R.id.action_item5:
                                msgIntent.putExtra(DataPullServiceConsts.DATA_TYPE_KEY, DataPullServiceConsts.GET_PORTFOLIO_KEY);
                                break;
                        }
                        startService(msgIntent);
                        return true;
                    }
                });
    }

    @Override
    protected void onResume() {
        super.onResume();
        bottomNavigationView.setSelectedItemId(R.id.action_item1);
    }
}

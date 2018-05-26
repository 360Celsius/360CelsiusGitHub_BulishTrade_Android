package celsius.a360.com.bulishtrade;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import com.example.dennisshar.bulishtrade.R;

import celsius.a360.com.bulishtrade.fragments.FragmentGainers;
import celsius.a360.com.bulishtrade.fragments.FragmentLosers;
import celsius.a360.com.bulishtrade.fragments.FragmentMostActive;
import celsius.a360.com.bulishtrade.fragments.FragmentPortfolio;
import celsius.a360.com.bulishtrade.fragments.FragmentTopMarkets;
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
                        Fragment selectedFragment = null;
                        String selectedFragmentTag = null;
                        switch (item.getItemId()) {
                            case R.id.action_item1:
                                selectedFragment = new FragmentMostActive();
                                selectedFragmentTag = FragmentMostActive.TAG;

                                break;
                            case R.id.action_item2:
                                selectedFragment = new FragmentTopMarkets();
                                selectedFragmentTag = FragmentTopMarkets.TAG;

                                break;
                            case R.id.action_item3:
                                selectedFragment = new FragmentGainers();
                                selectedFragmentTag = FragmentGainers.TAG;

                                break;
                            case R.id.action_item4:
                                selectedFragment = new FragmentLosers();
                                selectedFragmentTag = FragmentLosers.TAG;

                                break;
                            case R.id.action_item5:
                                selectedFragment = new FragmentPortfolio();
                                selectedFragmentTag = FragmentPortfolio.TAG;

                                break;
                        }
                        FragmentTransaction ft =   getSupportFragmentManager().beginTransaction();
                        if(getSupportFragmentManager().findFragmentById(R.id.list_view_placeholder) != null) {
                            ft.remove(getSupportFragmentManager().findFragmentById(R.id.list_view_placeholder));
                            ft.add(R.id.list_view_placeholder,selectedFragment,selectedFragmentTag);
                            ft.commit();
                        }else{
                            ft.add(R.id.list_view_placeholder, selectedFragment,selectedFragmentTag);
                            ft.commit();
                        }

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

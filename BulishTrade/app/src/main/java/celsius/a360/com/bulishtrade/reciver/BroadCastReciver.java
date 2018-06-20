package celsius.a360.com.bulishtrade.reciver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.dennisshar.bulishtrade.R;

import celsius.a360.com.bulishtrade.MainActivity;
import celsius.a360.com.bulishtrade.fragments.FragmentGainers;
import celsius.a360.com.bulishtrade.fragments.FragmentLosers;
import celsius.a360.com.bulishtrade.fragments.FragmentMostActive;
import celsius.a360.com.bulishtrade.fragments.FragmentPortfolio;
import celsius.a360.com.bulishtrade.fragments.FragmentTopMarkets;
import celsius.a360.com.bulishtrade.service.DataPullServiceConsts;

public class BroadCastReciver extends BroadcastReceiver {


    private static BroadCastReciver _instance;


    private BroadCastReciver() {

    }

    public static BroadCastReciver getInstance()
    {
        if (_instance == null)
        {
            _instance = new BroadCastReciver();
        }
        return _instance;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getStringExtra(DataPullServiceConsts.DATA_TYPE_KEY).equalsIgnoreCase(DataPullServiceConsts.GET_MOST_ACTIVE_FROM_SPLASH_KEY)) {

            Intent intentone = new Intent(context.getApplicationContext(), MainActivity.class);
            intentone.putExtra(DataPullServiceConsts.DATA_TYPE_KEY,DataPullServiceConsts.GET_MOST_ACTIVE_FROM_SPLASH_KEY);
            intentone.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentone);
        }

        FragmentTransaction ft =   ((AppCompatActivity) context).getSupportFragmentManager().beginTransaction();

        if(((AppCompatActivity) context).getSupportFragmentManager().findFragmentById(R.id.list_view_placeholder) != null) {
            ft.remove(((AppCompatActivity) context).getSupportFragmentManager().findFragmentById(R.id.list_view_placeholder));
        }

        if( intent.getStringExtra(DataPullServiceConsts.DATA_TYPE_KEY).equalsIgnoreCase(DataPullServiceConsts.GET_MOST_ACTIVE_JUST_VIEW_KEY) ){
            try {
                ft.add(R.id.list_view_placeholder, new FragmentMostActive(), FragmentMostActive.TAG);
            }catch (Exception e){
                e.printStackTrace();
            }
        }else if( intent.getStringExtra(DataPullServiceConsts.DATA_TYPE_KEY).equalsIgnoreCase(DataPullServiceConsts.GET_MOST_ACTIVE_KEY) ){
            try {
                ft.add(R.id.list_view_placeholder, new FragmentMostActive(), FragmentMostActive.TAG);
            }catch (Exception e){
                e.printStackTrace();
            }

        }else if( intent.getStringExtra(DataPullServiceConsts.DATA_TYPE_KEY).equalsIgnoreCase(DataPullServiceConsts.GET_TOP_MARKETS_KEY) ){
            try {
                ft.add(R.id.list_view_placeholder, new FragmentTopMarkets(), FragmentTopMarkets.TAG);
            }catch (Exception e){
                e.printStackTrace();
            }

        }else if( intent.getStringExtra(DataPullServiceConsts.DATA_TYPE_KEY).equalsIgnoreCase(DataPullServiceConsts.GET_GAINERS_MARKETS_KEY) ){
            try {
                ft.add(R.id.list_view_placeholder, new FragmentGainers(), FragmentGainers.TAG);
            }catch (Exception e){
                e.printStackTrace();
            }
        }else if( intent.getStringExtra(DataPullServiceConsts.DATA_TYPE_KEY).equalsIgnoreCase(DataPullServiceConsts.GET_LOSSERS_MARKETS_KEY) ){
            try {
                ft.add(R.id.list_view_placeholder, new FragmentLosers(), FragmentLosers.TAG);
            }catch (Exception e){
                e.printStackTrace();
            }
        }else if( intent.getStringExtra(DataPullServiceConsts.DATA_TYPE_KEY).equalsIgnoreCase(DataPullServiceConsts.GET_PORTFOLIO_KEY) ){
            try {
                ft.add(R.id.list_view_placeholder, new FragmentPortfolio(), FragmentPortfolio.TAG);
            }catch (Exception e){
                e.printStackTrace();
            }
        }





        ft.commit();
    }
}

package celsius.a360.com.bulishtrade.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.dennisshar.bulishtrade.R;


import java.util.ArrayList;
import java.util.List;

import celsius.a360.com.bulishtrade.fragments.adapter.ViewPagerFragmentAdapter;


public class FragmentMostActive extends BaseFragment implements ViewPager.OnPageChangeListener{

    public final static String TAG = "FragmentMostActive";

    private ViewPager viewPager;
    private List<String> pagerFragments = new ArrayList<>();
    private ViewPagerFragmentAdapter fragmentAdapter;
    private Context context;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmnet_most_active, container, false);

        viewPager = (ViewPager) view.findViewById(R.id.viewPager_itemList);

        setData();

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }


    private void setData(){

        pagerFragments = mCallback.getDBhelper().getCategoriesMostActive();

        fragmentAdapter = new ViewPagerFragmentAdapter(getActivity(), getFragmentManager(), pagerFragments);
        viewPager.setAdapter(fragmentAdapter);
        viewPager.setCurrentItem(0);
        viewPager.setOnPageChangeListener(this);

        setViewPagerNavigator();

    }

    private void setViewPagerNavigator(){

        String[] str = new String[pagerFragments.size()];
        for(int i=0 ; i<pagerFragments.size(); i++ ){
            str[i] = pagerFragments.get(i);
        }
    }

}

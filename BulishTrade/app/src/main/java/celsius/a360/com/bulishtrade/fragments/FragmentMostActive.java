package celsius.a360.com.bulishtrade.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.dennisshar.bulishtrade.R;

import java.util.ArrayList;
import java.util.List;

import celsius.a360.com.bulishtrade.fragments.adapter.ViewPagerFragmentAdapter;


public class FragmentMostActive extends BaseFragment implements ViewPager.OnPageChangeListener{

    public final static String TAG = "FragmentMostActive";

    private LinearLayout indicator;
    private int mDotCount;
    private LinearLayout[] mDots;
    private ViewPager viewPager;
    private List<String> pagerFragments = new ArrayList<>();
    private ViewPagerFragmentAdapter fragmentAdapter;
    private Context context;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmnet_most_active, container, false);


       // indicator = (LinearLayout) view.findViewById(R.id.indicators);
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
        for (int i=0; i<mDotCount; i++){
            //mDots[i].setBackgroundResource(R.drawable.nonselected_item);
        }
        //mDots[position].setBackgroundResource(R.drawable.selected_item);
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
        setUiPageViewController();

    }

    private void setUiPageViewController(){
        mDotCount = fragmentAdapter.getCount();
        mDots = new LinearLayout[mDotCount];

        for(int i=0; i<mDotCount; i++){
            //mDots[i] = new LinearLayout(context);
            //mDots[i].setBackgroundResource(R.drawable.nonselected_item);

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayoutCompat.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );

            params.setMargins(4,0,4,0);
            //indicator.addView(mDots[i],params);
            //mDots[0].setBackgroundResource(R.drawable.selected_item);
        }
    }
}

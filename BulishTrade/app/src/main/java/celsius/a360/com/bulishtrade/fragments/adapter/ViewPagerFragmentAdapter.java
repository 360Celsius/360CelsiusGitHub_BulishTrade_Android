package celsius.a360.com.bulishtrade.fragments.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

import celsius.a360.com.bulishtrade.fragments.pager.WhiteLabelFragmentForViewPager;

public class ViewPagerFragmentAdapter extends FragmentStatePagerAdapter {
    private Context ctx;
    private List<String> data;
    private Fragment[] fragments;

    public ViewPagerFragmentAdapter(Context ctx, FragmentManager fm, List<String> data) {
        super(fm);
        this.ctx = ctx;
        this.data = data;
        fragments = new Fragment[data.size()];
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        String items = data.get(position);


        WhiteLabelFragmentForViewPager dinamisFragment = new WhiteLabelFragmentForViewPager();
        dinamisFragment.setDetail(items);
        fragment = dinamisFragment;

        if (fragments[position] == null) {
            fragments[position] = fragment;
        }
        return fragments[position];
    }

    @Override
    public int getCount() {
        if (data != null) {
            return data.size();
        } else {
            return 0;
        }
    }
}

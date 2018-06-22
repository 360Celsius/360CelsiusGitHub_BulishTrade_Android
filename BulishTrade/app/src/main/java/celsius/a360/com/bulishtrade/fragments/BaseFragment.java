package celsius.a360.com.bulishtrade.fragments;

import android.app.Activity;
import android.support.v4.app.Fragment;

import java.util.ArrayList;

import celsius.a360.com.bulishtrade.interfaces.DBhelperInterface;

public class BaseFragment extends Fragment {

    public DBhelperInterface mCallback;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mCallback = (DBhelperInterface) activity;

    }
}

package celsius.a360.com.bulishtrade.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.dennisshar.bulishtrade.R;


public class FragmentMostActive extends Fragment {

    public final static String TAG = "FragmentMostActive";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmnet_most_active, container, false);
        return view;
    }
}

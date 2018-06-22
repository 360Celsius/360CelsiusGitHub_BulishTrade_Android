package celsius.a360.com.bulishtrade.fragments.pager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dennisshar.bulishtrade.R;

public class WhiteLabelFragmentForViewPager extends Fragment {

    private TextView tvDetailFragment;
    private String detail;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.white_label_fragmnet_for_view_pager, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tvDetailFragment = (TextView) view.findViewById(R.id.text_view_detail_fragment);
        tvDetailFragment.setText(getDetail());
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}

package test.bwei.zhoukaolianxi1.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import test.bwei.zhoukaolianxi1.R;

/**
 * Created by 大白 on 2017/11/4.
 */

public class Fragment04 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.frag04, null);

        return view;
    }
}

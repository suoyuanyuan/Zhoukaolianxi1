package test.bwei.zhoukaolianxi1.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import test.bwei.zhoukaolianxi1.R;
import test.bwei.zhoukaolianxi1.fragments.Zfragment01;
import test.bwei.zhoukaolianxi1.fragments.Zfragment02;
import test.bwei.zhoukaolianxi1.fragments.Zfragment03;
import test.bwei.zhoukaolianxi1.fragments.Zfragment04;
import test.bwei.zhoukaolianxi1.fragments.Zfragment05;
import test.bwei.zhoukaolianxi1.fragments.Zfragment06;

/**
 * Created by 大白 on 2017/11/4.
 */

public class Fragment01 extends Fragment {

    private View view;
    private TabLayout tablayout;
    private ViewPager vp2;
    private static final String[]Title = new String[]{"泸深","板块","指数","港股","新三板","商品"};
    private List<Fragment> fragments = new ArrayList<>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        view = inflater.inflate(R.layout.frag01, null);

        initView();


        return view;
    }

    private void initView() {

        //查找组件
        tablayout = (TabLayout) view.findViewById(R.id.tablayout);
        vp2 = (ViewPager) view.findViewById(R.id.vp2);

        //添加fragment
        fragments.add(new Zfragment01());
        fragments.add(new Zfragment02());
        fragments.add(new Zfragment03());
        fragments.add(new Zfragment04());
        fragments.add(new Zfragment05());
        fragments.add(new Zfragment06());


        //遍历数组
        for (String str : Title){
            tablayout.addTab(tablayout.newTab().setText(str));
        }
        //tablayout关联vp
        tablayout.setupWithViewPager(vp2);

        //viewpage适配器
         vp2.setAdapter(new MyFragemtAdapter(getChildFragmentManager()));

    }



    class MyFragemtAdapter extends FragmentPagerAdapter {
        public MyFragemtAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return Title.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return Title[position];
        }
    }



}

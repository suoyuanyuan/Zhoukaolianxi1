package test.bwei.zhoukaolianxi1.activity;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.RadioGroup;

import test.bwei.zhoukaolianxi1.R;
import test.bwei.zhoukaolianxi1.fragment.Fragment01;
import test.bwei.zhoukaolianxi1.fragment.Fragment02;
import test.bwei.zhoukaolianxi1.fragment.Fragment03;
import test.bwei.zhoukaolianxi1.fragment.Fragment04;
import test.bwei.zhoukaolianxi1.fragment.Fragment05;

public class MainActivity extends BaseActivity {

    private ViewPager vp;
    private RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    private void initView() {
        vp = (ViewPager) findViewById(R.id.vp);
        rg = (RadioGroup) findViewById(R.id.rg);


        vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {

                Fragment fragment = null;
                switch (position){
                    case 0:
                        fragment = new Fragment01();
                        break;
                    case 1:
                        fragment = new Fragment02();
                        break;
                    case 2:
                        fragment = new Fragment03();
                        break;
                    case 3:
                        fragment = new Fragment04();
                        break;
                    case 4:
                        fragment = new Fragment05();
                        break;
                }

                return fragment;
            }

            @Override
            public int getCount() {
                return 5;
            }
        });


        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                switch (checkedId){

                    case R.id.bt1:
                          vp.setCurrentItem(0);
                        break;
                    case R.id.bt2:
                        vp.setCurrentItem(1);
                        break;
                    case R.id.bt3:
                        vp.setCurrentItem(2);
                        break;
                    case R.id.bt4:
                        vp.setCurrentItem(3);
                        break;
                    case R.id.bt5:
                        vp.setCurrentItem(4);
                        break;

                }

            }
        });

    }


}

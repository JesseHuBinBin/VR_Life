package com.eternal_life.vrlife.vr_life.activity;

import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;


import com.eternal_life.vrlife.vr_life.R;
import com.eternal_life.vrlife.vr_life.fragment.FragmentHotVR;
import com.eternal_life.vrlife.vr_life.fragment.FragmentMain;
import com.eternal_life.vrlife.vr_life.fragment.FragmentNews;
import com.eternal_life.vrlife.vr_life.fragment.FragmentPersonal;
import com.eternal_life.vrlife.vr_life.fragment.FragmentVRHouse;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private List<Fragment> list_fragment;
    private Vp_Adapter vp_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            //透明导航栏
            //getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }

        init();//初始化

    }

    /**
     * 初始化变量
     */
    private void init() {
        viewPager = (ViewPager) findViewById(R.id.vp_content);//viewPager初始化
        list_fragment = new ArrayList<Fragment>();
        list_fragment.add(new FragmentMain());
        list_fragment.add(new FragmentHotVR());
        list_fragment.add(new FragmentNews());
        list_fragment.add(new FragmentPersonal());
        list_fragment.add(new FragmentVRHouse());
        vp_adapter = new Vp_Adapter(getSupportFragmentManager());
        viewPager.setAdapter(vp_adapter);


    }

    /**
     * ViewPagerAdapter的内部类
     */
    class Vp_Adapter extends FragmentPagerAdapter {

        public Vp_Adapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return list_fragment.get(position);
        }

        @Override
        public int getCount() {
            return list_fragment.size();
        }
    }

}

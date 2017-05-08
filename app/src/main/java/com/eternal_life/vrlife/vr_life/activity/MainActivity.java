package com.eternal_life.vrlife.vr_life.activity;

import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;


import com.eternal_life.vrlife.vr_life.R;
import com.eternal_life.vrlife.vr_life.fragment.FragmentHotVR;
import com.eternal_life.vrlife.vr_life.fragment.FragmentMain;
import com.eternal_life.vrlife.vr_life.fragment.FragmentNews;
import com.eternal_life.vrlife.vr_life.fragment.FragmentPersonal;
import com.eternal_life.vrlife.vr_life.fragment.FragmentVRHouse;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    private ViewPager viewPager;
    private List<Fragment> list;
    private Vp_Adapter vp_adapter;
    private RelativeLayout rl_home_page, rl_latest_imfirmarion, rl_sample_house, rl_hotest_vr, rl_person_center;
    private ImageView img_drag_list;
    private RelativeLayout rl_left;
    private DrawerLayout activity_main;


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

        /**页面滚动的监听*/
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                if (position == 0) {
                    viewPager.setCurrentItem(0);
                    rl_home_page.setAlpha(0.2f);
                    rl_latest_imfirmarion.setAlpha(1f);
                    rl_sample_house.setAlpha(1f);
                    rl_hotest_vr.setAlpha(1f);
                    rl_person_center.setAlpha(1f);
                }
                if (position == 1) {
                    viewPager.setCurrentItem(1);
                    rl_home_page.setAlpha(1f);
                    rl_latest_imfirmarion.setAlpha(0.2f);
                    rl_sample_house.setAlpha(1f);
                    rl_hotest_vr.setAlpha(1f);
                    rl_person_center.setAlpha(1f);
                }
                if (position == 2) {
                    viewPager.setCurrentItem(2);
                    rl_home_page.setAlpha(1f);
                    rl_latest_imfirmarion.setAlpha(1f);
                    rl_sample_house.setAlpha(0.2f);
                    rl_hotest_vr.setAlpha(1f);
                    rl_person_center.setAlpha(1f);
                }
                if (position == 3) {
                    viewPager.setCurrentItem(3);
                    rl_home_page.setAlpha(1f);
                    rl_latest_imfirmarion.setAlpha(1f);
                    rl_sample_house.setAlpha(1f);
                    rl_hotest_vr.setAlpha(0.2f);
                    rl_person_center.setAlpha(1f);
                }
                if (position == 4) {
                    viewPager.setCurrentItem(4);
                    rl_home_page.setAlpha(1f);
                    rl_latest_imfirmarion.setAlpha(1f);
                    rl_sample_house.setAlpha(1f);
                    rl_hotest_vr.setAlpha(1f);
                    rl_person_center.setAlpha(0.2f);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    /**
     * 初始化变量
     */
    private void init() {

        viewPager = (ViewPager) findViewById(R.id.vp_content);
        rl_home_page = (RelativeLayout) findViewById(R.id.rl_home_page);
        rl_hotest_vr = (RelativeLayout) findViewById(R.id.rl_hotest_vr);
        rl_latest_imfirmarion = (RelativeLayout) findViewById(R.id.rl_latest_imfirmarion);
        rl_person_center = (RelativeLayout) findViewById(R.id.rl_person_center);
        rl_sample_house = (RelativeLayout) findViewById(R.id.rl_sample_house);
        img_drag_list= (ImageView) findViewById(R.id.img_drag_list);
        rl_left= (RelativeLayout) findViewById(R.id.rl_left);
        activity_main= (DrawerLayout) findViewById(R.id.activity_main);

        rl_hotest_vr.setOnClickListener(this);
        rl_sample_house.setOnClickListener(this);
        rl_home_page.setOnClickListener(this);
        rl_person_center.setOnClickListener(this);
        rl_latest_imfirmarion.setOnClickListener(this);
        img_drag_list.setOnClickListener(this);

        list = new ArrayList<>();
        list.add(new FragmentMain());
        list.add(new FragmentNews());
        list.add(new FragmentVRHouse());
        list.add(new FragmentHotVR());
        list.add(new FragmentPersonal());


        vp_adapter = new Vp_Adapter(getSupportFragmentManager());
        viewPager.setAdapter(vp_adapter);




    }

    @Override
    public void onClick(View v) {
        if (v == rl_home_page) {
            viewPager.setCurrentItem(0);
            rl_home_page.setAlpha(0.2f);
            rl_latest_imfirmarion.setAlpha(1f);
            rl_sample_house.setAlpha(1f);
            rl_hotest_vr.setAlpha(1f);
            rl_person_center.setAlpha(1f);
        }
        if (v == rl_latest_imfirmarion) {
            viewPager.setCurrentItem(1);
            rl_home_page.setAlpha(1f);
            rl_latest_imfirmarion.setAlpha(0.2f);
            rl_sample_house.setAlpha(1f);
            rl_hotest_vr.setAlpha(1f);
            rl_person_center.setAlpha(1f);
        }
        if (v == rl_sample_house) {
            viewPager.setCurrentItem(2);
            rl_home_page.setAlpha(1f);
            rl_latest_imfirmarion.setAlpha(1f);
            rl_sample_house.setAlpha(0.2f);
            rl_hotest_vr.setAlpha(1f);
            rl_person_center.setAlpha(1f);
        }
        if (v == rl_hotest_vr) {
            viewPager.setCurrentItem(3);
            rl_home_page.setAlpha(1f);
            rl_latest_imfirmarion.setAlpha(1f);
            rl_sample_house.setAlpha(1f);
            rl_hotest_vr.setAlpha(0.2f);
            rl_person_center.setAlpha(1f);
        }
        if (v == rl_person_center) {
            viewPager.setCurrentItem(4);
            rl_home_page.setAlpha(1f);
            rl_latest_imfirmarion.setAlpha(1f);
            rl_sample_house.setAlpha(1f);
            rl_hotest_vr.setAlpha(1f);
            rl_person_center.setAlpha(0.2f);
        }
        if(v==img_drag_list){

            activity_main.openDrawer(rl_left);
        }
    }

    /**
     * ViewPagerAdapter的内部类
     */
    class Vp_Adapter extends FragmentPagerAdapter {
        public Vp_Adapter(android.support.v4.app.FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int arg0) {
            return list.get(arg0);
        }

        @Override
        public int getCount() {
            return list.size();
        }

    }



}

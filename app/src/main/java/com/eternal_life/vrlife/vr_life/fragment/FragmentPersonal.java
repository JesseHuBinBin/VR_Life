package com.eternal_life.vrlife.vr_life.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eternal_life.vrlife.vr_life.R;

/**
 * Created by Huwenbin on 2017/5/3.
 */

public class FragmentPersonal extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_personal_center, null);
    }
}

package com.example.viet.firebasepracticalapplication.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.viet.firebasepracticalapplication.R;
import com.example.viet.firebasepracticalapplication.fragment.IntroducedFragment;

/**
 * Created by viet on 15/08/2017.
 */

public class IntroducedViewPagerAdapter extends FragmentPagerAdapter {
    public static final int COUNT = 3;

    public IntroducedViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return IntroducedFragment.newInstance(R.layout.fragment_introduced);
            case 1:
                return IntroducedFragment.newInstance(R.layout.fragment_introduced_2);
            case 2:
                return IntroducedFragment.newInstance(R.layout.fragment_introduced_3);
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return COUNT;
    }

//    @Override
//    public float getPageWidth(int position) {
//        switch (position) {
//            case 0:
//                return  0.8f;
//            case 1:
//                return 0.5f;
//            case 2:
//                return 0.8f;
//            default:
//                return 0;
//        }
//    }
}

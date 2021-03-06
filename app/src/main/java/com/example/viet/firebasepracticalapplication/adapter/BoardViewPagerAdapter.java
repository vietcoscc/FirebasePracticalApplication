package com.example.viet.firebasepracticalapplication.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.viet.firebasepracticalapplication.fragment.AddingFragment;
import com.example.viet.firebasepracticalapplication.activity.CardFragment;

/**
 * Created by viet on 17/08/2017.
 */

public class BoardViewPagerAdapter extends FragmentStatePagerAdapter {
    private int mCount = 4;

    public BoardViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == mCount - 1) {
            return AddingFragment.newInstance();
        } else {
            return CardFragment.newInstance();
        }
    }
    @Override
    public int getCount() {
        return mCount;
    }
}

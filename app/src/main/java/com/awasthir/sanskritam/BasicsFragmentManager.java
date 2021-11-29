package com.awasthir.sanskritam;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class BasicsFragmentManager extends FragmentPagerAdapter {

    Context mContext;
    public BasicsFragmentManager(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public int getCount() {
        return 2;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumeralsFragment();
        } else {
            return new ProverbsFragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.numerals);
        } else {
            return mContext.getString(R.string.proverbs);
        }
    }
}

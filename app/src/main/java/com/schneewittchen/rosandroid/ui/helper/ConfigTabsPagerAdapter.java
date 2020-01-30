package com.schneewittchen.rosandroid.ui.helper;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.schneewittchen.rosandroid.ui.fragments.WidgetDetailsFragment;
import com.schneewittchen.rosandroid.ui.fragments.GridFragment;
import com.schneewittchen.rosandroid.ui.fragments.MasterConfigFragment;

/**
 * TODO: Description
 *
 * @author Nico Studt
 * @version 1.0.1
 * @created on 10.01.20
 * @updated on 29.01.20
 * @modified by
 */
public class ConfigTabsPagerAdapter extends FragmentPagerAdapter {

    private String[] tabTitles = new String[]{"Master", "Viz", "Details"};


    public ConfigTabsPagerAdapter(@NonNull FragmentManager fm) {
        super(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return MasterConfigFragment.newInstance();
            case 1:
                return GridFragment.newInstance();
            case 2:
                return WidgetDetailsFragment.newInstance();

        }

        return new Fragment();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

}

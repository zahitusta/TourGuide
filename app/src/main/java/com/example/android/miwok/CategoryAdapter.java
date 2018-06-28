package com.example.android.miwok;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "Attractions", "Restaurants", "Cultural", "GiftShops"};

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new AttractionsFragment();
        } else if (position == 1){
            return new RestaurantsFragment();
        } else if (position == 2) {
            return new CulturalFragment();
        } else {
            return new GiftShopsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

}

package com.example.appproject;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class FoodItemAdapter {
    int tabCounts;

    public FoodItemAdapter(@NonNull FragmentManager fm, int tabCounts) {

        this.tabCounts = tabCounts;
    }

    @NonNull
    //@Override
    private Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FoodFragment();
            case 1:
                return new FoodFragment();
            case 2:
                return new FoodFragment();
            default:
                return null;
        }
    }

   // @Override
    public int getCount() {
        return tabCounts;
    }
}

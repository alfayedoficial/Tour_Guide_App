package com.alialfayed.tourguideapp.util;

import com.alialfayed.tourguideapp.MainActivity;
import com.alialfayed.tourguideapp.R;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

/**
 * Created by ( Eng Ali Al Fayed)
 * Class do :
 * Date 5/1/2020 - 5:41 PM
 */
public class MoveFragment {

    /**
     * loadHomeFragments
     *
     * @param mainActivity MainActivity
     * @param fragment     Fragment
     * addToBackStack to go back fragment
     */
    public static void loadFragment(MainActivity mainActivity, Fragment fragment,String title) {
        FragmentTransaction transaction = mainActivity.getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content_body, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
        mainActivity.getSupportActionBar().setTitle(title);
    }


}

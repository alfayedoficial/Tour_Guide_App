package com.alialfayed.tourguideapp;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.alialfayed.tourguideapp.util.MoveFragment;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.toolbar_Home)
    Toolbar toolbarHome;
    @BindView(R.id.content_body)
    ConstraintLayout contentBody;
    @BindView(R.id.nav_view)
    NavigationView navView;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ButterKnife Initialize
        ButterKnife.bind(this);

        // ToolBar initialize
        setTitle(getString(R.string.home_menu));
        setSupportActionBar(toolbarHome);

        // DrawerLayout initialize
        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this , drawerLayout ,toolbarHome
        , R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();

        // NavigationView initialize
        navView.setNavigationItemSelectedListener(this);
        onNavigationItemSelected(navView.getMenu().getItem(0).setChecked(true));

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        Fragment fragment;

        switch (id){

            case R.id.nav_TouristPlace:
                fragment = new RecyclersFragment(this , StoreData.storeDateTouristPlace(this));
                MoveFragment.loadFragment(this,fragment,getString(R.string.tourist_place_menu));
                break;

            case R.id.nav_Restaurant:
                fragment = new RecyclersFragment(this , StoreData.storeDateRestaurant(this));
                MoveFragment.loadFragment(this,fragment,getString(R.string.restaurant_menu));
                break;

            case R.id.nav_shopping:
                fragment = new RecyclersFragment(this , StoreData.storeDateShopping(this));
                MoveFragment.loadFragment(this,fragment,getString(R.string.restaurant_menu));
                break;

            case R.id.nav_Pharmacies:
                fragment = new RecyclersFragment(this , StoreData.storeDatePharmacies(this));
                MoveFragment.loadFragment(this,fragment,getString(R.string.restaurant_menu));
                break;

            default:
                fragment = new HomeFragment();
                MoveFragment.loadFragment(this,fragment,getString(R.string.home_menu) );
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}

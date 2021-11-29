package com.awasthir.sanskritam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class BasicsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics);

        // GET THE VIEWPAGER
        ViewPager viewPager = findViewById(R.id.view_pager);

        // MAKE A NEW CONSTRUCTOR OF BASICS FRAGMENT MANAGER
        BasicsFragmentManager adapter = new BasicsFragmentManager(
                BasicsActivity.this,
                getSupportFragmentManager());

        // SET THE FRAGMENT ADAPTER ON VIEWPAGER
        viewPager.setAdapter(adapter);

        // GET THE TABS LAYOUT
        TabLayout tabLayout = findViewById(R.id.tabs);

        // SETUP THE VIEWPAGER ON TAB LAYOUT
        tabLayout.setupWithViewPager(viewPager);
    }
}
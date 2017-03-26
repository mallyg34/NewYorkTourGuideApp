package com.example.android.newyorktourguideapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewpager = (ViewPager) findViewById(R.id.viewpager);

        SimpleFragmentPageAdapter adapter = new SimpleFragmentPageAdapter(this,getSupportFragmentManager());

        viewpager.setAdapter(adapter);

        TabLayout tabLayout= (TabLayout) findViewById(R.id.tablayout);

        tabLayout.setupWithViewPager(viewpager);
    }
}

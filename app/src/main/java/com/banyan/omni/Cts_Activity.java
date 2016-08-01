package com.banyan.omni;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import Animation.DepthPageTransformer;
import Fragments.Fragment_1;
import Fragments.Fragment_10;
import Fragments.Fragment_11;
import Fragments.Fragment_2;
import Fragments.Fragment_40;
import Fragments.Fragment_5;
import Fragments.Fragment_6;
import Fragments.Fragment_7;
import Fragments.Fragment_8;
import Fragments.Fragment_9;

import android.view.MotionEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.io.IOException;

public class Cts_Activity extends FragmentActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    static final int ITEMS = 1;
    MyAdapter mAdapter;
    ViewPager mPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cts);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        mAdapter = new MyAdapter(getSupportFragmentManager());
        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                return true;
            }
        });
        //ZoomOut Pager
        //mPager.setPageTransformer(true, new ZoomOutPageTransformer());

        //Depth Pager
        mPager.setPageTransformer(true, new DepthPageTransformer());

        mPager.setAdapter(mAdapter);

        //First and Last Button

       /* Button button = (Button) findViewById(R.id.first);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mPager.setCurrentItem(0);
            }
        });
        button = (Button) findViewById(R.id.last);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mPager.setCurrentItem(ITEMS - 1);
            }
        });*/

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public static class MyAdapter extends FragmentPagerAdapter {
        public MyAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public int getCount() {
            return ITEMS;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                /*case 0: // Fragment # 0 - This will show image
                    return Fragment_1.init(position);
                case 1: // Fragment # 1 - This will show image
                    return Fragment_2.init(position);
                case 2: // Fragment # 2 - This will show image
                    return Fragment_5.init(position);
                case 3: // Fragment # 3 - This will show image
                    return Fragment_6.init(position);
                case 4: // Fragment # 0 - This will show image
                    return Fragment_7.init(position);
                case 5: // Fragment # 1 - This will show image
                    return Fragment_8.init(position);
                case 6: // Fragment # 2 - This will show image
                    return Fragment_9.init(position);
                case 7: // Fragment # 3 - This will show image
                    return Fragment_10.init(position);
                case 8: // Fragment # 3 - This will show image
                    return Fragment_11.init(position);*/
                default:// Fragment # 2-9 - Will show list
                    return Fragment_40.init(position);
            }
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_CurONC) {
            // Handle the CurONC action
            Intent in = new Intent(this,Cur_Activity.class);
            startActivity(in);
        } else if (id == R.id.nav_ultr) {
            //Handle the Ultr Action
            Intent in = new Intent(this,Ultr_Activity.class);
            startActivity(in);

        } else if (id == R.id.nav_IBS) {
            // Handle the IBS/IBD action
            Intent in = new Intent(this,Ibs_Activity.class);
            startActivity(in);

        } else if (id == R.id.nav_psych) {
            // Handle the Phych action
            Intent in = new Intent(this,Psych_activity.class);
            startActivity(in);

        } else if (id == R.id.nav_neuro) {
            // Handle the Neuro action
            Intent in = new Intent(this,Neuro_Activity.class);
            startActivity(in);

        } else if (id == R.id.nav_eye) {
            // Handle the Eye action
            Intent in = new Intent(this,Eye_Activity.class);
            startActivity(in);

        } else if (id == R.id.nav_cpancr) {
            // Handle the C.Pacer action
            Intent in = new Intent(this,Cpancr_Activity.class);
            startActivity(in);

        } else if (id == R.id.nav_cts) {
            // Handle the CTS action

        } else if (id == R.id.nav_diabetes) {
            // Handle the Diabetes action
            Intent in = new Intent(this,Diabetes_Activity.class);
            startActivity(in);

        } else if (id == R.id.nav_video) {
            // Handle the Diabetes action
            Intent ie = new Intent(this,Video_Activity.class);
            startActivity(ie);

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}

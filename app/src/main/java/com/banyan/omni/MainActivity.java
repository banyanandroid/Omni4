package com.banyan.omni;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends FragmentActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    /*MyAdapter mAdapter;
    ViewPager mPager;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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
            Intent in = new Intent(MainActivity.this,Cur_Activity.class);
            startActivity(in);
        } else if (id == R.id.nav_ultr) {
            //Handle the Ultr Action
            Intent in = new Intent(MainActivity.this,Ultr_Activity.class);
            startActivity(in);

        } else if (id == R.id.nav_IBS) {
            // Handle the IBS/IBD action
            Intent in = new Intent(MainActivity.this,Ibs_Activity.class);
            startActivity(in);

        } else if (id == R.id.nav_psych) {
            // Handle the Phych action
            Intent in = new Intent(MainActivity.this,Psych_activity.class);
            startActivity(in);

        } else if (id == R.id.nav_neuro) {
            // Handle the Neuro action
            Intent in = new Intent(MainActivity.this,Neuro_Activity.class);
            startActivity(in);

        } else if (id == R.id.nav_eye) {
            // Handle the Eye action
            Intent in = new Intent(MainActivity.this,Eye_Activity.class);
            startActivity(in);

        } else if (id == R.id.nav_cpancr) {
            // Handle the C.Pacer action
            Intent in = new Intent(MainActivity.this,Cpancr_Activity.class);
            startActivity(in);

        } else if (id == R.id.nav_cts) {
            // Handle the CTS action
            Intent in = new Intent(MainActivity.this,Cts_Activity.class);
            startActivity(in);

        } else if (id == R.id.nav_diabetes) {
            // Handle the Diabetes action
            Intent in = new Intent(MainActivity.this,Diabetes_Activity.class);
            startActivity(in);

        } else if (id == R.id.nav_video) {
            // Handle the Diabetes action
            Intent ie = new Intent(MainActivity.this,Video_Activity.class);
            startActivity(ie);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}


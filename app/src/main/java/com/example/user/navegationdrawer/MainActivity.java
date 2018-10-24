package com.example.user.navegationdrawer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity


        implements NavigationView.OnNavigationItemSelectedListener {

    String url = "https://domiciliosvirtual.blogspot.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //PaginaWeb
        WebView web = (WebView) findViewById(R.id.web);
        web.setWebViewClient(new MainActivity.MyWebViewClient());
        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        web.loadUrl(url);






        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


      //***************************************************************************************
     // Menu desplegable
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.homeeee){

            Intent intenthomeee = new Intent(MainActivity.this, MainActivity.class );
            startActivity(intenthomeee);
            return true;
        }


        if(id == R.id.domiciliossss){

            Intent intenthomeee = new Intent(MainActivity.this, Main2Activity.class );
            startActivity(intenthomeee);
            return true;
        }

        if(id == R.id.videossss){

            Intent intenthomeee = new Intent(MainActivity.this, Main3Activity.class );
            startActivity(intenthomeee);
            return true;
        }

        if(id == R.id.contactossss){

            Intent intenthomeee = new Intent(MainActivity.this, Main4Activity.class );
            startActivity(intenthomeee);
            return true;
        }

        if(id == R.id.tutorialsss){

            Intent intenthomeee = new Intent(MainActivity.this, Main5Activity.class );
            startActivity(intenthomeee);
            return true;
        }


        if(id == R.id.descargasss){

            Intent intenthomeee = new Intent(MainActivity.this, Main6Activity.class );
            startActivity(intenthomeee);
            return true;
        }

        return true;

    }
//***************************************************************************************














    //PaginaWeb
    private class MyWebViewClient extends WebViewClient {

        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;

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





    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        FragmentManager fragmentManager = getSupportFragmentManager();

        if (id == R.id.nav_camera) {
            Intent Home = new Intent(this, MainActivity.class);
            startActivity(Home);


        } else if (id == R.id.nav_gallery) {
            Intent Domicilios = new Intent(this, Main2Activity.class);
            startActivity(Domicilios);

        } else if (id == R.id.nav_slideshow) {
            Intent Video = new Intent(this, Main3Activity.class);
            startActivity(Video);

        } else if (id == R.id.nav_manage) {
            Intent Contacto = new Intent(this, Main4Activity.class);
            startActivity(Contacto);

        } else if (id == R.id.nav_share) {
            Intent Tutorial = new Intent(this, Main5Activity.class);
            startActivity(Tutorial);

        } else if (id == R.id.nav_send) {
            Intent Descargas = new Intent(this, Main6Activity.class);
            startActivity(Descargas);

        }

        else if (id == R.id.nav_lms) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.moodle.moodlemobile"));
            startActivity(browserIntent);

        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }








}

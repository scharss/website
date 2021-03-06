package com.example.user.navegationdrawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main6Activity extends AppCompatActivity {
    String url6 = "https://domiciliosvirtual.blogspot.com/p/descargas.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        //PaginaWeb
        WebView web = (WebView) findViewById(R.id.web6);
        web.setWebViewClient(new Main6Activity.MyWebViewClient());
        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        web.loadUrl(url6);
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

            Intent intenthomeee = new Intent(Main6Activity.this, MainActivity.class );
            startActivity(intenthomeee);
            return true;
        }


        if(id == R.id.domiciliossss){

            Intent intenthomeee = new Intent(Main6Activity.this, Main2Activity.class );
            startActivity(intenthomeee);
            return true;
        }

        if(id == R.id.videossss){

            Intent intenthomeee = new Intent(Main6Activity.this, Main3Activity.class );
            startActivity(intenthomeee);
            return true;
        }

        if(id == R.id.contactossss){

            Intent intenthomeee = new Intent(Main6Activity.this, Main4Activity.class );
            startActivity(intenthomeee);
            return true;
        }

        if(id == R.id.tutorialsss){

            Intent intenthomeee = new Intent(Main6Activity.this, Main5Activity.class );
            startActivity(intenthomeee);
            return true;
        }


        if(id == R.id.descargasss){

            Intent intenthomeee = new Intent(Main6Activity.this, Main6Activity.class );
            startActivity(intenthomeee);
            return true;
        }

        return true;

    }
//***************************************************************************************









    private class MyWebViewClient extends WebViewClient {

        public boolean shouldOverrideUrlLoading(WebView view, String url6){
            view.loadUrl(url6);
            return true;

        }
    }
}

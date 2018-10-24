package com.example.user.navegationdrawer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
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

            Intent intenthomeee = new Intent(Main2Activity.this, MainActivity.class );
            startActivity(intenthomeee);
            return true;
        }


        if(id == R.id.domiciliossss){

            Intent intenthomeee = new Intent(Main2Activity.this, Main2Activity.class );
            startActivity(intenthomeee);
            return true;
        }

        if(id == R.id.videossss){

            Intent intenthomeee = new Intent(Main2Activity.this, Main3Activity.class );
            startActivity(intenthomeee);
            return true;
        }

        if(id == R.id.contactossss){

            Intent intenthomeee = new Intent(Main2Activity.this, Main4Activity.class );
            startActivity(intenthomeee);
            return true;
        }

        if(id == R.id.tutorialsss){

            Intent intenthomeee = new Intent(Main2Activity.this, Main5Activity.class );
            startActivity(intenthomeee);
            return true;
        }


        if(id == R.id.descargasss){

            Intent intenthomeee = new Intent(Main2Activity.this, Main6Activity.class );
            startActivity(intenthomeee);
            return true;
        }

        return true;

    }
//***************************************************************************************









    public void open(View view){

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ttienda.chatango.com/"));
        startActivity(browserIntent);
    }

}

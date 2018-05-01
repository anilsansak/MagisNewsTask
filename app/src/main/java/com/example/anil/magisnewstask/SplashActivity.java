package com.example.anil.magisnewstask;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    PrefManager prefManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

      prefManager = new PrefManager(this);
        if (!prefManager.isFirstTimeLaunch()) {
            launchHomeScreen();
            finish();
        } else {

            setContentView(R.layout.activity_splash);
            int SPLASH_TIME_OUT = 2000;
            new Handler().postDelayed(new Runnable() {


                @Override
                public void run() {

                    launchHomeScreen();
                }
            }, SPLASH_TIME_OUT);
        }


    }

    private void launchHomeScreen() {
        prefManager.setFirstTimeLaunch(false);
        Intent i = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(i);

        finish();
    }
}

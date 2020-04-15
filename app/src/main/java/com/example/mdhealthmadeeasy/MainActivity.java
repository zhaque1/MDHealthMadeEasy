package com.example.mdhealthmadeeasy;


import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    // Time limit for splash screen (2 secs)
    private static int SPLASH_SCREEN_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // make splash screen take up screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // connect activity to xml file
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //Intent is used to switch from one activity to another.
                Intent i=new Intent(MainActivity.this,
                        Login_Page.class);

                //invoke the SecondActivity.
                startActivity(i);

                //the current activity will get finished.
                finish();
            }
        }, SPLASH_SCREEN_TIME_OUT);

    }
}

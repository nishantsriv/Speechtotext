package com.example.nishant.login_screen;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 1000);

        TextView textView = (TextView) findViewById(R.id.company);
        Typeface typeFace = Typeface.createFromAsset(getAssets(), "fonts/baskerville.ttf");
        textView.setTypeface(typeFace);

        TextView txt = (TextView) findViewById(R.id.txtone);
        Typeface typeface2 = Typeface.createFromAsset(getAssets(), "fonts/lato.ttf");
        txt.setTypeface(typeface2);
    }
}

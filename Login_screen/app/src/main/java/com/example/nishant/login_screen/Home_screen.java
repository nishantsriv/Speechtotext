package com.example.nishant.login_screen;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home_screen extends AppCompatActivity {
    Button logout;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        logout = (Button) findViewById(R.id.logout);
        preferences = getSharedPreferences("Loginprefs", MODE_PRIVATE);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor perfeditor = preferences.edit();
                perfeditor.clear().commit();
                Intent i = new Intent(Home_screen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}

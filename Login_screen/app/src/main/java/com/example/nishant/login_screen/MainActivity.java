package com.example.nishant.login_screen;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.nishant.login_screen.R.id.userinfo;

public class MainActivity extends AppCompatActivity {
    SharedPreferences preferences;
    EditText username, password;
    Button login;
    boolean chk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(userinfo);
        password = (EditText) findViewById(R.id.passwordinfo);
        login = (Button) findViewById(R.id.login_btn);
        preferences = getSharedPreferences("Loginprefs", MODE_PRIVATE);

        if (chk == true) {
            homescreen();
        } else {
            Toast.makeText(this, "Enter credentials", Toast.LENGTH_SHORT).show();
        }

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (username.getText().toString().equals("user_illy") && password.getText().toString().equals("password")) {
                    SharedPreferences.Editor perfeditor = preferences.edit();
                    perfeditor.putBoolean("Success", true).commit();
                    boolean abc = preferences.getBoolean("Success", false);
                    Toast.makeText(MainActivity.this, "Value is" + abc, Toast.LENGTH_SHORT).show();
                    finish();
                    homescreen();
                } else {
                    Toast.makeText(MainActivity.this, "Wrong credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void homescreen() {
        Intent i = new Intent(this, Home_screen.class);
        startActivity(i);
        Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
    }

}
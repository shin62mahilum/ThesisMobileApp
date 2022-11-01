package com.example.thesismobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class userLogin extends AppCompatActivity {

    private Button btnLogin;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUserInterface();
            }
        });
    }

    public void  openUserInterface() {
        Intent intent = new Intent(this, userInterface.class);
        startActivity(intent);
    }
}
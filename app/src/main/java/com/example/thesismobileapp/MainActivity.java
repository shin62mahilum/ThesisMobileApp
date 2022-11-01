package com.example.thesismobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAdmin;
    private Button btnUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdmin = (Button) findViewById(R.id.btnAdmin);
        btnAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAdminLogin();
            }
        });

        btnUser = (Button) findViewById(R.id.btnUser);
        btnUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUserLogin();
            }
        });
    }

    public void openAdminLogin() {
        Intent intent = new Intent(this, adminLogin.class);
        startActivity(intent);
    }

    public void openUserLogin() {
        Intent intent = new Intent(this, userLogin.class);
        startActivity(intent);
    }
}
package com.example.thesismobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class userInterface extends AppCompatActivity {

    private Button btnBuilding1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_interface);

        btnBuilding1 = (Button) findViewById(R.id.btnBuilding1);
        btnBuilding1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBuilding1();
            }
        });
    }

    public void openBuilding1() {
        Intent intent = new Intent(this, Building1Rooms.class);
        startActivity(intent);
    }
}
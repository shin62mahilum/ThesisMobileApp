package com.example.thesismobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Building1Rooms extends AppCompatActivity {

    private Button btnRoom11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building1_rooms);

        btnRoom11 = (Button) findViewById(R.id.btnRoom11);
        btnRoom11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRoom11();
            }
        });

    }

    public void openRoom11() {
        Intent intent = new Intent(this, Room11.class);
        startActivity(intent);
    }

}
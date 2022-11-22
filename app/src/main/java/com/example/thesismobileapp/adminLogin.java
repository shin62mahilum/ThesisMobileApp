package com.example.thesismobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class adminLogin extends AppCompatActivity {

    private Button btnLogin;
    private EditText UserName;
    private EditText Password;

    String correct_userName = "admin";
    String correct_passWord = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login2);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        UserName = (EditText) findViewById(R.id.UserNameEditTxt);
        Password = (EditText) findViewById(R.id.PasswordEditTxt);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(UserName.getText().toString()) || TextUtils.isEmpty(Password.getText().toString())){
                    Toast.makeText(adminLogin.this, "Empty data provided", Toast.LENGTH_LONG).show();
                }else if(UserName.getText().toString().equals(correct_userName)){
                    if(Password.getText().toString().equals(correct_passWord)){
                        Toast.makeText(adminLogin.this, "Successfully logged in", Toast.LENGTH_LONG).show();
                        openAdminInterface();
                    }
                }else{
                    Toast.makeText(adminLogin.this, "Invalid username/password", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void  openAdminInterface() {
        Intent intent = new Intent(this, adminInterface.class);
        startActivity(intent);
    }
}
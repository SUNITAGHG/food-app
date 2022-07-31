package com.example.appproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class RegistartionActivity extends AppCompatActivity {
    TextInputEditText firstName;
    TextInputEditText email;
    TextInputEditText phone;
    TextInputEditText password;
    TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registartion);
        firstName = findViewById(R.id.name_txt);
        phone = findViewById(R.id.phone_txt);
        password = findViewById(R.id.password_txt);
        email = findViewById(R.id.email_txt);
        register = findViewById(R.id.register_btn);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(RegistartionActivity.this,LoginActivity.class);
                startActivity(intent);

            }
        });
    }
}
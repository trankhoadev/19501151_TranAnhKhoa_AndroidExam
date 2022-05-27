package com.example.a19501151_trananhkhoa_androidexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListBussinessScreen extends AppCompatActivity {

    private View btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_bussiness_screen);

        btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(v -> {
            startActivity(new Intent(ListBussinessScreen.this, Bussiness.class));
        });
    }
}
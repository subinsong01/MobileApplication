package com.shushub.a05_09_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class sub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_sub);

        TextView textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        String strName = intent.getStringExtra("name");
    }
}

package com.shushub.a05_09;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private TextView displayIdTextView, displayPasswordTextView, statusTextView;
    Button loginCheckBtn;
    String id, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        displayIdTextView = findViewById(R.id.displayIdTextView);
        displayPasswordTextView = findViewById(R.id.displayPasswordTextView);
        statusTextView = findViewById(R.id.loginSuccess);
        loginCheckBtn = findViewById(R.id.loginCheckButton);
        Intent intent = getIntent();
        if (intent != null) {
            id = intent.getStringExtra("ID");
            password = intent.getStringExtra("Password");
            displayIdTextView.setText("아이디: " + id);
            displayPasswordTextView.setText("비밀번호: " + password);
        }
        loginCheckBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (id.equals("kim") && password.equals("1234")) {
                    intent.putExtra("status", "로그인 성공!!!!");
                } else {
                    intent.putExtra("status", "로그인 실패!!!!");
                }
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
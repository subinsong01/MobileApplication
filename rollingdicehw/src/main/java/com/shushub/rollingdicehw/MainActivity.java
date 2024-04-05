package com.shushub.rollingdicehw;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.imageView1);
        ImageView imageView2 = findViewById(R.id.imageView2);
        Button button = findViewById(R.id.Btn1);

        TextView textView = findViewById(R.id.textResult); // textResult TextView

        button.setOnClickListener(new View.OnClickListener() { //주사위 1번
            @Override
            public void onClick(View v) {
                int r1 = (int) (Math.random() * 6) + 1; // 1부터 6까지의 랜덤 숫자
                textView.setText("주사위 1 : " + r1); // textResult TextView에 결과 표시
                int drawableResource = getResources().getIdentifier("dice" + r1, "drawable", getPackageName());
                imageView.setImageResource(drawableResource);

                int r2 = (int) (Math.random() * 6) + 1; // 1부터 6까지의 랜덤 숫자
                int drawableResource2 = getResources().getIdentifier("dice" + r2, "drawable", getPackageName());
                imageView2.setImageResource(drawableResource2);

                // 결과 출력
                textView.setText("주사위 1 숫자: " + r1 + "\n주사위 2 숫자 : " + r2);
            }

        });

    }
}



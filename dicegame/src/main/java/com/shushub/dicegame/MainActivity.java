package com.shushub.dicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.imageView);
        Button button = (Button) findViewById(R.id.diceBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int r = (int) (Math.random() * 6);
                if (r == 0) imageView.setImageResource(R.drawable.dice1);
                else if (r == 1) imageView.setImageResource(R.drawable.dice2);
                else if (r == 2) imageView.setImageResource(R.drawable.dice3);
                else if (r == 3) imageView.setImageResource(R.drawable.dice4);
                else if (r == 4) imageView.setImageResource(R.drawable.dice5);
                else imageView.setImageResource(R.drawable.dice6);

            }
        });
    }
}



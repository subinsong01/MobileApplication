package com.shushub.a04_11_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1, tv2, tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.view1);
        tv2 = findViewById(R.id.view2);
        tv3 = findViewById(R.id.view3);
    }
    public void onClick(View view){
        tv1.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        int itemId = view.getId();
        if(itemId==R.id.button1){
            tv1.setVisibility(View.VISIBLE);
        }else if(itemId == R.id.button2){
            tv2.setVisibility(View.VISIBLE);
        }else if(itemId == R.id.button3) {
            tv3.setVisibility(View.VISIBLE);
        }
    }
}
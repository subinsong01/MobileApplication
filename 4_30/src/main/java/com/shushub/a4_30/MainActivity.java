package com.shushub.a4_30;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.layout);
    }

    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton)view).isChecked(); //isChecked()부분이 중요 ** !!
        if(view.getId()==R.id.radio_red){
            if(checked){
                layout.setBackgroundColor(Color.RED);
            }
        }else if(view.getId()==R.id.radio_blue){
            if(checked){
                layout.setBackgroundColor(Color.BLUE);
            }
        }
    }
}

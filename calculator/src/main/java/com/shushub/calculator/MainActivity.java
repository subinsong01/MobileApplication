package com.shushub.calculator;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnAddClicked(View view) {
        calculate('+');
    }

    public void btnMinusClicked(View view) {
        calculate('-');
    }

    public void btnMultiplyClicked(View view) {
        calculate('*');
    }

    public void btnDivideClicked(View view) {
        calculate('/');
    }

    public void btnClearClicked(View view) {
        EditText editTextNum1 = findViewById(R.id.activity_main__editTextNum1);
        EditText editTextNum2 = findViewById(R.id.activity_main__editTextNum2);
        TextView textViewRs = findViewById(R.id.activity_main_textViewRs);

        editTextNum1.setText("");
        editTextNum2.setText("");
        textViewRs.setText("");
    } // Clear 버튼

    void calculate(char operator) {
        EditText editTextNum1 = findViewById(R.id.activity_main__editTextNum1);
        EditText editTextNum2 = findViewById(R.id.activity_main__editTextNum2);
        TextView textViewRs = findViewById(R.id.activity_main_textViewRs);

        editTextNum1.setText(editTextNum1.getText().toString().trim()); // Remove whitespace
        editTextNum2.setText(editTextNum2.getText().toString().trim()); // Remove whitespace

        if (editTextNum1.getText().toString().isEmpty()) {
            toastMsg("Enter Number 1");
            editTextNum1.requestFocus();
            return;
        }

        if (editTextNum2.getText().toString().isEmpty()) {
            toastMsg("Enter Number 2");
            editTextNum2.requestFocus();
            return;
        }

        int num1 = Integer.parseInt(editTextNum1.getText().toString());
        int num2 = Integer.parseInt(editTextNum2.getText().toString());
        double rs = 0;

        switch (operator) {
            case '+':
                rs = num1 + num2;
                textViewRs.setText("결과 : " + rs);
                break;
            case '-':
                rs = num1 - num2;
                textViewRs.setText("결과 : " + rs);
                break;
            case '*':
                rs = num1 * num2;
                textViewRs.setText("결과 : " + rs);
                break;
            case '/':
                if (num2 != 0) {
                    rs = (double)num1 / num2;
                    textViewRs.setText("결과 : " + String.format("%.2f", (double)rs));
                } else {
                    toastMsg("Cannot divide by zero");
                }
                break;
        }
    }

    void toastMsg(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
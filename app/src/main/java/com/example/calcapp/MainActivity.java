package com.example.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText eText1, eText2;
    TextView myTextView;
    Button myButton1, myButton2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eText1 = findViewById(R.id.textV);
        eText2 = findViewById(R.id.textV2);
        myButton1 = findViewById(R.id.add);
        myButton2 = findViewById(R.id.subtract);
        myTextView = findViewById(R.id.answer);



    }
    public void solution(View view) {

        double num1 = Double.parseDouble(eText1.getText().toString());
        double num2 = Double.parseDouble(eText2.getText().toString());
        double sum = num1 + num2;
        double subtract = num1 - num2;

        int id = view.getId();
        if (id == R.id.add) {
            myTextView.setText(Double.toString(sum));
        } else if (id == R.id.subtract) {
            myTextView.setText(Double.toString(subtract));

        }
    }
    public boolean checker () {
        String check1 = eText1.getText().toString();
        String check2 = eText2.getText().toString();

        if ((check2.equals("")) || (check1.equals("")) || (check2.equals("-")) || (check1.equals("-")) || (check2.equals("+")) || (check1.equals("+"))) {
            myTextView.setText("Please you have to enter a number in the box");
            return true;

        }
        return false;
    }


}




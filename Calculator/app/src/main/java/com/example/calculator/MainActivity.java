package com.example.calculator;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView result_textView, input_textView;
    MaterialButton buttonC, button_division,button_multiplication,button_equals,button_addition,button_subtraction;
    MaterialButton button0, button1, button2, button3, button4, button5,button6,button7,button8,button9;

    // assign button to value function
    void assignId(MaterialButton button,int id ){
        button = findViewById(id);
        button.setOnClickListener(this);
    }

    // assign buttons to xml keys
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result_textView = findViewById(R.id.result_text_view);
        input_textView = findViewById(R.id.input_text_view);

        assignId(button_addition,R.id.button_addition);
        assignId(button_subtraction,R.id.button_subtraction);
        assignId(button_division,R.id.button_division);
        assignId(button_multiplication,R.id.button_multiplication);
        assignId(button_equals,R.id.button_equals);
        assignId(button0,R.id.button_0);
        assignId(button1,R.id.button_1);
        assignId(button2,R.id.button_2);
        assignId(button3,R.id.button_3);
        assignId(button4,R.id.button_4);
        assignId(button5,R.id.button_5);
        assignId(button6,R.id.button_6);
        assignId(button7,R.id.button_7);
        assignId(button8,R.id.button_8);
        assignId(button9,R.id.button_9);
        assignId(buttonC, R.id.button_clear);
    }

    @Override
    public void onClick(View v) {
        MaterialButton button = (MaterialButton) v;
        String buttonText = button.getText().toString();
        String input_value = input_textView.getText().toString();

        // select "C" to delete characters
        if (buttonText.equals("C")) {
            input_value = input_value.substring(0,input_value.length()-1);
        }else {
            input_value = input_value+buttonText;
        }
        input_textView.setText(input_value);


    }
}
